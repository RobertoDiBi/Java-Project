/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author 1796174
 */
class RecordNotFoundException extends SQLException {

    public RecordNotFoundException() {
    }

    public RecordNotFoundException(String msg) {
        super(msg);
    }

    public RecordNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

public class Database {

    private static final String URL = "jdbc:sqlserver://movietickets.database.windows.net:1433;databaseName=movieTickets;user=dbadmin;password=Root12345";
    Connection conn = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Database() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            // exception chaining
            throw new SQLException("Driver not found", ex);
        }
        conn = DriverManager.getConnection(URL);
    }

    public void addUser(User user) throws SQLException {
        String sql = "INSERT INTO users (firstName, lastName, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql);) {
            statement.setString(1, user.firstName);
            statement.setString(2, user.lastName);
            statement.setString(3, user.email);
            statement.setString(4, user.password);
            statement.executeUpdate();
        }
    }

    public ArrayList<User> loadUsers() throws SQLException {
        String sql = "SELECT * FROM users";
        ArrayList<User> list = new ArrayList<>();
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql);) {
            while (rs.next()) {
                long id = rs.getLong("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String email = rs.getString("email");
                String password = rs.getString("password");
                User u = new User(id, firstName, lastName, email, password);
                list.add(u);
            }
        }
        return list;
    }

    public void deleteUser(User user) throws SQLException {
        String sql = "DELETE from users where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setLong(1, user.id);
        statement.executeUpdate();
    }

    public void loadMovieList(ArrayList<JSONObject> movies) throws SQLException, JSONException, IOException {
        for (JSONObject o : movies) {
            long id = o.getLong("id");
            String title = o.getString("title");
            String language = o.getString("original_language");
            String overview = o.getString("overview");
            String posterPic = "https://image.tmdb.org/t/p/original/" + o.getString("poster_path");
            String releaseDateString = o.getString("release_date");
            java.util.Date date;
            java.sql.Date releaseDate;
            try {
                date = dateFormat.parse(releaseDateString);
                releaseDate = new java.sql.Date(date.getTime());
            } catch (ParseException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }

            // Delete everything from the temporary movies table
            String sql = "DELETE FROM tempMovies";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();

            // Insert the api data into a temporary movies table.
            sql = "INSERT INTO tempMovies VALUES (?, ?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setLong(1, id);
            statement.setString(2, title);
            statement.setString(3, language);
            statement.setString(4, overview);
            statement.setDate(5, releaseDate);
            statement.setString(6, posterPic);
            statement.executeUpdate();

            // Insert into the movies table only movies that are not already there.
            sql = "INSERT INTO movies SELECT * FROM tempMovies WHERE tempMovies.id NOT IN (SELECT id from movies)";
            statement = conn.prepareStatement(sql);
            statement.executeUpdate();
        }
    }

    public Movie getMovieById(long id) throws SQLException {
        String sql = "SELECT * FROM movies WHERE id=" + id;

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                String title = result.getString("title");
                String language = result.getString("language");
                String overview = result.getString("overview");
                Date releaseDate = result.getDate("releaseDate");
                String posterImage = result.getString("posterPic");

                Movie movie = new Movie(id, title, language, overview, releaseDate, posterImage);
                return movie;

            } else {
                throw new SQLException("Record not found");
            }
        }
    }

    public Cinema getCinemaById(long id) throws SQLException {
        String sql = "SELECT * FROM cinemas WHERE id=" + id;

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                String name = result.getString("name");
                String address = result.getString("address");
                Cinema cinema = new Cinema(id, name, address);
                return cinema;
            } else {
                throw new SQLException("Record not found");
            }
        }
    }

    //Create a getAllShowTimeById to get all showtimes related to the selectded movie for a selected date
    public ArrayList<Showtime> getAllShowTimeById(long cinemaId, long movieId, Date date) throws SQLException {
        String sql = "SELECT id,cinemaId,movieId,date, "
                + "REPLACE(REPLACE(RIGHT('0'+LTRIM(RIGHT(CONVERT(VARCHAR(20),time,100),7)),7),'AM',' AM'),'PM',' PM') as time, "
                + "maxCapacity FROM showtimes WHERE cinemaId="
                + cinemaId + " AND movieId=" + movieId + " AND date='" + date + "' ORDER BY time";
        ArrayList<Showtime> list = new ArrayList<>();
        Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                long id = result.getLong("id");
                long cinema = result.getLong("cinemaId");
                long movie = result.getLong("movieId");
                Date date2 = result.getDate("date");
                String time = result.getString("time");
                long maxCapacity = result.getLong("maxCapacity");
                Showtime showtime = new Showtime(id, cinema, movie, date2, time, maxCapacity);
                list.add(showtime);
            }
        return list;
    }
    
    public Showtime getSpecificShowTime(long cinemaId, long movieId, Date date, String time) throws SQLException {
        String sql = "SELECT id,cinemaId,movieId,date, "
                + "REPLACE(REPLACE(RIGHT('0'+LTRIM(RIGHT(CONVERT(VARCHAR(20),time,100),7)),7),'AM',' AM'),'PM',' PM') as time, "
                + "maxCapacity FROM showtimes WHERE cinemaId="
                + cinemaId + " AND movieId=" + movieId + " AND date='" + date + "' AND time='"+time+"'";

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                long id = result.getLong("id");
                long cinema = result.getLong("cinemaId");
                long movie = result.getLong("movieId");
                Date date2 = result.getDate("date");
                String time2 = result.getString("time");
                long maxCapacity = result.getLong("maxCapacity");
                Showtime showtime = new Showtime(id, cinema, movie, date2, time2, maxCapacity);
                return showtime;
            } else {
                throw new SQLException("Record not found");
            }
        }
    }

    public ArrayList<Movie> getAllMovies() throws SQLException {
        String sql = "SELECT * FROM movies";
        ArrayList<Movie> list = new ArrayList<>();

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                long id = result.getLong("id");
                String title = result.getString("title");
                String language = result.getString("language");
                String overview = result.getString("overview");
                Date releaseDate = result.getDate("releaseDate");
                String posterImage = result.getString("posterPic");
                Movie movie = new Movie(id, title, language, overview, releaseDate, posterImage);
                list.add(movie);
            }
        }
        return list;
    }

    public ArrayList<Showtime> getAllShowTime() throws SQLException {
        String sql = "SELECT id,cinemaId,movieId,date, "
                + "REPLACE(REPLACE(RIGHT('0'+LTRIM(RIGHT(CONVERT(VARCHAR(20),time,100),7)),7),'AM',' AM'),'PM',' PM') as time, "
                + "maxCapacity FROM showtimes Order by movieId";
        ArrayList<Showtime> list = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                long id = result.getLong("id");
                long cinema = result.getLong("cinemaId");
                long movie = result.getLong("movieId");
                Date date2 = result.getDate("date");
                String time = result.getString("time");
                long maxCapacity = result.getLong("maxCapacity");
                Showtime showtime = new Showtime(id, cinema, movie, date2, time, maxCapacity);
                list.add(showtime);
            }
        }
        return list;
    }

    public void addShowtime(Showtime showtime) throws SQLException {
        String sql = "INSERT INTO showtimes VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setLong(1, showtime.getCinemaId());
        statement.setLong(2, showtime.getMovieId());
        statement.setDate(3, showtime.getDate());
        statement.setString(4, showtime.getTime());
        statement.setLong(5, showtime.getMaxCapacity());
        statement.execute();
    }

    public void deleteShowtime(long id) throws SQLException {
        String sql = "DELETE FROM showtimes Where id=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setLong(1, id);
        statement.execute();
    }

    public void updateShowtime(Showtime showtime) throws SQLException {
		String sql = "UPDATE showtimes SET cinemaId = ?, movieId = ?, date = ?, time = ?, maxCapacity = ? WHERE id= ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setLong(1, showtime.getCinemaId());
        statement.setLong(2, showtime.getMovieId());
        statement.setDate(3, showtime.getDate());
        statement.setString(4, showtime.getTime());
        statement.setLong(5, showtime.getMaxCapacity());
		statement.setLong(6, showtime.getId());
        statement.executeUpdate();
    }
    
    public ArrayList<SeatBooked> getAllBookedSeats(long movieId, Date date, String time) throws SQLException{
        String sql = "SELECT id,userId,movieId,seatId,date,REPLACE(REPLACE(RIGHT('0'+LTRIM(RIGHT(CONVERT(VARCHAR(20),time,100),7)),7),'AM',' AM'),'PM',' PM') as time FROM seatsBooked WHERE movieId="+movieId +"AND date='"+ date + "'AND time = '" + time+"'";
        ArrayList<SeatBooked> list = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                long id = result.getLong("id");
                long user = result.getLong("userId");
                long movie = result.getLong("movieId");
                long seatBooked = result.getLong("seatId");
                Date date2 = result.getDate("date");
                String showtime = result.getString("time");
                SeatBooked seat = new SeatBooked(id, user, movie, seatBooked, date2, showtime);
                list.add(seat);
            }
        }
        return list;
    }
    
    public void addBookedSeat(SeatBooked show) throws SQLException {
        String sql = "INSERT INTO seatsBooked VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setLong(1, show.getUserId());
        statement.setLong(2, show.getMovieId());
        statement.setLong(3, show.getSeatId());
        statement.setDate(4, show.getDate());
        statement.setString(5, show.getShowtime());
        statement.execute();
    }
    
    public void addPurchase(Purchase p) throws SQLException {
        String sql = "INSERT INTO purchases VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setLong(1, p.getUserId());
        statement.setLong(2, p.getShowtimeId());
        statement.setDate(3, p.getPurchaseDate());
        statement.setLong(4, p.getNumberOfTickets());
        statement.setBigDecimal(5, p.getTotalPrice());
        statement.execute();
    }
    
}

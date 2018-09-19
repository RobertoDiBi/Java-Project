/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.sql.Date;

/**
 *
 * @author robertodibiase
 */
public class SeatBooked {

    private long id;
    private long userId;
    private long movieId;
    private long seatId;
    private Date date;
    private String showtime;
    private String seatRow;

    public SeatBooked(long id, long userId, long movieId,long seatId, Date date, String showtime) {
        setId(id);
        setUserId(userId);
        setMovieId(movieId);
        setSeatId(seatId);
        setDate(date);
        setShowtime(showtime);
    }
    
    public SeatBooked(long userId, long movieId,long seatId, Date date, String showtime) {
        setId(id);
        setUserId(userId);
        setMovieId(movieId);
        setSeatId(seatId);
        setDate(date);
        setShowtime(showtime);
    }
    
    

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public final void setId(long id) {
        this.id = id;
    }

    /**
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public final void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * @return the movieId
     */
    public long getMovieId() {
        return movieId;
    }

    /**
     * @param movieId the movieId to set
     */
    public final void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public final void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the showtime
     */
    public String getShowtime() {
        return showtime;
    }

    /**
     * @param showtime the showtime to set
     */
    public final void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    /**
     * @return the seatId
     */
    public long getSeatId() {
        return seatId;
    }

    /**
     * @param seatId the seatId to set
     */
    public final void setSeatId(long seatId) {
        this.seatId = seatId;
    }

    /**
     * @return the seatRow
     */
    public String getSeatRow() {
        return seatRow;
    }

    /**
     * @param seatRow the seatRow to set
     */
    public void setSeatRow() {
        
        switch ((int)this.seatId){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                this.seatRow = "A";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                this.seatRow = "B";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                this.seatRow = "C";
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                this.seatRow = "D";
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                this.seatRow = "E";
                break;
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                this.seatRow = "F";
                break;
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                this.seatRow = "G";
                break;
            case 79:
            case 80:    
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                this.seatRow = "H";
                break;
        }
        
    }

}

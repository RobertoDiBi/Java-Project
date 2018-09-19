package ipd12.movieticketing;

import java.util.ArrayList;

public class Globals {

    static User currentUser;
    static Database db;
    static ArrayList<User> users;
    static boolean userLogged = false;
    static long movieId;
    static final long CINEMA_ID = 1;//For now it's a constant since we have only one cinema
    static String adminPass = "Root12345";
    static double totalPrice;
    static int totalTickets;
    static MovieListGUI movieGUI;
    static double childTicketPrice = 6.50;
    static double generalTicketPrice = 9.50;
    static double seniorTicketPrice = 7.50;
}

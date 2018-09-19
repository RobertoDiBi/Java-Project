/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;

/**
 *
 * @author Brandon
 */
public class MovieCellComponent extends JPanel {

    MovieWithPic movie;

    JButton btBuyTickets;
    JLabel title;
    JLabel poster;
    JSeparator sep;
    Font font;

    public MovieCellComponent() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        btBuyTickets = new JButton("Buy tickets") {
            {
                setSize(200, 30);
                setMaximumSize(getSize());
            }
        };
        btBuyTickets.setAlignmentX(Component.CENTER_ALIGNMENT);

        title = new JLabel();
        poster = new JLabel();
        sep = new JSeparator();
        font = poster.getFont();

        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font(font.getName(), Font.BOLD, 18));
        poster.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(title);
        add(poster);
        add(btBuyTickets);
        add(sep);
    }

    public void updateData(MovieWithPic movie, boolean isSelected, JTable table) {
        this.movie = movie;

        title.setText(movie.getTitle());
        poster.setIcon(movie.getPosterImage());

        ActionListener[] listeners = btBuyTickets.getActionListeners();
        for (ActionListener l : listeners) {
            btBuyTickets.removeActionListener(l);
        }

        btBuyTickets.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (!Globals.userLogged) {
                    Object[] options
                            = {
                                "Log in", "Register", "Cancel"
                            };
                    int decision = JOptionPane.showOptionDialog(null,
                            "You need to log in before buying tickets. Please log in or register for an account.",
                            "User not logged in",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null, //do not use a custom Icon
                            options, //the titles of buttons
                            options[0]); //default button title
                    if (decision == JOptionPane.YES_OPTION) {
                        MovieListGUI movieGUI = new MovieListGUI(false);
                        Frame[] allFrames = Frame.getFrames();
                        for (Frame f : allFrames) {
                            String fName = f.getClass().getName();

                            if (fName.equals("MovieListGUI")) {
                                movieGUI = (MovieListGUI) f;
                            }
                        }

                        DlgLogin dlgLogin = new DlgLogin(movieGUI, true);
                        dlgLogin.pack();
                        dlgLogin.setVisible(true);
                    } else if (decision == JOptionPane.NO_OPTION) {
                        DlgRegister dlgRegister = new DlgRegister(null, true);
                        dlgRegister.pack();
                        dlgRegister.setVisible(true);
                    }
                    return;
                }
                Globals.movieId = movie.getId();
                new TicketReservationGUI().setVisible(true);
            }
        });
    }
}

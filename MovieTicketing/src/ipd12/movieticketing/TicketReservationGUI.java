package ipd12.movieticketing;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.border.Border;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author robertodibiase
 */
public class TicketReservationGUI extends javax.swing.JFrame {

    /**
     * Creates new form TicketReservationGUI
     */
    //Declaring variables to be used by all form and dialogs
    Database db;
    long TICKET_LIMIT = 8;
    long seatSelected = 0;
    ArrayList<SeatBooked> seats;
    boolean printCheck = false;
    boolean doneLoading = false;
    int maxCapacity = 90;

    public TicketReservationGUI() {
        //Connecting to database
        try {
            initComponents();
            db = new Database();
            loadInformations();
            taOverview.setCaretPosition(0);
            myActionListener seatSelect = new myActionListener();
            BookSeats_tgbSeat1.addActionListener(seatSelect);
            BookSeats_tgbSeat2.addActionListener(seatSelect);
            BookSeats_tgbSeat3.addActionListener(seatSelect);
            BookSeats_tgbSeat4.addActionListener(seatSelect);
            BookSeats_tgbSeat5.addActionListener(seatSelect);
            BookSeats_tgbSeat6.addActionListener(seatSelect);
            BookSeats_tgbSeat7.addActionListener(seatSelect);
            BookSeats_tgbSeat8.addActionListener(seatSelect);
            BookSeats_tgbSeat9.addActionListener(seatSelect);
            BookSeats_tgbSeat10.addActionListener(seatSelect);
            BookSeats_tgbSeat11.addActionListener(seatSelect);
            BookSeats_tgbSeat12.addActionListener(seatSelect);
            BookSeats_tgbSeat13.addActionListener(seatSelect);
            BookSeats_tgbSeat14.addActionListener(seatSelect);
            BookSeats_tgbSeat15.addActionListener(seatSelect);
            BookSeats_tgbSeat16.addActionListener(seatSelect);
            BookSeats_tgbSeat17.addActionListener(seatSelect);
            BookSeats_tgbSeat18.addActionListener(seatSelect);
            BookSeats_tgbSeat19.addActionListener(seatSelect);
            BookSeats_tgbSeat20.addActionListener(seatSelect);
            BookSeats_tgbSeat21.addActionListener(seatSelect);
            BookSeats_tgbSeat22.addActionListener(seatSelect);
            BookSeats_tgbSeat23.addActionListener(seatSelect);
            BookSeats_tgbSeat24.addActionListener(seatSelect);
            BookSeats_tgbSeat25.addActionListener(seatSelect);
            BookSeats_tgbSeat26.addActionListener(seatSelect);
            BookSeats_tgbSeat27.addActionListener(seatSelect);
            BookSeats_tgbSeat28.addActionListener(seatSelect);
            BookSeats_tgbSeat29.addActionListener(seatSelect);
            BookSeats_tgbSeat30.addActionListener(seatSelect);
            BookSeats_tgbSeat31.addActionListener(seatSelect);
            BookSeats_tgbSeat32.addActionListener(seatSelect);
            BookSeats_tgbSeat33.addActionListener(seatSelect);
            BookSeats_tgbSeat34.addActionListener(seatSelect);
            BookSeats_tgbSeat35.addActionListener(seatSelect);
            BookSeats_tgbSeat36.addActionListener(seatSelect);
            BookSeats_tgbSeat37.addActionListener(seatSelect);
            BookSeats_tgbSeat38.addActionListener(seatSelect);
            BookSeats_tgbSeat39.addActionListener(seatSelect);
            BookSeats_tgbSeat40.addActionListener(seatSelect);
            BookSeats_tgbSeat41.addActionListener(seatSelect);
            BookSeats_tgbSeat42.addActionListener(seatSelect);
            BookSeats_tgbSeat43.addActionListener(seatSelect);
            BookSeats_tgbSeat44.addActionListener(seatSelect);
            BookSeats_tgbSeat45.addActionListener(seatSelect);
            BookSeats_tgbSeat46.addActionListener(seatSelect);
            BookSeats_tgbSeat47.addActionListener(seatSelect);
            BookSeats_tgbSeat48.addActionListener(seatSelect);
            BookSeats_tgbSeat49.addActionListener(seatSelect);
            BookSeats_tgbSeat50.addActionListener(seatSelect);
            BookSeats_tgbSeat51.addActionListener(seatSelect);
            BookSeats_tgbSeat52.addActionListener(seatSelect);
            BookSeats_tgbSeat53.addActionListener(seatSelect);
            BookSeats_tgbSeat54.addActionListener(seatSelect);
            BookSeats_tgbSeat55.addActionListener(seatSelect);
            BookSeats_tgbSeat56.addActionListener(seatSelect);
            BookSeats_tgbSeat57.addActionListener(seatSelect);
            BookSeats_tgbSeat58.addActionListener(seatSelect);
            BookSeats_tgbSeat59.addActionListener(seatSelect);
            BookSeats_tgbSeat60.addActionListener(seatSelect);
            BookSeats_tgbSeat61.addActionListener(seatSelect);
            BookSeats_tgbSeat62.addActionListener(seatSelect);
            BookSeats_tgbSeat63.addActionListener(seatSelect);
            BookSeats_tgbSeat64.addActionListener(seatSelect);
            BookSeats_tgbSeat65.addActionListener(seatSelect);
            BookSeats_tgbSeat66.addActionListener(seatSelect);
            BookSeats_tgbSeat67.addActionListener(seatSelect);
            BookSeats_tgbSeat68.addActionListener(seatSelect);
            BookSeats_tgbSeat69.addActionListener(seatSelect);
            BookSeats_tgbSeat70.addActionListener(seatSelect);
            BookSeats_tgbSeat71.addActionListener(seatSelect);
            BookSeats_tgbSeat72.addActionListener(seatSelect);
            BookSeats_tgbSeat73.addActionListener(seatSelect);
            BookSeats_tgbSeat74.addActionListener(seatSelect);
            BookSeats_tgbSeat75.addActionListener(seatSelect);
            BookSeats_tgbSeat76.addActionListener(seatSelect);
            BookSeats_tgbSeat77.addActionListener(seatSelect);
            BookSeats_tgbSeat78.addActionListener(seatSelect);
            BookSeats_tgbSeat79.addActionListener(seatSelect);
            BookSeats_tgbSeat80.addActionListener(seatSelect);
            BookSeats_tgbSeat81.addActionListener(seatSelect);
            BookSeats_tgbSeat82.addActionListener(seatSelect);
            BookSeats_tgbSeat83.addActionListener(seatSelect);
            BookSeats_tgbSeat84.addActionListener(seatSelect);
            BookSeats_tgbSeat85.addActionListener(seatSelect);
            BookSeats_tgbSeat86.addActionListener(seatSelect);
            BookSeats_tgbSeat87.addActionListener(seatSelect);
            BookSeats_tgbSeat88.addActionListener(seatSelect);
            BookSeats_tgbSeat89.addActionListener(seatSelect);
            BookSeats_tgbSeat90.addActionListener(seatSelect);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error connecting to database:\n" + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    class myActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JToggleButton myButton = (JToggleButton) e.getSource();
            if (myButton.isSelected()) {
                seatSelected += 1;
            }
            if (!myButton.isSelected()) {
                if (seatSelected != 0) {
                    seatSelected -= 1;
                }
            }

            //Select only Nth button corresponding to the number of tickets selected 
            if (seatSelected > Globals.totalTickets) {
                JOptionPane.showMessageDialog(BookSeats,
                        "You have already selected " + Globals.totalTickets
                        + " seat(s).\nIf you want to change seat unselect one."
                        + "\nIf you need more seats, go back and add more tickets to your selection.",
                        "Tickets selected",
                        JOptionPane.ERROR_MESSAGE);
                myButton.setSelected(false);
                seatSelected -= 1;
            }
        }
    }

    public void resetBorder() {
        //resetBorder method to reset when a ticket is selected
        tfChildTicket.setBorder(null);
        tfGeneralTicket.setBorder(null);
        tfSeniorTicket.setBorder(null);
    }

    public void redBorder() {
        //redBorder method to change the color to red in case no ticket is selected
        Border border = BorderFactory.createLineBorder(Color.red);
        tfChildTicket.setBorder(border);
        tfGeneralTicket.setBorder(border);
        tfSeniorTicket.setBorder(border);
    }

    public BufferedImage resizePoster(URL url, Dimension size) throws IOException {
        //resize Poster picture to fit into the lable
        BufferedImage image = ImageIO.read(url);
        BufferedImage resized = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resized.createGraphics();
        g.drawImage(image, 0, 0, size.width, size.height, null);
        g.dispose();
        return resized;
    }

    public void loadInformations() {
        //Loading corresponding movie data and handling possible exeptions
        try {
            Movie movie;
            Cinema cinema;
            ArrayList<Showtime> list;
            Date date1 = new Date();

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

            //This code automatically creates dates options starting from today
            /*We commented this code to make it easy to test, otherwise we had to fill the database with showtimes for each day
            cmbSelectDate.addItem(sdf1.format(date1));
            Calendar c = Calendar.getInstance();
            c.setTime(date1);
            c.add(Calendar.DATE, 1);
            Date date2 = c.getTime();
            cmbSelectDate.addItem(sdf1.format(date2));
            c.setTime(date2);
            c.add(Calendar.DATE, 1);
            Date date3 = c.getTime();
            cmbSelectDate.addItem(sdf1.format(date3));
            c.setTime(date3);
            c.add(Calendar.DATE, 1);
            Date date4 = c.getTime();
            cmbSelectDate.addItem(sdf1.format(date4));*/
            movie = db.getMovieById(Globals.movieId);
            lblMovieName.setText(movie.toString());
            taOverview.setText(movie.getOverview());
            lblReleaseDate.setText(movie.getReleaseDate() + "");
            //Read and resize poster
            BufferedImage image = resizePoster(new URL(movie.getPosterImage()), new Dimension(380, 511));
            lblImage.setIcon(new ImageIcon(image));

            cinema = db.getCinemaById(Globals.CINEMA_ID);
            taCinemaInfo.setText(cinema.toString());
            String startDate = cmbSelectDate.getSelectedItem() + "";
            java.util.Date date = sdf1.parse(startDate);
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            list = db.getAllShowTimeById(Globals.CINEMA_ID, Globals.movieId, sqlStartDate);
            cmbSelectShowtime.removeAllItems();
            for (Showtime s : list) {
                cmbSelectShowtime.addItem(s.getTime());
            }

            lblHeader.setText(cinema.getName() + " - Buy Tickets");
            lblChildPrice.setText(String.format("x $%.2f", Globals.childTicketPrice));
            lblGeneralPrice.setText(String.format("x $%.2f", Globals.generalTicketPrice));
            lblSeniorPrice.setText(String.format("x $%.2f", Globals.seniorTicketPrice));
            seatSelected = 0;
            doneLoading = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error fetching data: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,
                    "Incorrect date format! Please enter yyyy-mm-dd.\n" + ex.getMessage(),
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            lblImage.setText("Sorry! Poster not available.");
        } catch (IOException ex) {
            Logger.getLogger(TicketReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrintTickets = new javax.swing.JFrame();
        PrintTickets_lblCinemaName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PrintTickets_btPrint = new javax.swing.JButton();
        PrintTickets_btBackToList = new javax.swing.JButton();
        PrintTickets_btExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Printtickets_taTicket = new javax.swing.JTextArea();
        BookSeats = new javax.swing.JDialog();
        BookSeats_lblHeader = new javax.swing.JLabel();
        dlgBookSeats_pnlControl = new javax.swing.JPanel();
        BookSeats_lblRowA = new javax.swing.JLabel();
        BookSeats_tgbSeat1 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat2 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat3 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat4 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat5 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat6 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat7 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat8 = new javax.swing.JToggleButton();
        BookSeats_lblRowB = new javax.swing.JLabel();
        BookSeats_tgbSeat9 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat11 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat10 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat12 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat13 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat14 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat15 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat16 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat17 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat18 = new javax.swing.JToggleButton();
        BookSeats_lblRowC = new javax.swing.JLabel();
        BookSeats_tgbSeat19 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat20 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat21 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat22 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat23 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat24 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat25 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat26 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat27 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat28 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat29 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat30 = new javax.swing.JToggleButton();
        BookSeats_lblRowD = new javax.swing.JLabel();
        BookSeats_tgbSeat31 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat32 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat33 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat34 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat35 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat36 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat37 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat38 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat39 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat40 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat41 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat42 = new javax.swing.JToggleButton();
        BookSeats_lblRowE = new javax.swing.JLabel();
        BookSeats_tgbSeat43 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat44 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat45 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat46 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat47 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat48 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat49 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat50 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat51 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat52 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat53 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat54 = new javax.swing.JToggleButton();
        BookSeats_lblRowF = new javax.swing.JLabel();
        BookSeats_tgbSeat55 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat56 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat57 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat58 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat59 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat60 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat61 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat62 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat63 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat64 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat65 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat66 = new javax.swing.JToggleButton();
        BookSeats_lblRowG = new javax.swing.JLabel();
        BookSeats_tgbSeat67 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat68 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat69 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat70 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat71 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat72 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat73 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat74 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat75 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat76 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat77 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat78 = new javax.swing.JToggleButton();
        BookSeats_lblRowH = new javax.swing.JLabel();
        BookSeats_tgbSeat79 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat80 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat81 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat82 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat83 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat84 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat85 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat86 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat87 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat88 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat89 = new javax.swing.JToggleButton();
        BookSeats_tgbSeat90 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        dlgBookSeats_btProceed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BookSeats_lblDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BookSeats_lblShowtime = new javax.swing.JLabel();
        BookSeats_btBack = new javax.swing.JButton();
        dlgConfirmPurchase = new javax.swing.JDialog();
        dlgConfirmPurchase_lblHeaser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dlgConfirmPurchase_btCancel = new javax.swing.JToggleButton();
        dlgConfirmPurchase_btConfirm = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dlgConfirmPurchase_taTicketReview = new javax.swing.JTextArea();
        lblSelectDate = new javax.swing.JLabel();
        pnlMovieInfo = new javax.swing.JPanel();
        lblMovieName = new javax.swing.JLabel();
        taCinemaInfo = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOverview = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblReleaseDate = new javax.swing.JLabel();
        pnlAddTicket = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblChild = new javax.swing.JLabel();
        lblGeneral = new javax.swing.JLabel();
        lblSenior = new javax.swing.JLabel();
        tfChildTicket = new javax.swing.JTextField();
        tfGeneralTicket = new javax.swing.JTextField();
        lblTixketType = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        tfSeniorTicket = new javax.swing.JTextField();
        btChildAdd = new javax.swing.JButton();
        btGeneralAdd = new javax.swing.JButton();
        btSeniorAdd = new javax.swing.JButton();
        btChildMinus = new javax.swing.JButton();
        btGeneralMinus = new javax.swing.JButton();
        btSeniorMinus = new javax.swing.JButton();
        lblChildPrice = new javax.swing.JLabel();
        lblGeneralPrice = new javax.swing.JLabel();
        lblSeniorPrice = new javax.swing.JLabel();
        lblSelectShowtime = new javax.swing.JLabel();
        cmbSelectDate = new javax.swing.JComboBox<>();
        cmbSelectShowtime = new javax.swing.JComboBox<>();
        lblHeader = new javax.swing.JLabel();
        btProceed = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btBackToMovies = new javax.swing.JButton();

        PrintTickets.setLocation(new java.awt.Point(250, 150));
        PrintTickets.setResizable(false);

        PrintTickets_lblCinemaName.setFont(new java.awt.Font("Copperplate", 0, 36)); // NOI18N
        PrintTickets_lblCinemaName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrintTickets_lblCinemaName.setText("The Jupiter Theater");
        PrintTickets.getContentPane().add(PrintTickets_lblCinemaName, java.awt.BorderLayout.PAGE_START);

        PrintTickets_btPrint.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        PrintTickets_btPrint.setText("Print Tickets");
        PrintTickets_btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTickets_btPrintActionPerformed(evt);
            }
        });

        PrintTickets_btBackToList.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        PrintTickets_btBackToList.setText("Back to Movie list");
        PrintTickets_btBackToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTickets_btBackToListActionPerformed(evt);
            }
        });

        PrintTickets_btExit.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        PrintTickets_btExit.setText("Exit");
        PrintTickets_btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTickets_btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(PrintTickets_btExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(PrintTickets_btBackToList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(PrintTickets_btPrint)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintTickets_btPrint)
                    .addComponent(PrintTickets_btBackToList)
                    .addComponent(PrintTickets_btExit))
                .addGap(25, 25, 25))
        );

        PrintTickets.getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        Printtickets_taTicket.setEditable(false);
        Printtickets_taTicket.setColumns(20);
        Printtickets_taTicket.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        Printtickets_taTicket.setRows(5);
        jScrollPane2.setViewportView(Printtickets_taTicket);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        PrintTickets.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        BookSeats.setLocation(new java.awt.Point(200, 50));
        BookSeats.setResizable(false);

        BookSeats_lblHeader.setFont(new java.awt.Font("Copperplate", 0, 36)); // NOI18N
        BookSeats_lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookSeats_lblHeader.setText("Movie name");
        BookSeats_lblHeader.setMaximumSize(new java.awt.Dimension(45, 50));
        BookSeats_lblHeader.setMinimumSize(new java.awt.Dimension(45, 50));
        BookSeats_lblHeader.setPreferredSize(new java.awt.Dimension(45, 50));
        BookSeats.getContentPane().add(BookSeats_lblHeader, java.awt.BorderLayout.PAGE_START);

        BookSeats_lblRowA.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowA.setText("Row A");

        BookSeats_tgbSeat1.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat1.setText("1");
        BookSeats_tgbSeat1.setToolTipText("");
        BookSeats_tgbSeat1.setFocusPainted(false);
        BookSeats_tgbSeat1.setFocusable(false);
        BookSeats_tgbSeat1.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat1.setRolloverEnabled(true);
        BookSeats_tgbSeat1.setSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat2.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat2.setText("2");
        BookSeats_tgbSeat2.setFocusPainted(false);
        BookSeats_tgbSeat2.setFocusable(false);
        BookSeats_tgbSeat2.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat2.setSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat3.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat3.setText("3");
        BookSeats_tgbSeat3.setFocusPainted(false);
        BookSeats_tgbSeat3.setFocusable(false);
        BookSeats_tgbSeat3.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat4.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat4.setText("4");
        BookSeats_tgbSeat4.setFocusPainted(false);
        BookSeats_tgbSeat4.setFocusable(false);
        BookSeats_tgbSeat4.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat4.setRequestFocusEnabled(false);

        BookSeats_tgbSeat5.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat5.setText("5");
        BookSeats_tgbSeat5.setFocusPainted(false);
        BookSeats_tgbSeat5.setFocusable(false);
        BookSeats_tgbSeat5.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat5.setRolloverEnabled(true);

        BookSeats_tgbSeat6.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat6.setFocusPainted(false);
        BookSeats_tgbSeat6.setFocusable(false);
        BookSeats_tgbSeat6.setLabel("6");
        BookSeats_tgbSeat6.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat6.setRolloverEnabled(true);

        BookSeats_tgbSeat7.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat7.setText("7");
        BookSeats_tgbSeat7.setFocusPainted(false);
        BookSeats_tgbSeat7.setFocusable(false);
        BookSeats_tgbSeat7.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat7.setSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat8.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat8.setText("8");
        BookSeats_tgbSeat8.setFocusPainted(false);
        BookSeats_tgbSeat8.setFocusable(false);
        BookSeats_tgbSeat8.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat8.setSize(new java.awt.Dimension(50, 50));

        BookSeats_lblRowB.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowB.setText("Row B");

        BookSeats_tgbSeat9.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat9.setFocusable(false);
        BookSeats_tgbSeat9.setLabel("9");
        BookSeats_tgbSeat9.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat9.setRequestFocusEnabled(false);

        BookSeats_tgbSeat11.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat11.setFocusPainted(false);
        BookSeats_tgbSeat11.setFocusable(false);
        BookSeats_tgbSeat11.setLabel("11");
        BookSeats_tgbSeat11.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat11.setRequestFocusEnabled(false);

        BookSeats_tgbSeat10.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat10.setFocusPainted(false);
        BookSeats_tgbSeat10.setFocusable(false);
        BookSeats_tgbSeat10.setLabel("10");
        BookSeats_tgbSeat10.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat10.setRequestFocusEnabled(false);

        BookSeats_tgbSeat12.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat12.setText("12");
        BookSeats_tgbSeat12.setFocusPainted(false);
        BookSeats_tgbSeat12.setFocusable(false);
        BookSeats_tgbSeat12.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat12.setRequestFocusEnabled(false);

        BookSeats_tgbSeat13.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat13.setText("13");
        BookSeats_tgbSeat13.setFocusPainted(false);
        BookSeats_tgbSeat13.setFocusable(false);
        BookSeats_tgbSeat13.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat13.setRequestFocusEnabled(false);
        BookSeats_tgbSeat13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSeats_tgbSeat13ActionPerformed(evt);
            }
        });

        BookSeats_tgbSeat14.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat14.setText("14");
        BookSeats_tgbSeat14.setFocusPainted(false);
        BookSeats_tgbSeat14.setFocusable(false);
        BookSeats_tgbSeat14.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat14.setRequestFocusEnabled(false);

        BookSeats_tgbSeat15.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat15.setText("15");
        BookSeats_tgbSeat15.setFocusPainted(false);
        BookSeats_tgbSeat15.setFocusable(false);
        BookSeats_tgbSeat15.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat15.setRequestFocusEnabled(false);

        BookSeats_tgbSeat16.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat16.setText("16");
        BookSeats_tgbSeat16.setFocusPainted(false);
        BookSeats_tgbSeat16.setFocusable(false);
        BookSeats_tgbSeat16.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat16.setRequestFocusEnabled(false);

        BookSeats_tgbSeat17.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat17.setFocusPainted(false);
        BookSeats_tgbSeat17.setFocusable(false);
        BookSeats_tgbSeat17.setLabel("17");
        BookSeats_tgbSeat17.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat17.setRequestFocusEnabled(false);
        BookSeats_tgbSeat17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSeats_tgbSeat17ActionPerformed(evt);
            }
        });

        BookSeats_tgbSeat18.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat18.setFocusPainted(false);
        BookSeats_tgbSeat18.setFocusable(false);
        BookSeats_tgbSeat18.setLabel("18");
        BookSeats_tgbSeat18.setPreferredSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat18.setRequestFocusEnabled(false);

        BookSeats_lblRowC.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowC.setText("Row C");

        BookSeats_tgbSeat19.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat19.setText("19");
        BookSeats_tgbSeat19.setFocusable(false);
        BookSeats_tgbSeat19.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat20.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat20.setText("20");
        BookSeats_tgbSeat20.setFocusable(false);
        BookSeats_tgbSeat20.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat21.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat21.setText("21");
        BookSeats_tgbSeat21.setFocusable(false);
        BookSeats_tgbSeat21.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat22.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat22.setText("22");
        BookSeats_tgbSeat22.setFocusPainted(false);
        BookSeats_tgbSeat22.setFocusable(false);
        BookSeats_tgbSeat22.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat23.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat23.setText("23");
        BookSeats_tgbSeat23.setFocusPainted(false);
        BookSeats_tgbSeat23.setFocusable(false);
        BookSeats_tgbSeat23.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat24.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat24.setText("24");
        BookSeats_tgbSeat24.setFocusPainted(false);
        BookSeats_tgbSeat24.setFocusable(false);
        BookSeats_tgbSeat24.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat25.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat25.setText("25");
        BookSeats_tgbSeat25.setFocusPainted(false);
        BookSeats_tgbSeat25.setFocusable(false);
        BookSeats_tgbSeat25.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat26.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat26.setText("26");
        BookSeats_tgbSeat26.setFocusPainted(false);
        BookSeats_tgbSeat26.setFocusable(false);
        BookSeats_tgbSeat26.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat27.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat27.setText("27");
        BookSeats_tgbSeat27.setFocusPainted(false);
        BookSeats_tgbSeat27.setFocusable(false);
        BookSeats_tgbSeat27.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat28.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat28.setText("28");
        BookSeats_tgbSeat28.setFocusPainted(false);
        BookSeats_tgbSeat28.setFocusable(false);
        BookSeats_tgbSeat28.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat29.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat29.setText("29");
        BookSeats_tgbSeat29.setFocusPainted(false);
        BookSeats_tgbSeat29.setFocusable(false);
        BookSeats_tgbSeat29.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat30.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat30.setText("30");
        BookSeats_tgbSeat30.setFocusPainted(false);
        BookSeats_tgbSeat30.setFocusable(false);
        BookSeats_tgbSeat30.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_lblRowD.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowD.setText("Row D");

        BookSeats_tgbSeat31.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat31.setText("31");
        BookSeats_tgbSeat31.setFocusable(false);
        BookSeats_tgbSeat31.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat32.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat32.setText("32");
        BookSeats_tgbSeat32.setFocusable(false);
        BookSeats_tgbSeat32.setMaximumSize(new java.awt.Dimension(50, 50));
        BookSeats_tgbSeat32.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat33.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat33.setText("33");
        BookSeats_tgbSeat33.setFocusable(false);
        BookSeats_tgbSeat33.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat34.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat34.setText("34");
        BookSeats_tgbSeat34.setFocusPainted(false);
        BookSeats_tgbSeat34.setFocusable(false);
        BookSeats_tgbSeat34.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat35.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat35.setText("35");
        BookSeats_tgbSeat35.setFocusPainted(false);
        BookSeats_tgbSeat35.setFocusable(false);
        BookSeats_tgbSeat35.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat36.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat36.setText("36");
        BookSeats_tgbSeat36.setFocusPainted(false);
        BookSeats_tgbSeat36.setFocusable(false);
        BookSeats_tgbSeat36.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat37.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat37.setText("37");
        BookSeats_tgbSeat37.setFocusPainted(false);
        BookSeats_tgbSeat37.setFocusable(false);
        BookSeats_tgbSeat37.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat38.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat38.setText("38");
        BookSeats_tgbSeat38.setFocusPainted(false);
        BookSeats_tgbSeat38.setFocusable(false);
        BookSeats_tgbSeat38.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat39.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat39.setText("39");
        BookSeats_tgbSeat39.setFocusPainted(false);
        BookSeats_tgbSeat39.setFocusable(false);
        BookSeats_tgbSeat39.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat40.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat40.setText("40");
        BookSeats_tgbSeat40.setFocusPainted(false);
        BookSeats_tgbSeat40.setFocusable(false);
        BookSeats_tgbSeat40.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat41.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat41.setText("41");
        BookSeats_tgbSeat41.setFocusPainted(false);
        BookSeats_tgbSeat41.setFocusable(false);
        BookSeats_tgbSeat41.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat42.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat42.setText("42");
        BookSeats_tgbSeat42.setFocusPainted(false);
        BookSeats_tgbSeat42.setFocusable(false);
        BookSeats_tgbSeat42.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_lblRowE.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowE.setText("Row E");

        BookSeats_tgbSeat43.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat43.setText("43");
        BookSeats_tgbSeat43.setFocusable(false);
        BookSeats_tgbSeat43.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat44.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat44.setText("44");
        BookSeats_tgbSeat44.setFocusable(false);
        BookSeats_tgbSeat44.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat45.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat45.setText("45");
        BookSeats_tgbSeat45.setFocusable(false);
        BookSeats_tgbSeat45.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat46.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat46.setText("46");
        BookSeats_tgbSeat46.setFocusPainted(false);
        BookSeats_tgbSeat46.setFocusable(false);
        BookSeats_tgbSeat46.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat47.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat47.setText("47");
        BookSeats_tgbSeat47.setFocusPainted(false);
        BookSeats_tgbSeat47.setFocusable(false);
        BookSeats_tgbSeat47.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat48.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat48.setText("48");
        BookSeats_tgbSeat48.setFocusPainted(false);
        BookSeats_tgbSeat48.setFocusable(false);
        BookSeats_tgbSeat48.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat49.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat49.setText("49");
        BookSeats_tgbSeat49.setFocusPainted(false);
        BookSeats_tgbSeat49.setFocusable(false);
        BookSeats_tgbSeat49.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat50.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat50.setText("50");
        BookSeats_tgbSeat50.setFocusPainted(false);
        BookSeats_tgbSeat50.setFocusable(false);
        BookSeats_tgbSeat50.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat51.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat51.setText("51");
        BookSeats_tgbSeat51.setFocusPainted(false);
        BookSeats_tgbSeat51.setFocusable(false);
        BookSeats_tgbSeat51.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat52.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat52.setText("52");
        BookSeats_tgbSeat52.setFocusPainted(false);
        BookSeats_tgbSeat52.setFocusable(false);
        BookSeats_tgbSeat52.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat53.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat53.setText("53");
        BookSeats_tgbSeat53.setFocusPainted(false);
        BookSeats_tgbSeat53.setFocusable(false);
        BookSeats_tgbSeat53.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat54.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat54.setText("54");
        BookSeats_tgbSeat54.setFocusPainted(false);
        BookSeats_tgbSeat54.setFocusable(false);
        BookSeats_tgbSeat54.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_lblRowF.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowF.setText("Row F");

        BookSeats_tgbSeat55.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat55.setText("55");
        BookSeats_tgbSeat55.setFocusable(false);
        BookSeats_tgbSeat55.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat56.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat56.setText("56");
        BookSeats_tgbSeat56.setFocusable(false);
        BookSeats_tgbSeat56.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat57.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat57.setText("57");
        BookSeats_tgbSeat57.setFocusable(false);
        BookSeats_tgbSeat57.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat58.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat58.setText("58");
        BookSeats_tgbSeat58.setFocusPainted(false);
        BookSeats_tgbSeat58.setFocusable(false);
        BookSeats_tgbSeat58.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat59.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat59.setText("59");
        BookSeats_tgbSeat59.setFocusPainted(false);
        BookSeats_tgbSeat59.setFocusable(false);
        BookSeats_tgbSeat59.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat60.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat60.setText("60");
        BookSeats_tgbSeat60.setFocusPainted(false);
        BookSeats_tgbSeat60.setFocusable(false);
        BookSeats_tgbSeat60.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat61.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat61.setText("61");
        BookSeats_tgbSeat61.setFocusPainted(false);
        BookSeats_tgbSeat61.setFocusable(false);
        BookSeats_tgbSeat61.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat62.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat62.setText("62");
        BookSeats_tgbSeat62.setFocusPainted(false);
        BookSeats_tgbSeat62.setFocusable(false);
        BookSeats_tgbSeat62.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat63.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat63.setText("63");
        BookSeats_tgbSeat63.setFocusPainted(false);
        BookSeats_tgbSeat63.setFocusable(false);
        BookSeats_tgbSeat63.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat64.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat64.setText("64");
        BookSeats_tgbSeat64.setFocusPainted(false);
        BookSeats_tgbSeat64.setFocusable(false);
        BookSeats_tgbSeat64.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat65.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat65.setText("65");
        BookSeats_tgbSeat65.setFocusPainted(false);
        BookSeats_tgbSeat65.setFocusable(false);
        BookSeats_tgbSeat65.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat66.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat66.setText("66");
        BookSeats_tgbSeat66.setFocusPainted(false);
        BookSeats_tgbSeat66.setFocusable(false);
        BookSeats_tgbSeat66.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_lblRowG.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowG.setText("Row G");

        BookSeats_tgbSeat67.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat67.setText("67");
        BookSeats_tgbSeat67.setFocusable(false);
        BookSeats_tgbSeat67.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat68.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat68.setText("68");
        BookSeats_tgbSeat68.setFocusable(false);
        BookSeats_tgbSeat68.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat69.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat69.setText("69");
        BookSeats_tgbSeat69.setFocusable(false);
        BookSeats_tgbSeat69.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat70.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat70.setText("70");
        BookSeats_tgbSeat70.setFocusPainted(false);
        BookSeats_tgbSeat70.setFocusable(false);
        BookSeats_tgbSeat70.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat71.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat71.setText("71");
        BookSeats_tgbSeat71.setFocusPainted(false);
        BookSeats_tgbSeat71.setFocusable(false);
        BookSeats_tgbSeat71.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat72.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat72.setText("72");
        BookSeats_tgbSeat72.setFocusPainted(false);
        BookSeats_tgbSeat72.setFocusable(false);
        BookSeats_tgbSeat72.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat73.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat73.setText("73");
        BookSeats_tgbSeat73.setFocusPainted(false);
        BookSeats_tgbSeat73.setFocusable(false);
        BookSeats_tgbSeat73.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat74.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat74.setText("74");
        BookSeats_tgbSeat74.setFocusPainted(false);
        BookSeats_tgbSeat74.setFocusable(false);
        BookSeats_tgbSeat74.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat75.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat75.setText("75");
        BookSeats_tgbSeat75.setFocusPainted(false);
        BookSeats_tgbSeat75.setFocusable(false);
        BookSeats_tgbSeat75.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat76.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat76.setText("76");
        BookSeats_tgbSeat76.setFocusPainted(false);
        BookSeats_tgbSeat76.setFocusable(false);
        BookSeats_tgbSeat76.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat77.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat77.setText("77");
        BookSeats_tgbSeat77.setFocusPainted(false);
        BookSeats_tgbSeat77.setFocusable(false);
        BookSeats_tgbSeat77.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat78.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat78.setText("78");
        BookSeats_tgbSeat78.setFocusPainted(false);
        BookSeats_tgbSeat78.setFocusable(false);
        BookSeats_tgbSeat78.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_lblRowH.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_lblRowH.setText("Row H");

        BookSeats_tgbSeat79.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat79.setText("79");
        BookSeats_tgbSeat79.setFocusable(false);
        BookSeats_tgbSeat79.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat80.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat80.setText("80");
        BookSeats_tgbSeat80.setFocusable(false);
        BookSeats_tgbSeat80.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat81.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat81.setText("81");
        BookSeats_tgbSeat81.setFocusable(false);
        BookSeats_tgbSeat81.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat82.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat82.setText("82");
        BookSeats_tgbSeat82.setFocusPainted(false);
        BookSeats_tgbSeat82.setFocusable(false);
        BookSeats_tgbSeat82.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat83.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat83.setText("83");
        BookSeats_tgbSeat83.setFocusPainted(false);
        BookSeats_tgbSeat83.setFocusable(false);
        BookSeats_tgbSeat83.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat84.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat84.setText("84");
        BookSeats_tgbSeat84.setFocusPainted(false);
        BookSeats_tgbSeat84.setFocusable(false);
        BookSeats_tgbSeat84.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat85.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat85.setText("85");
        BookSeats_tgbSeat85.setFocusPainted(false);
        BookSeats_tgbSeat85.setFocusable(false);
        BookSeats_tgbSeat85.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat86.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat86.setText("86");
        BookSeats_tgbSeat86.setFocusPainted(false);
        BookSeats_tgbSeat86.setFocusable(false);
        BookSeats_tgbSeat86.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat87.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat87.setText("87");
        BookSeats_tgbSeat87.setToolTipText("");
        BookSeats_tgbSeat87.setFocusPainted(false);
        BookSeats_tgbSeat87.setFocusable(false);
        BookSeats_tgbSeat87.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat88.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat88.setText("88");
        BookSeats_tgbSeat88.setFocusPainted(false);
        BookSeats_tgbSeat88.setFocusable(false);
        BookSeats_tgbSeat88.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat89.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat89.setText("89");
        BookSeats_tgbSeat89.setFocusPainted(false);
        BookSeats_tgbSeat89.setFocusable(false);
        BookSeats_tgbSeat89.setPreferredSize(new java.awt.Dimension(50, 50));

        BookSeats_tgbSeat90.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        BookSeats_tgbSeat90.setText("90");
        BookSeats_tgbSeat90.setFocusPainted(false);
        BookSeats_tgbSeat90.setFocusable(false);
        BookSeats_tgbSeat90.setPreferredSize(new java.awt.Dimension(50, 50));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("SCREEN");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setFocusable(false);

        dlgBookSeats_btProceed.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        dlgBookSeats_btProceed.setText("Proceed");
        dlgBookSeats_btProceed.setFocusPainted(false);
        dlgBookSeats_btProceed.setFocusTraversalKeysEnabled(false);
        dlgBookSeats_btProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgBookSeats_btProceedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        jLabel1.setText("Date:");

        BookSeats_lblDate.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        jLabel6.setText("Showtime:");

        BookSeats_lblShowtime.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N

        BookSeats_btBack.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        BookSeats_btBack.setText("Back");
        BookSeats_btBack.setToolTipText("");
        BookSeats_btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSeats_btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgBookSeats_pnlControlLayout = new javax.swing.GroupLayout(dlgBookSeats_pnlControl);
        dlgBookSeats_pnlControl.setLayout(dlgBookSeats_pnlControlLayout);
        dlgBookSeats_pnlControlLayout.setHorizontalGroup(
            dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                .addComponent(BookSeats_lblRowA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BookSeats_tgbSeat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                .addComponent(BookSeats_lblRowB)
                                .addGap(18, 18, 18)
                                .addComponent(BookSeats_tgbSeat9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                .addComponent(BookSeats_tgbSeat11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                .addComponent(BookSeats_tgbSeat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookSeats_tgbSeat8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BookSeats_lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BookSeats_lblShowtime, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BookSeats_lblRowC)
                                    .addComponent(BookSeats_lblRowD))
                                .addGap(18, 18, 18)
                                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BookSeats_tgbSeat19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BookSeats_tgbSeat31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BookSeats_tgbSeat32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BookSeats_tgbSeat20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BookSeats_lblRowF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BookSeats_lblRowE, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BookSeats_lblRowG, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BookSeats_lblRowH, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(71, 71, 71)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addComponent(BookSeats_tgbSeat57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addComponent(BookSeats_tgbSeat45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addComponent(BookSeats_tgbSeat69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addComponent(BookSeats_tgbSeat81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(BookSeats_tgbSeat33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addComponent(BookSeats_tgbSeat21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(BookSeats_tgbSeat41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                    .addComponent(BookSeats_tgbSeat29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BookSeats_tgbSeat30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                                        .addComponent(BookSeats_tgbSeat89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BookSeats_tgbSeat90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgBookSeats_pnlControlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BookSeats_btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dlgBookSeats_btProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        dlgBookSeats_pnlControlLayout.setVerticalGroup(
            dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgBookSeats_pnlControlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookSeats_lblShowtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookSeats_lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BookSeats_tgbSeat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_lblRowA))
                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(BookSeats_tgbSeat8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BookSeats_tgbSeat10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_lblRowB))
                    .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BookSeats_tgbSeat11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookSeats_tgbSeat18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgBookSeats_pnlControlLayout.createSequentialGroup()
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_lblRowC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_lblRowD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_lblRowE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_lblRowF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_lblRowG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeats_tgbSeat79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_tgbSeat80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookSeats_lblRowH))))
                .addGap(27, 27, 27)
                .addGroup(dlgBookSeats_pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookSeats_btBack)
                    .addComponent(dlgBookSeats_btProceed))
                .addGap(12, 12, 12))
        );

        BookSeats.getContentPane().add(dlgBookSeats_pnlControl, java.awt.BorderLayout.CENTER);

        dlgConfirmPurchase.setLocation(new java.awt.Point(250, 150));
        dlgConfirmPurchase.setResizable(false);

        dlgConfirmPurchase_lblHeaser.setFont(new java.awt.Font("Copperplate", 0, 24)); // NOI18N
        dlgConfirmPurchase_lblHeaser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dlgConfirmPurchase_lblHeaser.setText("Review and Confirm Your Purchase");
        dlgConfirmPurchase_lblHeaser.setMaximumSize(new java.awt.Dimension(111, 50));
        dlgConfirmPurchase_lblHeaser.setMinimumSize(new java.awt.Dimension(111, 50));
        dlgConfirmPurchase_lblHeaser.setPreferredSize(new java.awt.Dimension(111, 50));
        dlgConfirmPurchase_lblHeaser.setRequestFocusEnabled(false);
        dlgConfirmPurchase_lblHeaser.setSize(new java.awt.Dimension(45, 50));
        dlgConfirmPurchase.getContentPane().add(dlgConfirmPurchase_lblHeaser, java.awt.BorderLayout.PAGE_START);

        dlgConfirmPurchase_btCancel.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        dlgConfirmPurchase_btCancel.setText("Cancel");
        dlgConfirmPurchase_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgConfirmPurchase_btCancelActionPerformed(evt);
            }
        });

        dlgConfirmPurchase_btConfirm.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        dlgConfirmPurchase_btConfirm.setText("Confirm");
        dlgConfirmPurchase_btConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgConfirmPurchase_btConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(dlgConfirmPurchase_btCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dlgConfirmPurchase_btConfirm)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgConfirmPurchase_btConfirm)
                    .addComponent(dlgConfirmPurchase_btCancel))
                .addGap(31, 31, 31))
        );

        dlgConfirmPurchase.getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        dlgConfirmPurchase_taTicketReview.setEditable(false);
        dlgConfirmPurchase_taTicketReview.setColumns(20);
        dlgConfirmPurchase_taTicketReview.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        dlgConfirmPurchase_taTicketReview.setRows(5);
        dlgConfirmPurchase_taTicketReview.setAutoscrolls(false);
        dlgConfirmPurchase_taTicketReview.setFocusable(false);
        jScrollPane3.setViewportView(dlgConfirmPurchase_taTicketReview);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        dlgConfirmPurchase.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buy Tickets");
        setResizable(false);

        lblSelectDate.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblSelectDate.setText("Select Date:");

        pnlMovieInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMovieName.setFont(new java.awt.Font("Copperplate", 0, 18)); // NOI18N
        lblMovieName.setForeground(new java.awt.Color(0, 0, 255));
        lblMovieName.setText("Movie Name");

        taCinemaInfo.setEditable(false);
        taCinemaInfo.setColumns(20);
        taCinemaInfo.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        taCinemaInfo.setRows(5);
        taCinemaInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        taCinemaInfo.setDragEnabled(false);
        taCinemaInfo.setFocusTraversalKeysEnabled(false);
        taCinemaInfo.setFocusable(false);
        taCinemaInfo.setRequestFocusEnabled(false);

        taOverview.setEditable(false);
        taOverview.setColumns(20);
        taOverview.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        taOverview.setLineWrap(true);
        taOverview.setRows(5);
        taOverview.setWrapStyleWord(true);
        taOverview.setFocusable(false);
        jScrollPane1.setViewportView(taOverview);

        jLabel2.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel3.setText("Overview:");

        jLabel4.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        jLabel4.setText("Release Date:");

        lblReleaseDate.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N

        javax.swing.GroupLayout pnlMovieInfoLayout = new javax.swing.GroupLayout(pnlMovieInfo);
        pnlMovieInfo.setLayout(pnlMovieInfoLayout);
        pnlMovieInfoLayout.setHorizontalGroup(
            pnlMovieInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMovieInfoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlMovieInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMovieInfoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(pnlMovieInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(taCinemaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addComponent(lblMovieName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMovieInfoLayout.setVerticalGroup(
            pnlMovieInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMovieInfoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblMovieName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMovieInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMovieInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(lblReleaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(taCinemaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pnlAddTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblChild.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblChild.setText("Child (3-13)");

        lblGeneral.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblGeneral.setText("General (14-64)");

        lblSenior.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblSenior.setText("Senior (65+)");

        tfChildTicket.setEditable(false);
        tfChildTicket.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        tfChildTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfChildTicket.setText("0");
        tfChildTicket.setAutoscrolls(false);
        tfChildTicket.setBorder(null);
        tfChildTicket.setMinimumSize(new java.awt.Dimension(50, 50));

        tfGeneralTicket.setEditable(false);
        tfGeneralTicket.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        tfGeneralTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfGeneralTicket.setText("0");
        tfGeneralTicket.setBorder(null);
        tfGeneralTicket.setMinimumSize(new java.awt.Dimension(50, 50));

        lblTixketType.setFont(new java.awt.Font("Copperplate", 0, 17)); // NOI18N
        lblTixketType.setText("Ticket Type");

        lblQuantity.setFont(new java.awt.Font("Copperplate", 0, 17)); // NOI18N
        lblQuantity.setText("Quantity");

        lblPrice.setFont(new java.awt.Font("Copperplate", 0, 17)); // NOI18N
        lblPrice.setText("Price");

        tfSeniorTicket.setEditable(false);
        tfSeniorTicket.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        tfSeniorTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSeniorTicket.setText("0");
        tfSeniorTicket.setBorder(null);
        tfSeniorTicket.setMinimumSize(new java.awt.Dimension(50, 50));

        btChildAdd.setText("+");
        btChildAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChildAddActionPerformed(evt);
            }
        });

        btGeneralAdd.setText("+");
        btGeneralAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeneralAddActionPerformed(evt);
            }
        });

        btSeniorAdd.setText("+");
        btSeniorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeniorAddActionPerformed(evt);
            }
        });

        btChildMinus.setText("-");
        btChildMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChildMinusActionPerformed(evt);
            }
        });

        btGeneralMinus.setText("-");
        btGeneralMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeneralMinusActionPerformed(evt);
            }
        });

        btSeniorMinus.setText("-");
        btSeniorMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeniorMinusActionPerformed(evt);
            }
        });

        lblChildPrice.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblChildPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChildPrice.setText("X $6.50");

        lblGeneralPrice.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblGeneralPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGeneralPrice.setText("X $9.50");

        lblSeniorPrice.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblSeniorPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeniorPrice.setText("X $7.50");

        javax.swing.GroupLayout pnlAddTicketLayout = new javax.swing.GroupLayout(pnlAddTicket);
        pnlAddTicket.setLayout(pnlAddTicketLayout);
        pnlAddTicketLayout.setHorizontalGroup(
            pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddTicketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAddTicketLayout.createSequentialGroup()
                        .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAddTicketLayout.createSequentialGroup()
                                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlAddTicketLayout.createSequentialGroup()
                                        .addComponent(lblSenior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btSeniorMinus))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddTicketLayout.createSequentialGroup()
                                        .addComponent(lblGeneral)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                        .addComponent(btGeneralMinus))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddTicketLayout.createSequentialGroup()
                                        .addComponent(lblChild)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btChildMinus)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlAddTicketLayout.createSequentialGroup()
                                        .addComponent(tfSeniorTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btSeniorAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlAddTicketLayout.createSequentialGroup()
                                        .addComponent(tfChildTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btChildAdd))
                                    .addGroup(pnlAddTicketLayout.createSequentialGroup()
                                        .addComponent(tfGeneralTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btGeneralAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(97, 97, 97)
                                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblChildPrice)
                                    .addComponent(lblGeneralPrice)
                                    .addComponent(lblSeniorPrice))))
                        .addContainerGap())
                    .addGroup(pnlAddTicketLayout.createSequentialGroup()
                        .addComponent(lblTixketType)
                        .addGap(108, 108, 108)
                        .addComponent(lblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrice)
                        .addGap(73, 73, 73))))
        );
        pnlAddTicketLayout.setVerticalGroup(
            pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTixketType)
                    .addComponent(lblQuantity)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btChildAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblChild)
                        .addComponent(tfChildTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btChildMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblChildPrice)))
                .addGap(18, 18, 18)
                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGeneralTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeneral)
                    .addComponent(btGeneralAdd)
                    .addComponent(btGeneralMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeneralPrice))
                .addGap(18, 18, 18)
                .addGroup(pnlAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSeniorTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSeniorAdd)
                    .addComponent(lblSenior)
                    .addComponent(btSeniorMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeniorPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSelectShowtime.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        lblSelectShowtime.setText("Select Showtime:");

        cmbSelectDate.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        cmbSelectDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018-03-07", "2018-03-08", "2018-03-09" }));
        cmbSelectDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectDateActionPerformed(evt);
            }
        });

        cmbSelectShowtime.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        cmbSelectShowtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:15 pm", "3:13 pm", "5:15 pm", "7:50 pm", "10:15 pm" }));

        lblHeader.setFont(new java.awt.Font("Copperplate", 0, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 0, 0));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Buy Tickets");
        lblHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btProceed.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        btProceed.setText("Proceed");
        btProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProceedActionPerformed(evt);
            }
        });

        btBackToMovies.setFont(new java.awt.Font("Copperplate", 0, 15)); // NOI18N
        btBackToMovies.setText("Back to Movies");
        btBackToMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackToMoviesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBackToMovies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlMovieInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pnlAddTicket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblSelectDate)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSelectShowtime)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSelectShowtime, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(47, 47, 47)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMovieInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelectDate)
                            .addComponent(lblSelectShowtime)
                            .addComponent(cmbSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectShowtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pnlAddTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btProceed)
                    .addComponent(btBackToMovies))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGeneralMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeneralMinusActionPerformed
        //Changing number of selected tickets and limit check
        long generalTickets = Long.parseLong(tfGeneralTicket.getText());
        if (tfChildTicket.getBorder() != null) {
            resetBorder();
        }
        if (generalTickets == 0) {
            return;
        }
        generalTickets -= 1;
        tfGeneralTicket.setText(generalTickets + "");
    }//GEN-LAST:event_btGeneralMinusActionPerformed

    private void btChildAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChildAddActionPerformed
        //Changing number of selected tickets and limit check
        long childTickets = Long.parseLong(tfChildTicket.getText());
        long generalTickets = Long.parseLong(tfGeneralTicket.getText());
        long seniorTickets = Long.parseLong(tfSeniorTicket.getText());

        if (tfChildTicket.getBorder() != null) {
            resetBorder();
        }
        if ((childTickets + generalTickets + seniorTickets) >= TICKET_LIMIT) {
            JOptionPane.showMessageDialog(this,
                    "Can't buy more than " + TICKET_LIMIT + " tickets per account",
                    "Ticket limit reached",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        childTickets += 1;
        tfChildTicket.setText(childTickets + "");
    }//GEN-LAST:event_btChildAddActionPerformed

    private void btChildMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChildMinusActionPerformed
        //Changing number of selected tickets and limit check
        long childTickets = Long.parseLong(tfChildTicket.getText());
        if (tfChildTicket.getBorder() != null) {
            resetBorder();
        }
        if (childTickets == 0) {
            return;
        }
        childTickets -= 1;
        tfChildTicket.setText(childTickets + "");
    }//GEN-LAST:event_btChildMinusActionPerformed

    private void btGeneralAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeneralAddActionPerformed
        //Changing number of selected tickets and limit check
        long generalTickets = Long.parseLong(tfGeneralTicket.getText());
        long childTickets = Long.parseLong(tfChildTicket.getText());
        long seniorTickets = Long.parseLong(tfSeniorTicket.getText());
        if (tfChildTicket.getBorder() != null) {
            resetBorder();
        }
        if ((generalTickets + childTickets + seniorTickets) >= TICKET_LIMIT) {
            JOptionPane.showMessageDialog(this,
                    "Can't buy more than " + TICKET_LIMIT + " tickets per account",
                    "Ticket limit reached",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generalTickets += 1;
        tfGeneralTicket.setText(generalTickets + "");
    }//GEN-LAST:event_btGeneralAddActionPerformed

    private void btSeniorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeniorAddActionPerformed
        //Changing number of selected tickets and limit check
        long seniorTickets = Long.parseLong(tfSeniorTicket.getText());
        long generalTickets = Long.parseLong(tfGeneralTicket.getText());
        long childTickets = Long.parseLong(tfChildTicket.getText());
        if (tfChildTicket.getBorder() != null) {
            resetBorder();
        }
        if ((childTickets + generalTickets + seniorTickets) >= TICKET_LIMIT) {
            JOptionPane.showMessageDialog(this,
                    "Can't buy more than " + TICKET_LIMIT + " tickets per account",
                    "Ticket limit reached",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        seniorTickets += 1;
        tfSeniorTicket.setText(seniorTickets + "");
    }//GEN-LAST:event_btSeniorAddActionPerformed

    private void btSeniorMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeniorMinusActionPerformed
        //Changing number of selected tickets and limit check
        long seniorTickets = Long.parseLong(tfSeniorTicket.getText());
        if (tfChildTicket.getBorder() != null) {
            resetBorder();
        }

        if (seniorTickets == 0) {
            return;
        }
        seniorTickets -= 1;
        tfSeniorTicket.setText(seniorTickets + "");
    }//GEN-LAST:event_btSeniorMinusActionPerformed

    private void cmbSelectDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectDateActionPerformed
        //Getting showtimes based on the selected date
        try {
            ArrayList<Showtime> list;
            String startDate = cmbSelectDate.getSelectedItem() + "";
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = sdf1.parse(startDate);
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            list = db.getAllShowTimeById(1, Globals.movieId, sqlStartDate);
            cmbSelectShowtime.removeAllItems();
            for (Showtime s : list) {
                cmbSelectShowtime.addItem(s.getTime() + "");
            }
        } catch (ParseException ex) {
            Logger.getLogger(TicketReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error fetching data: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbSelectDateActionPerformed

    private void btProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProceedActionPerformed

        //Getting data
        try {
            Cinema cinema = db.getCinemaById(Globals.CINEMA_ID);
            PrintTickets_lblCinemaName.setText(cinema.getName());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error fetching data: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
        //Getting selected tickets
        int childTickets = Integer.parseInt(tfChildTicket.getText());
        int generalTickets = Integer.parseInt(tfGeneralTicket.getText());
        int seniorTickets = Integer.parseInt(tfSeniorTicket.getText());
        //Calculate totalPrice to pay
        Globals.totalPrice = (childTickets * Globals.childTicketPrice)
                + (generalTickets * Globals.generalTicketPrice)
                + (seniorTickets * Globals.seniorTicketPrice);
        //Calculate total Tickets selected
        Globals.totalTickets = (childTickets + generalTickets + seniorTickets);
        //Check that a least one ticket is selected to proceeed
        if ((childTickets + generalTickets + seniorTickets) == 0) {
            JOptionPane.showMessageDialog(this,
                    "A least one ticket must be selected.",
                    "Select Ticket",
                    JOptionPane.WARNING_MESSAGE);
            redBorder();
            return;
        }

        Movie movie;
        //Getting booked seats form the databese and disabling the corresponding seats
        try {
            movie = db.getMovieById(Globals.movieId);
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String startDate = cmbSelectDate.getSelectedItem() + "";
            java.util.Date date = sdf1.parse(startDate);
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            String time = cmbSelectShowtime.getSelectedItem() + "";
            seats = db.getAllBookedSeats(movie.getId(), sqlStartDate, time);

            if (seats.size() != 0) {

                for (SeatBooked s : seats) {
                    for (Component c : dlgBookSeats_pnlControl.getComponents()) {
                        if (c instanceof JToggleButton) {
                            int temp = Integer.parseInt(((JToggleButton) c).getText());
                            if (s.getSeatId() == temp) {
                                ((JToggleButton) c).setEnabled(false);
                            }
                        }
                    }
                }
            }
            if (seats.size() == maxCapacity) {
                JOptionPane.showMessageDialog(this,
                        "Sorry there are no more seat(s) left for this showtime."
                        + "\nPlease change date or showtime.",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                for (Component c : dlgBookSeats_pnlControl.getComponents()) {
                    if (c instanceof JToggleButton) {
                        if (!((JToggleButton) c).isEnabled()) {
                            ((JToggleButton) c).setEnabled(true);
                        }
                    }
                }
                return;
            }
            if ((maxCapacity - seats.size()) < Globals.totalTickets) {
                JOptionPane.showMessageDialog(this,
                        "Sorry there are only " + (maxCapacity - seats.size()) + " more seat(s) left for this showtime."
                        + "\nPlease change your seat(s) selection or showtime.",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            BookSeats_lblHeader.setText(movie.getTitle());
            BookSeats_lblDate.setText(cmbSelectDate.getSelectedItem() + "");
            BookSeats_lblShowtime.setText(cmbSelectShowtime.getSelectedItem() + "");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error fetching data: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Sorry! There is a problem with our database.\nPlease try again later or call 819-555-545 to book by phone",
                    "Fatal error",
                    JOptionPane.ERROR_MESSAGE);
        }
        //Displaying the seat map
        setVisible(false);
        BookSeats.pack();
        BookSeats.setVisible(true);
    }//GEN-LAST:event_btProceedActionPerformed

    private void PrintTickets_btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTickets_btPrintActionPerformed
        //Printing tickets
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("Ticket.pdf"));
            Font header = new Font(Font.FontFamily.HELVETICA, 25, Font.BOLD);
            Font text = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
            doc.open();
            doc.add(new Paragraph("The Jupiter Theater\n\n", header));
            doc.add(new Paragraph(Printtickets_taTicket.getText(), text));
            doc.close();
            Desktop.getDesktop().open(new File("Ticket.pdf"));
            JOptionPane.showMessageDialog(this,
                    "Thank you for your purchase!",
                    "Succesfully complete!",
                    JOptionPane.INFORMATION_MESSAGE);
            printCheck = true;
            //PrintTickets.setVisible(false);
            //tfChildTicket.setText("0");
            //tfGeneralTicket.setText("0");
            //tfSeniorTicket.setText("0");
            //Globals.movieGUI.setVisible(true);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Sorry! File not found!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            PrintTickets.setVisible(false);
            tfChildTicket.setText("0");
            tfGeneralTicket.setText("0");
            tfSeniorTicket.setText("0");
        } catch (DocumentException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PrintTickets_btPrintActionPerformed

    private void PrintTickets_btBackToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTickets_btBackToListActionPerformed
        if (!printCheck) {
            JOptionPane.showMessageDialog(this,
                    "Tickets not printed!\nPlease print your tickets",
                    "Print Tickets",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this,
                "Thank you for your purchase!",
                "Succesfully complete!",
                JOptionPane.INFORMATION_MESSAGE);
        PrintTickets.setVisible(false);
        Globals.movieGUI.setVisible(true);
    }//GEN-LAST:event_PrintTickets_btBackToListActionPerformed

    private void btBackToMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackToMoviesActionPerformed
        this.dispose();
    }//GEN-LAST:event_btBackToMoviesActionPerformed

    private void dlgBookSeats_btProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgBookSeats_btProceedActionPerformed
        if (seatSelected < Globals.totalTickets) {
            JOptionPane.showMessageDialog(this,
                    "You didn't select all seats.\nYou need to select " + (Globals.totalTickets - seatSelected) + " more seat(s).",
                    "Opps",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String startDate = BookSeats_lblDate.getText();
            java.util.Date date = sdf1.parse(startDate);
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            String time = BookSeats_lblShowtime.getText();
            dlgConfirmPurchase_taTicketReview.append(String.format("=====INFO====="
                    + "\nPurchased by: %s %s\nTotal tickets: %s\nTotal Price: %.2f\nPlease print and cut your ticket(s)"
                    + "\n------------------------------------------------\n\n"
                    + "\n\n----------------------cut here--------------------------\n\n",
                    Globals.currentUser.firstName, Globals.currentUser.lastName, Globals.totalTickets, Globals.totalPrice));
            int i = 1;
            for (Component c : dlgBookSeats_pnlControl.getComponents()) {
                if (c instanceof JToggleButton) {
                    if (((JToggleButton) c).isSelected()) {
                        int seatId = Integer.parseInt(((JToggleButton) c).getText());
                        SeatBooked seat = new SeatBooked(Globals.currentUser.getId(), Globals.movieId, seatId, sqlStartDate, time);
                        seat.setSeatRow();
                        seats.add(seat);
                        dlgConfirmPurchase_taTicketReview.append(String.format("Ticket number: %d\nMovie: %sCinema address:\n%s\n\nDate: %s\nShowtime: %s\nRow:%s\nSeat:%d\n\n----------------------cut here--------------------------\n\n",
                                i, lblMovieName.getText(), taCinemaInfo.getText(), cmbSelectDate.getSelectedItem(), cmbSelectShowtime.getSelectedItem(), seat.getSeatRow(), seat.getSeatId()));
                        i++;
                    }
                }
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        BookSeats.setVisible(false);
        dlgConfirmPurchase_taTicketReview.setCaretPosition(0);
        dlgConfirmPurchase.pack();
        dlgConfirmPurchase.setVisible(true);

    }//GEN-LAST:event_dlgBookSeats_btProceedActionPerformed

    private void BookSeats_tgbSeat17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSeats_tgbSeat17ActionPerformed
        //Check that the toggle button is selected 
        if (BookSeats_tgbSeat17.isSelected()) {
            seatSelected += 1;
        }
        if (!BookSeats_tgbSeat17.isSelected()) {
            if (seatSelected != 0) {
                seatSelected -= 1;
            }
        }

        //Select only Nth button corresponding to the number of tickets selected 
        if (seatSelected > Globals.totalTickets) {
            JOptionPane.showMessageDialog(this,
                    "You have already selected " + Globals.totalTickets + " seat(s).\nIf you want to change seat unselect one." + "\nIf you need more seats, go back and add more tickets to your selection.",
                    "Tickets selected",
                    JOptionPane.ERROR_MESSAGE);
            BookSeats_tgbSeat17.setSelected(false);
            seatSelected -= 1;
        }
    }//GEN-LAST:event_BookSeats_tgbSeat17ActionPerformed

    private void BookSeats_btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSeats_btBackActionPerformed
        seatSelected = 0;
        Globals.totalTickets = 0;
        for (Component c : dlgBookSeats_pnlControl.getComponents()) {
            if (c instanceof JToggleButton) {
                if (!((JToggleButton) c).isEnabled()) {
                    ((JToggleButton) c).setEnabled(true);
                }
            }
        }
        BookSeats.setVisible(false);
        tfChildTicket.setText("0");
        tfGeneralTicket.setText("0");
        tfSeniorTicket.setText("0");
        setVisible(true);
    }//GEN-LAST:event_BookSeats_btBackActionPerformed

    private void dlgConfirmPurchase_btConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgConfirmPurchase_btConfirmActionPerformed

        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String startDate = BookSeats_lblDate.getText();
            java.util.Date date = sdf1.parse(startDate);
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            String time = BookSeats_lblShowtime.getText();
            Showtime show = db.getSpecificShowTime(Globals.CINEMA_ID, Globals.movieId, sqlStartDate, time);
            for (Component c : dlgBookSeats_pnlControl.getComponents()) {
                if (c instanceof JToggleButton) {
                    if (((JToggleButton) c).isSelected()) {
                        int seatId = Integer.parseInt(((JToggleButton) c).getText());
                        SeatBooked seat = new SeatBooked(Globals.currentUser.getId(), Globals.movieId, seatId, sqlStartDate, time);
                        seat.setSeatRow();
                        seats.add(seat);
                        db.addBookedSeat(seat);
                    }
                }
            }
            Purchase p = new Purchase(Globals.currentUser.getId(), show.getId(), sqlStartDate, Globals.totalTickets, new BigDecimal(Globals.totalPrice));
            db.addPurchase(p);
            Printtickets_taTicket.setText(dlgConfirmPurchase_taTicketReview.getText());
            dlgConfirmPurchase.setVisible(false);
            Printtickets_taTicket.setCaretPosition(0);
            PrintTickets.pack();
            PrintTickets.setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error fetching data: " + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_dlgConfirmPurchase_btConfirmActionPerformed

    private void dlgConfirmPurchase_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgConfirmPurchase_btCancelActionPerformed
        JOptionPane.showMessageDialog(this,
                "Your transaction has been canceled",
                "Transaction canceled",
                JOptionPane.INFORMATION_MESSAGE);
        dlgConfirmPurchase.setVisible(false);
        Globals.movieGUI.setVisible(true);

    }//GEN-LAST:event_dlgConfirmPurchase_btCancelActionPerformed

    private void PrintTickets_btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTickets_btExitActionPerformed
        if (!printCheck) {
            JOptionPane.showMessageDialog(this,
                    "Tickets not printed!\nPlease print your tickets",
                    "Print Tickets",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this,
                "Thank you for using our Movie Ticketing System!",
                "Purchase succesfully complete!",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_PrintTickets_btExitActionPerformed

    private void BookSeats_tgbSeat13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSeats_tgbSeat13ActionPerformed
        //Check that the toggle button is selected
        if (BookSeats_tgbSeat13.isSelected()) {
            seatSelected += 1;
        }
        if (!BookSeats_tgbSeat13.isSelected()) {
            if (seatSelected != 0) {
                seatSelected -= 1;
            }
        }

        //Select only Nth button corresponding to the number of tickets selected
        if (seatSelected > Globals.totalTickets) {
            JOptionPane.showMessageDialog(this,
                    "You have already selected " + Globals.totalTickets + " seat(s).\nIf you want to change seat unselect one." + "\nIf you need more seats, go back and add more tickets to your selection.",
                    "Tickets selected",
                    JOptionPane.ERROR_MESSAGE);
            BookSeats_tgbSeat13.setSelected(false);
            seatSelected -= 1;
        }
    }//GEN-LAST:event_BookSeats_tgbSeat13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new TicketReservationGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BookSeats;
    private javax.swing.JButton BookSeats_btBack;
    private javax.swing.JLabel BookSeats_lblDate;
    private javax.swing.JLabel BookSeats_lblHeader;
    private javax.swing.JLabel BookSeats_lblRowA;
    private javax.swing.JLabel BookSeats_lblRowB;
    private javax.swing.JLabel BookSeats_lblRowC;
    private javax.swing.JLabel BookSeats_lblRowD;
    private javax.swing.JLabel BookSeats_lblRowE;
    private javax.swing.JLabel BookSeats_lblRowF;
    private javax.swing.JLabel BookSeats_lblRowG;
    private javax.swing.JLabel BookSeats_lblRowH;
    private javax.swing.JLabel BookSeats_lblShowtime;
    private javax.swing.JToggleButton BookSeats_tgbSeat1;
    private javax.swing.JToggleButton BookSeats_tgbSeat10;
    private javax.swing.JToggleButton BookSeats_tgbSeat11;
    private javax.swing.JToggleButton BookSeats_tgbSeat12;
    private javax.swing.JToggleButton BookSeats_tgbSeat13;
    private javax.swing.JToggleButton BookSeats_tgbSeat14;
    private javax.swing.JToggleButton BookSeats_tgbSeat15;
    private javax.swing.JToggleButton BookSeats_tgbSeat16;
    private javax.swing.JToggleButton BookSeats_tgbSeat17;
    private javax.swing.JToggleButton BookSeats_tgbSeat18;
    private javax.swing.JToggleButton BookSeats_tgbSeat19;
    private javax.swing.JToggleButton BookSeats_tgbSeat2;
    private javax.swing.JToggleButton BookSeats_tgbSeat20;
    private javax.swing.JToggleButton BookSeats_tgbSeat21;
    private javax.swing.JToggleButton BookSeats_tgbSeat22;
    private javax.swing.JToggleButton BookSeats_tgbSeat23;
    private javax.swing.JToggleButton BookSeats_tgbSeat24;
    private javax.swing.JToggleButton BookSeats_tgbSeat25;
    private javax.swing.JToggleButton BookSeats_tgbSeat26;
    private javax.swing.JToggleButton BookSeats_tgbSeat27;
    private javax.swing.JToggleButton BookSeats_tgbSeat28;
    private javax.swing.JToggleButton BookSeats_tgbSeat29;
    private javax.swing.JToggleButton BookSeats_tgbSeat3;
    private javax.swing.JToggleButton BookSeats_tgbSeat30;
    private javax.swing.JToggleButton BookSeats_tgbSeat31;
    private javax.swing.JToggleButton BookSeats_tgbSeat32;
    private javax.swing.JToggleButton BookSeats_tgbSeat33;
    private javax.swing.JToggleButton BookSeats_tgbSeat34;
    private javax.swing.JToggleButton BookSeats_tgbSeat35;
    private javax.swing.JToggleButton BookSeats_tgbSeat36;
    private javax.swing.JToggleButton BookSeats_tgbSeat37;
    private javax.swing.JToggleButton BookSeats_tgbSeat38;
    private javax.swing.JToggleButton BookSeats_tgbSeat39;
    private javax.swing.JToggleButton BookSeats_tgbSeat4;
    private javax.swing.JToggleButton BookSeats_tgbSeat40;
    private javax.swing.JToggleButton BookSeats_tgbSeat41;
    private javax.swing.JToggleButton BookSeats_tgbSeat42;
    private javax.swing.JToggleButton BookSeats_tgbSeat43;
    private javax.swing.JToggleButton BookSeats_tgbSeat44;
    private javax.swing.JToggleButton BookSeats_tgbSeat45;
    private javax.swing.JToggleButton BookSeats_tgbSeat46;
    private javax.swing.JToggleButton BookSeats_tgbSeat47;
    private javax.swing.JToggleButton BookSeats_tgbSeat48;
    private javax.swing.JToggleButton BookSeats_tgbSeat49;
    private javax.swing.JToggleButton BookSeats_tgbSeat5;
    private javax.swing.JToggleButton BookSeats_tgbSeat50;
    private javax.swing.JToggleButton BookSeats_tgbSeat51;
    private javax.swing.JToggleButton BookSeats_tgbSeat52;
    private javax.swing.JToggleButton BookSeats_tgbSeat53;
    private javax.swing.JToggleButton BookSeats_tgbSeat54;
    private javax.swing.JToggleButton BookSeats_tgbSeat55;
    private javax.swing.JToggleButton BookSeats_tgbSeat56;
    private javax.swing.JToggleButton BookSeats_tgbSeat57;
    private javax.swing.JToggleButton BookSeats_tgbSeat58;
    private javax.swing.JToggleButton BookSeats_tgbSeat59;
    private javax.swing.JToggleButton BookSeats_tgbSeat6;
    private javax.swing.JToggleButton BookSeats_tgbSeat60;
    private javax.swing.JToggleButton BookSeats_tgbSeat61;
    private javax.swing.JToggleButton BookSeats_tgbSeat62;
    private javax.swing.JToggleButton BookSeats_tgbSeat63;
    private javax.swing.JToggleButton BookSeats_tgbSeat64;
    private javax.swing.JToggleButton BookSeats_tgbSeat65;
    private javax.swing.JToggleButton BookSeats_tgbSeat66;
    private javax.swing.JToggleButton BookSeats_tgbSeat67;
    private javax.swing.JToggleButton BookSeats_tgbSeat68;
    private javax.swing.JToggleButton BookSeats_tgbSeat69;
    private javax.swing.JToggleButton BookSeats_tgbSeat7;
    private javax.swing.JToggleButton BookSeats_tgbSeat70;
    private javax.swing.JToggleButton BookSeats_tgbSeat71;
    private javax.swing.JToggleButton BookSeats_tgbSeat72;
    private javax.swing.JToggleButton BookSeats_tgbSeat73;
    private javax.swing.JToggleButton BookSeats_tgbSeat74;
    private javax.swing.JToggleButton BookSeats_tgbSeat75;
    private javax.swing.JToggleButton BookSeats_tgbSeat76;
    private javax.swing.JToggleButton BookSeats_tgbSeat77;
    private javax.swing.JToggleButton BookSeats_tgbSeat78;
    private javax.swing.JToggleButton BookSeats_tgbSeat79;
    private javax.swing.JToggleButton BookSeats_tgbSeat8;
    private javax.swing.JToggleButton BookSeats_tgbSeat80;
    private javax.swing.JToggleButton BookSeats_tgbSeat81;
    private javax.swing.JToggleButton BookSeats_tgbSeat82;
    private javax.swing.JToggleButton BookSeats_tgbSeat83;
    private javax.swing.JToggleButton BookSeats_tgbSeat84;
    private javax.swing.JToggleButton BookSeats_tgbSeat85;
    private javax.swing.JToggleButton BookSeats_tgbSeat86;
    private javax.swing.JToggleButton BookSeats_tgbSeat87;
    private javax.swing.JToggleButton BookSeats_tgbSeat88;
    private javax.swing.JToggleButton BookSeats_tgbSeat89;
    private javax.swing.JToggleButton BookSeats_tgbSeat9;
    private javax.swing.JToggleButton BookSeats_tgbSeat90;
    private javax.swing.JFrame PrintTickets;
    private javax.swing.JButton PrintTickets_btBackToList;
    private javax.swing.JButton PrintTickets_btExit;
    private javax.swing.JButton PrintTickets_btPrint;
    private javax.swing.JLabel PrintTickets_lblCinemaName;
    private javax.swing.JTextArea Printtickets_taTicket;
    private javax.swing.JButton btBackToMovies;
    private javax.swing.JButton btChildAdd;
    private javax.swing.JButton btChildMinus;
    private javax.swing.JButton btGeneralAdd;
    private javax.swing.JButton btGeneralMinus;
    private javax.swing.JButton btProceed;
    private javax.swing.JButton btSeniorAdd;
    private javax.swing.JButton btSeniorMinus;
    private javax.swing.JComboBox<String> cmbSelectDate;
    private javax.swing.JComboBox<String> cmbSelectShowtime;
    private javax.swing.JButton dlgBookSeats_btProceed;
    private javax.swing.JPanel dlgBookSeats_pnlControl;
    private javax.swing.JDialog dlgConfirmPurchase;
    private javax.swing.JToggleButton dlgConfirmPurchase_btCancel;
    private javax.swing.JToggleButton dlgConfirmPurchase_btConfirm;
    private javax.swing.JLabel dlgConfirmPurchase_lblHeaser;
    private javax.swing.JTextArea dlgConfirmPurchase_taTicketReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblChild;
    private javax.swing.JLabel lblChildPrice;
    private javax.swing.JLabel lblGeneral;
    private javax.swing.JLabel lblGeneralPrice;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMovieName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblReleaseDate;
    private javax.swing.JLabel lblSelectDate;
    private javax.swing.JLabel lblSelectShowtime;
    private javax.swing.JLabel lblSenior;
    private javax.swing.JLabel lblSeniorPrice;
    private javax.swing.JLabel lblTixketType;
    private javax.swing.JPanel pnlAddTicket;
    private javax.swing.JPanel pnlMovieInfo;
    private javax.swing.JTextArea taCinemaInfo;
    private javax.swing.JTextArea taOverview;
    private javax.swing.JTextField tfChildTicket;
    private javax.swing.JTextField tfGeneralTicket;
    private javax.swing.JTextField tfSeniorTicket;
    // End of variables declaration//GEN-END:variables
}

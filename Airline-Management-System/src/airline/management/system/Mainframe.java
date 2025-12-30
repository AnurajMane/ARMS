package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.jpg")));
	NewLabel.setBounds(0, 0, 1270, 690); 
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("CHHATRAPATI RAJARAM MAHARAJ AIRPORT, KOLHAPUR");
        AirlineManagementSystem.setBackground(Color.PINK);
	AirlineManagementSystem.setForeground(Color.RED);
        AirlineManagementSystem.setFont(new Font("TimesNewRoman", Font.BOLD, 40));
	AirlineManagementSystem.setBounds(60, 60,1200, 80);
	NewLabel.add(AirlineManagementSystem);
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
        
        JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
	AirlineSystem.add(PassengerDetails);
		
        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
	AirlineSystem.add(FlightDetails);
		
	JMenuItem ReservationDetails = new JMenuItem("ADD_PASSENGER_DETAILS");
	AirlineSystem.add(ReservationDetails);
		
	JMenuItem Book_Ticket = new JMenuItem("BOOK_TICKET");
	AirlineSystem.add(Book_Ticket);
        
        JMenuItem Paytm = new JMenuItem("PAYTM");
	AirlineSystem.add(Paytm);
		
	JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
	AirlineSystem.add(SectorDetails_1);
		
	JMenuItem Cancellation = new JMenuItem("CANCELLATION");
	AirlineSystem.add(Cancellation);
               
        JMenuItem BookedTickets = new JMenuItem("VIEW_BOOKED_TICKETS");
        
	AirlineSystem.add(BookedTickets);
        
        JMenuItem Passengers = new JMenuItem("VIEW_PASSENGERS");
	AirlineSystem.add(Passengers);  
   
        JMenuItem Viewpayments = new JMenuItem("VIEW_PAYMENTS");
	AirlineSystem.add(Viewpayments);
		
	JMenu Ticket = new JMenu("TICKET");
        Ticket.setForeground(Color.RED);
	menuBar.add(Ticket);
	
        
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        
	ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
        
        
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
        
        Book_Ticket.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookTicket().setVisible(true);
                }catch(Exception e ){}
            }
	});
		
        
        BookedTickets.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookedTickets().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        Passengers.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Passengers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        Paytm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Payment().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        Viewpayments.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewPayments().setVisible(true);
                }catch(Exception e ){}
            }
	});
		
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	});
		
        setSize(1290,725);
	setVisible(true);
    }
}

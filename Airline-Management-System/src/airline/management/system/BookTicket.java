package airline.management.system;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BookTicket extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
        JComboBox comboBox1,comboBox2,comboBox3,comboBox4;
        JRadioButton r1,r2;
        Choice c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTicket frame = new BookTicket("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BookTicket(String username) throws SQLException {
		System.out.println(username);
                setBounds(200, 100, 950, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
             
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/bookpackage.jpg"));
                Image i3 = i1.getImage().getScaledInstance(450, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(450,40,450,420);
                add(l1);
		
		JLabel lblName = new JLabel("BOOK TICKET");
		lblName.setFont(new Font("TimesNewRoman", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 260, 53);
		contentPane.add(lblName);
                
                JLabel l3 = new JLabel("FLIGHT CODE :");
		l3.setBounds(35, 70, 200, 14);
		contentPane.add(l3);
                
                t6 = new JTextField();
		t6.setBounds(271, 70, 150, 20);
		contentPane.add(t6);
		t6.setColumns(10);
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                comboBox1 = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
		comboBox1.setBounds(271, 110, 150, 20);
		contentPane.add(comboBox1);
                
                JLabel l2 = new JLabel("ID NUMBER :");
		l2.setBounds(35, 150, 200, 14);
		contentPane.add(l2);
                
                t3 = new JTextField();
		t3.setBounds(271, 150, 150, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblName_1 = new JLabel("NAME :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		t1 = new JTextField();
		t1.setBounds(271, 190, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);

                
		JLabel lblGender = new JLabel("GENDER :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                r1 = new JRadioButton("Male");
                r1.setFont(new Font("Raleway", Font.BOLD, 14));
                r1.setBackground(Color.WHITE);
                r1.setBounds(271, 230, 80, 12);
                add(r1);
                
                r2 = new JRadioButton("Female");
                r2.setFont(new Font("Raleway", Font.BOLD, 14));
                r2.setBackground(Color.WHITE);
                r2.setBounds(350, 230, 100, 12);
		add(r2);
                
		JLabel lblCountry = new JLabel("SOURCE :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                comboBox2 = new JComboBox(new String[] {"KOLHAPUR"});
		comboBox2.setBounds(271, 270, 150, 20);
		contentPane.add(comboBox2);
                
              
		
		JLabel lblReserveRoomNumber = new JLabel("DESTINATION :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                comboBox3 = new JComboBox(new String[] {"HYDRABAD", "KOLKATA", "BANGLORE", "MUMBAI", "CHENNAI", "CHANDIGRAH", "MANALI"});
		comboBox3.setBounds(271, 310, 150, 20);
		contentPane.add(comboBox3);
                
                
           	
		JLabel lblCheckInStatus = new JLabel("PHONE :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                t9 = new JTextField();
		t9.setBounds(271, 350, 150, 20);
		contentPane.add(t9);
		t9.setColumns(10);
		
		JLabel lblDeposite = new JLabel("SELECT CLASS :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		comboBox4 = new JComboBox(new String[] {"ECONOMY", "PREMIUM ECONOMY", "BUSINESS FIRST"});
		comboBox4.setBounds(271, 390, 150, 20);
		contentPane.add(comboBox4);
	

		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null, "Ticked Booked Successfully...!!");
                            conn c = new conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            else if(r2.isSelected()){ 
                                radio = "Female";
                            }
                           
                          
                            try{
	    			String s1 = t1.getText();
                                String s3 = (String)comboBox1.getSelectedItem(); 
	    			String s2 =  t2.getText();
	    			String s4 =  t4.getText();
                                String s5 =  radio;
	    			String s6 =  t6.getText();
	    			String s7 =  (String)comboBox2.getSelectedItem(); 
                                String s8 =  (String)comboBox3.getSelectedItem(); 
                                String s9 = (String)comboBox4.getSelectedItem(); 
                                
                                String q1 = "insert into bookticket values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Ticked Booked");
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("CANCEL");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}
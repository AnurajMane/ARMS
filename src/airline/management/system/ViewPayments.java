package airline.management.system;


import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewPayments extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPayments frame = new ViewPayments();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public ViewPayments() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 20, 920, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/payment.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,420,300,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/payment.png"));
                Image i5 = i4.getImage().getScaledInstance(300, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(340,420,300,201);
                add(l2);
                
                ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/payment.png"));
                Image i8 = i7.getImage().getScaledInstance(300, 201,Image.SCALE_DEFAULT);
                ImageIcon i9 = new ImageIcon(i8);
                JLabel l3 = new JLabel(i9);
                l3.setBounds(640,420,300,201);
                add(l3);
                
		
		table = new JTable();
		table.setBounds(0, 40, 900, 350);
		contentPane.add(table);
                
                try{
                    conn c = new conn();
                        String displayCustomersql = "select * from payment";
                        ResultSet rs = c.s.executeQuery(displayCustomersql);
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(390, 400, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		lblAvailability = new JLabel("PNR_NO");
		lblAvailability.setBounds(10, 15, 69, 14);
		contentPane.add(lblAvailability);
		
		lblCleanStatus = new JLabel("PHONE_NO");
		lblCleanStatus.setBounds(150, 15, 76, 14);
		contentPane.add(lblCleanStatus);
		
		lblNewLabel = new JLabel("CHEQUE_NO");
		lblNewLabel.setBounds(300, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("CARD_NO");
		lblNewLabel_1.setBounds(450, 15, 76, 14);
		contentPane.add(lblNewLabel_1);

		
		lblId = new JLabel("PAID_AMT");
		lblId.setBounds(600, 15, 90, 14);
		contentPane.add(lblId);
                
                JLabel l4 = new JLabel("PAY_DATE");
		l4.setBounds(750, 15, 90, 14);
		contentPane.add(l4);
                
               
                getContentPane().setBackground(Color.WHITE);
	}

}


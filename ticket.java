package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JList;

public class ticket {

	private JFrame frame;
	private JTextField name2;
	private JTextField from;
	private JTextField To;
	private JTextField date;
	private JTextField tim;
	private JTextField ticketno;
	private JTextField price;
	private JTextField route;
	private JTextField name;
	private JTextField tax;
	private JTextField subtot;
	private JTextField tot;
	private JTable table;
	static int id=25000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(127, 255, 212));
		frame.setBounds(100, 100, 795, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("     Ticket Booking");
		lblTicketBooking.setBackground(SystemColor.control);
		lblTicketBooking.setBounds(231, 11, 266, 36);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.getContentPane().add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 73, 99, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(515, 100, 46, 14);
		frame.getContentPane().add(lblName_1);
		
		name2 = new JTextField();
		name2.setBounds(593, 97, 133, 20);
		frame.getContentPane().add(name2);
		name2.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(489, 154, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		from = new JTextField();
		from.setBounds(545, 151, 86, 20);
		frame.getContentPane().add(from);
		from.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(489, 193, 46, 14);
		frame.getContentPane().add(lblTo);
		
		To = new JTextField();
		To.setBounds(545, 187, 86, 20);
		frame.getContentPane().add(To);
		To.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(489, 228, 46, 14);
		frame.getContentPane().add(lblDate);
		
		date = new JTextField();
		date.setBounds(545, 225, 86, 20);
		frame.getContentPane().add(date);
		date.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(489, 267, 46, 14);
		frame.getContentPane().add(lblTime);
		
		tim = new JTextField();
		tim.setBounds(545, 264, 86, 20);
		frame.getContentPane().add(tim);
		tim.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(661, 154, 65, 14);
		frame.getContentPane().add(lblTicketNo);
		
		ticketno = new JTextField();
		ticketno.setBounds(661, 173, 86, 20);
		frame.getContentPane().add(ticketno);
		ticketno.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(661, 204, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		price = new JTextField();
		price.setBounds(661, 225, 86, 20);
		frame.getContentPane().add(price);
		price.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(661, 256, 46, 14);
		frame.getContentPane().add(lblRoute);
		
		route = new JTextField();
		route.setBounds(661, 277, 86, 20);
		frame.getContentPane().add(route);
		route.setColumns(10);
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"<From>", "Trivandrum", "Kollam", "Ernakulam", "Banglore", "Chennai", "Mumbai"}));
		cb1.setBounds(10, 187, 120, 20);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"<To>", "Trivandrum", "Kollam", "Ernakulam", "Banglore", "Chennai", "Mumbai"}));
		cb2.setBounds(155, 187, 125, 20);
		frame.getContentPane().add(cb2);
		
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"<No of Seats>", "1", "2", "3", "4", "5", "6"}));
		cb3.setBounds(309, 187, 109, 20);
		frame.getContentPane().add(cb3);
		
		JRadioButton rd1 = new JRadioButton("First Class");
		rd1.setBounds(10, 150, 86, 23);
		frame.getContentPane().add(rd1);
		
		JRadioButton rd2 = new JRadioButton("AC");
		rd2.setBounds(99, 150, 46, 23);
		frame.getContentPane().add(rd2);
		
		JRadioButton rd3 = new JRadioButton("Sleeper");
		rd3.setBounds(147, 150, 70, 23);
		frame.getContentPane().add(rd3);
		
		JRadioButton rd4 = new JRadioButton("Child");
		rd4.setBounds(229, 150, 109, 23);
		frame.getContentPane().add(rd4);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=name2.getText();
				String str2=ticketno.getText();
				String str3=from.getText();
				String str4=To.getText();
				String str5=(String)cb3.getSelectedItem();
				String str6=tim.getText();
				String str7=date.getText();
				String str8="";
				if(rd1.isSelected())
				{
					str8="Non Ac";
				}
				if(rd2.isSelected())
				{
					str8="Ac";
				}
				if(rd3.isSelected())
				{
					str8="Non Ac";
				}
				if(rd4.isSelected())
				{
					str8="Non Ac";
				}
				String str9=price.getText();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
				
		});
		btnConfirm.setBounds(597, 317, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(448, 73, 321, 326);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTicketDetails = new JLabel("Ticket Details");
		lblTicketDetails.setBounds(129, 0, 80, 14);
		panel_1.add(lblTicketDetails);
		
		name = new JTextField();
		name.setBounds(100, 73, 157, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Standard");
		r1.setBounds(10, 121, 86, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Single Ticket");
		r2.setBounds(111, 121, 99, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton("Adult");
		r3.setBounds(229, 121, 109, 23);
		frame.getContentPane().add(r3);
		ButtonGroup g1=new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		g1.add(r3);
		
		
		ButtonGroup g2=new ButtonGroup();
		g2.add(rd1);
		g2.add(rd2);
		g2.add(rd3);
		g2.add(rd4);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 231, 46, 14);
		frame.getContentPane().add(lblTax);
		
		tax = new JTextField();
		tax.setBounds(82, 231, 86, 20);
		frame.getContentPane().add(tax);
		tax.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 280, 62, 14);
		frame.getContentPane().add(lblSubTotal);
		
		subtot = new JTextField();
		subtot.setBounds(82, 277, 86, 20);
		frame.getContentPane().add(subtot);
		subtot.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 321, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		tot = new JTextField();
		tot.setBounds(82, 318, 86, 20);
		frame.getContentPane().add(tot);
		tot.setColumns(10);
		
		
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=name.getText();
			name2.setText(a);
			String b=(String)cb3.getSelectedItem();
			float c=Float.parseFloat(b);
			float ta=0,st=0,to=0;
			if(rd1.isSelected())
			{
				ta=(float)(200*c);
				st=(float)(500*c);
				to=ta+st;
			}
			if(rd2.isSelected())
			{
				ta=(float)(200*c);
				st=(float)(600*c);
				to=ta+st;
			}
			if(rd3.isSelected())
			{
				ta=(float)(200*c);
				st=(float)(700*c);
				to=ta+st;
			}
			if(rd4.isSelected())
			{
				ta=(float)(200*c);
				st=(float)(800*c);
				to=ta+st;
			}
			String t1=String.valueOf(ta);
			String sub1=String.valueOf(st);
			String to1=String.valueOf(to);
			tax.setText(t1);
			subtot.setText(sub1);
			tot.setText(to1);
			String comb1=(String)cb1.getSelectedItem();
			from.setText(comb1);
			String comb2=(String)cb2.getSelectedItem();
			To.setText(comb2);
			price.setText(to1);
			route.setText("Any");
			LocalTime time1=java.time.LocalTime.now();
			String time2=String.valueOf(time1);
			tim.setText(time2);
			LocalDate date1=java.time.LocalDate.now();
			String date2=String.valueOf(date1);
			date.setText(date2);
			id++;
			String id1=String.valueOf(id);
			ticketno.setText(id1);
			}
		});
		btnTotal.setBounds(43, 376, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				g1.clearSelection();
				g2.clearSelection();
				name2.setText("");
				tax.setText("");
				subtot.setText("");
				tot.setText("");
				from.setText("");
				To.setText("");
				date.setText("");
				tim.setText("");
				ticketno.setText("");
				price.setText("");
				route.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
			}
		});
		btnReset.setBounds(168, 376, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(296, 376, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 429, 759, 125);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "BookingNo", "From", "To", "No_of_seats", "Time", "Date", "AC_nonAC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 739, 78);
		panel_2.add(table);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 216, 405, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 112, 417, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 346, 417, 2);
		frame.getContentPane().add(separator_2);
		
		
		
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(436, 73, 2, 335);
		frame.getContentPane().add(separator_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(241, 11, 240, 51);
		frame.getContentPane().add(panel);
	}
}

package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class rupee {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rupee window = new rupee();
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
	public rupee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 612, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Rupee", "Dollar", "AED"}));
		cb1.setBounds(41, 58, 206, 20);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Rupee", "Dollar", "AED"}));
		cb2.setBounds(324, 58, 206, 20);
		frame.getContentPane().add(cb2);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(41, 27, 46, 20);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(336, 30, 46, 14);
		frame.getContentPane().add(lblTo);
		
		tf1 = new JTextField();
		tf1.setBounds(41, 133, 206, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(316, 133, 214, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JButton conv = new JButton("Convert");
		conv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=tf1.getText();
			float b=Float.parseFloat(a);
			if(cb1.getSelectedItem()=="rupee")
			{
				if(cb2.getSelectedItem()=="rupee")
				{
					tf2.setText(a);
				}
				else if(cb2.getSelectedItem()=="dollar")
				{
					float c=(float)(b*0.014);
					String out=String.valueOf(c);
					tf2.setText(out);
				}
				else if(cb2.getSelectedItem()=="AED")
				{
					float c=(float)(b*0.05);
					String out=String.valueOf(c);
					tf2.setText(out);
				}
			}
			else if(cb1.getSelectedItem()=="dollar")
			{
				if(cb2.getSelectedItem()=="rupee")
				{
					float c=(float)(b*71.74);
					String out=String.valueOf(c);
					tf2.setText(out);
				}
				else if(cb2.getSelectedItem()=="dollar")
				{
					tf2.setText(a);
				}
				else if(cb2.getSelectedItem()=="AED")
				{
					float c=(float)(b*3.67);
					String out=String.valueOf(c);
					tf2.setText(out);
				}
			}
			else if(cb1.getSelectedItem()=="AED")
			{
				if(cb2.getSelectedItem()=="rupee")
				{
					float c=(float)(b*19.53);
					String out=String.valueOf(c);
					tf2.setText(out);
				}
				else if(cb2.getSelectedItem()=="dollar")
				{
					float c=(float)(b*0.27);
					String out=String.valueOf(c);
					tf2.setText(out);
				}
				else if(cb2.getSelectedItem()=="AED")
				{
					tf2.setText(a);
				}
			}
		}
		});
		conv.setBounds(68, 355, 89, 23);
		frame.getContentPane().add(conv);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(310, 355, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblRateOfCurrency = new JLabel("Rate of  Currency Converter");
		lblRateOfCurrency.setBounds(133, 11, 249, 14);
		frame.getContentPane().add(lblRateOfCurrency);
	}
}
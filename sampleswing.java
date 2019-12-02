package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sampleswing {

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
					sampleswing window = new sampleswing();
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
	public sampleswing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(214, 64, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(217, 118, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		JLabel lb = new JLabel("");
		lb.setBounds(98, 210, 145, 14);
		frame.getContentPane().add(lb);
		
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=tf1.getText();
				String password=tf2.getText();
				if(username.contentEquals("Irfana")&&password.equals("123"))
					lb.setText("Successful");
					else
						lb.setText("Unsuccessful");
						
			}
			
		});
		Submit.setBounds(131, 167, 89, 23);
		frame.getContentPane().add(Submit);
		
		JLabel lb1 = new JLabel("New label");
		lb.setBounds(98, 210, 145, 14);
		frame.getContentPane().add(lb);
		
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(77, 63, 92, 27);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(76, 120, 46, 14);
		frame.getContentPane().add(lblPassword);
	}

}

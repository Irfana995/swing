package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tf;
	private JPasswordField pt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
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
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setBounds(68, 29, 92, 38);
		frame.getContentPane().add(lblUserName);
		
		tf = new JTextField();
		tf.setBounds(240, 38, 86, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(68, 94, 53, 28);
		frame.getContentPane().add(lblPassword);
		
		pt = new JPasswordField();
		pt.setBounds(240, 94, 86, 20);
		frame.getContentPane().add(pt);
		
		
		JLabel label = new JLabel("");
		label.setBounds(179, 203, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(179, 203, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lb = new JLabel("");
		lb.setBounds(100, 190, 226, 28);
		frame.getContentPane().add(lb);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=tf.getText();
				String password="";
				password=new String(pt.getPassword());
				if(username.equals("Irfana")&&password.equals("123"))
				{
					lb.setText("Login Successful");
				}
				else
				{
					lb.setText("Login Unsuccessful");
				}
				
			}
		});
		btnSubmit.setBounds(141, 132, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}

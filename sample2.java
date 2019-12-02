package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sample2 {

	private JFrame frame;
	private JTextField tf1;
	private JLabel lb;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample2 window = new sample2();
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
	public sample2() {
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
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setBounds(42, 42, 81, 34);
		frame.getContentPane().add(lblDegrees);
		
		tf1 = new JTextField();
		tf1.setBounds(157, 51, 125, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JButton btnToCelsius = new JButton("To celsius");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float t=Float.parseFloat(tf1.getText());
				float temp=(float)(t-273.15);
				String str=String.valueOf(temp);
				lb.setText(str);
				
				
			}
		});
		btnToCelsius.setBounds(33, 183, 118, 34);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFarenheit = new JButton("To farenheit");
		btnToFarenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float t=Float.parseFloat(tf1.getText());
				float temp=(float)((t-273.15)*9/5+32);
				String str=String.valueOf(temp);
				lb.setText(str);
				
			}
		});
		btnToFarenheit.setBounds(197, 183, 125, 29);
		frame.getContentPane().add(btnToFarenheit);
		
		lb = new JLabel("New label");
		lb.setBounds(122, 102, 148, 34);
		frame.getContentPane().add(lb);
		
		lblResult = new JLabel("Result=");
		lblResult.setBounds(72, 102, 50, 34);
		frame.getContentPane().add(lblResult);
	}

}

package sampleswing;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class newche {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newche window = new newche();
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
	public newche() {
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
		
		JCheckBox ch1 = new JCheckBox("C++");
		ch1.setBounds(126, 69, 97, 23);
		frame.getContentPane().add(ch1);
		
		JCheckBox ch2 = new JCheckBox("Java");
		ch2.setBounds(126, 121, 97, 23);
		frame.getContentPane().add(ch2);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(72, 170, 121, 14);
		frame.getContentPane().add(l2);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(251, 170, 121, 14);
		frame.getContentPane().add(l1);
		
		ch1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent l)
			{
				l1.setText("C++ "+(l.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		
		ch2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				l2.setText("Java "+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
	}

}

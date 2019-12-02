package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class bmi {

	private JFrame frame;
	private JTextField ht;
	private JTextField wt;
	private JTextField rt;
	private JLabel rlabel;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi window = new bmi();
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
	public bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m)=");
		lblHeightm.setBounds(44, 94, 86, 27);
		frame.getContentPane().add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg)=");
		lblWeightkg.setBounds(44, 132, 86, 14);
		frame.getContentPane().add(lblWeightkg);
		
		ht = new JTextField();
		ht.setBounds(254, 97, 86, 20);
		frame.getContentPane().add(ht);
		ht.setColumns(10);
		
		wt = new JTextField();
		wt.setBounds(254, 129, 86, 20);
		frame.getContentPane().add(wt);
		wt.setColumns(10);
		
		rt = new JTextField();
		rt.setBounds(93, 168, 122, 20);
		frame.getContentPane().add(rt);
		rt.setColumns(10);
		
		rlabel = new JLabel("");
		rlabel.setBounds(264, 161, 131, 27);
		frame.getContentPane().add(rlabel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String h=ht.getText();
				String w=wt.getText();
				float h1=Float.parseFloat(h);
				float w1=Float.parseFloat(w);
				float bmi=(float)(w1/(h1*h1));
				if(bmi<18.5)
				{
					rlabel.setText("Under Weight");
				}
				else if((bmi>=18.5)&&(bmi<=24.9))
				{
					rlabel.setText("Normal Weight");
				}
				else if((bmi>=25)&&(bmi<=29.9))
				{
					rlabel.setText("Over weight");
				}
				else 
				{
					rlabel.setText("Obese");
				}
				String r=String.valueOf(bmi);
				rt.setText(r);
			}
		});
		btnCalculate.setBounds(41, 254, 89, 41);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ht.setText("");
				wt.setText("");
				rt.setText("");
			}
		});
		btnClear.setBounds(153, 254, 89, 41);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(282, 254, 89, 39);
		frame.getContentPane().add(btnExit);
		
		JLabel lblBmi = new JLabel("BMI=");
		lblBmi.setBounds(39, 170, 46, 18);
		frame.getContentPane().add(lblBmi);
		
		JLabel lblBodyMassIndex = new JLabel("         BODY MASS INDEX");
		lblBodyMassIndex.setBackground(Color.YELLOW);
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblBodyMassIndex.setBounds(10, 11, 414, 41);
		frame.getContentPane().add(lblBodyMassIndex);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(434, 57, -427, -55);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(10, 11, 414, 61);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 113, 122, -9);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(10, 83, 414, 282);
		frame.getContentPane().add(panel_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Under Weight", "Normal Weight", "Over Weight", "Obese"},
				{"<18.5", "18.5 to  24.9", "25 to 29.9", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(20, 465, 392, 32);
		frame.getContentPane().add(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(10, 376, 414, 160);
		frame.getContentPane().add(panel_4);
	}
}

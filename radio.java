package sampleswing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class radio {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radio window = new radio();
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
	public radio() {
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
		
		JLabel lblInput = new JLabel("     Input");
		lblInput.setBounds(98, 36, 101, 14);
		frame.getContentPane().add(lblInput);
		
		tf = new JTextField();
		tf.setBounds(187, 33, 101, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblInputScale = new JLabel("   Input Scale");
		lblInputScale.setBounds(26, 70, 109, 14);
		frame.getContentPane().add(lblInputScale);
		
		JLabel lblOutputScale = new JLabel("    Output scale");
		lblOutputScale.setBounds(277, 67, 109, 20);
		frame.getContentPane().add(lblOutputScale);
		
		JRadioButton r1 = new JRadioButton("Celsius");
		r1.setBounds(35, 107, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton rd1 = new JRadioButton("Celsius");
		rd1.setSelected(true);
		rd1.setBounds(289, 107, 109, 23);
		frame.getContentPane().add(rd1);
		
		JRadioButton r2 = new JRadioButton("Fahrenheit");
		r2.setBounds(35, 133, 109, 38);
		frame.getContentPane().add(r2);
		
		JRadioButton rd2 = new JRadioButton("Fahrenheit");
		rd2.setBounds(289, 133, 109, 33);
		frame.getContentPane().add(rd2);
		
		JRadioButton r3 = new JRadioButton("Kelvin");
		r3.setBounds(35, 172, 109, 23);
		frame.getContentPane().add(r3);
		
		JRadioButton rd3 = new JRadioButton("Kelvin");
		rd3.setBounds(289, 169, 109, 23);
		frame.getContentPane().add(rd3);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(117, 221, 46, 14);
		frame.getContentPane().add(lblOutput);
		
		JLabel lb = new JLabel("");
		lb.setBounds(199, 221, 91, 14);
		frame.getContentPane().add(lb);
		ButtonGroup g=new ButtonGroup();
		ButtonGroup g2=new ButtonGroup();
		g.add(r1);
		g.add(r2);
		g.add(r3);
		g2.add(rd1);
		g2.add(rd2);
		g2.add(rd3);
		
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str=tf.getText();
				if(rd1.isSelected())
					lb.setText(Str);
				else if(rd2.isSelected())
				{
					float v=Float.parseFloat(Str);
					float f=(float)((1.80*v)+32.00);
					String str=String.valueOf(f);
					lb.setText(str);
				}
				else if(rd3.isSelected())
				{
					float v=Float.parseFloat(Str);
					float c=(float)(v+273.15);
					String str=String.valueOf(c);
					lb.setText(str);
				}
			}
		});
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=tf.getText();
				if(rd1.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((f-32)/1.8);
					String Str=String.valueOf(v);
					lb.setText(Str);
				}
				else if(rd2.isSelected())
					lb.setText(Str1);
				else if(rd3.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((float)((f+459.67)*5)/9);
					String str=String.valueOf(v);
					lb.setText(str);
				}
			}
		});
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=tf.getText();
				if(rd1.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((float)f-273.15);
					String Str=String.valueOf(v);
					lb.setText(Str);
				}
				else if(rd2.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((float)(f*1.8)-459.67);
					String str=String.valueOf(v);
					lb.setText(str);
				}
				else if(rd3.isSelected())
				{
					lb.setText(Str1);
				}
			}
		});
		
		rd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=tf.getText();
				if(r1.isSelected())
					lb.setText(Str1);
				else if(r2.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((f-32)/1.8);
					String Str=String.valueOf(v);
					lb.setText(Str);
				}
				else if(r3.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((float)f-273.15);
					String str=String.valueOf(v);
					lb.setText(str);
				}
			}
		});
		rd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=tf.getText();
				if(r1.isSelected())
				{
					float v=Float.parseFloat(Str1);
					float f=(float)((1.80*v)+32.00);
					String Str=String.valueOf(f);
					lb.setText(Str);
				}
				else if(r2.isSelected())
					lb.setText(Str1);
				else if(r3.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((float)(f*1.8)-459.67);
					String Str=String.valueOf(v);
					lb.setText(Str);
				}					
			}
		});
		rd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=tf.getText();
				if(r1.isSelected())
				{
					float v=Float.parseFloat(Str1);
					float c=(float)(v+273.15);
					String Str=String.valueOf(c);
					lb.setText(Str);
				}
				else if(r2.isSelected())
				{
					float f=Float.parseFloat(Str1);
					float v=(float)((float)((f+459.67)*5)/9);
					String Str=String.valueOf(v);
					lb.setText(Str);
				}
				else if(r3.isSelected())
				{
					lb.setText(Str1);
				}					
			}
		});
		
	}
}

	


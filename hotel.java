package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class hotel {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf8;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	public String str1,str2;
	public int f=0;
	public int df=0;
	public int cd[]= {10,35,90,15,20};
	public float cu[]= {1.0f,0.014f,0.052f,0.098f};
	public float tv=0.0f,hd,cost,cdq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotel window = new hotel();
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
	public hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1017, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel Management Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(281, 0, 404, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(20, 77, 395, 223);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setBounds(25, 22, 129, 14);
		panel.add(lblChickenBurger);
		
		tf1 = new JTextField();
		tf1.setText("0");
		tf1.setBounds(217, 19, 134, 20);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setBounds(25, 61, 141, 14);
		panel.add(lblChickenBurgerMeal);
		
		tf2 = new JTextField();
		tf2.setText("0");
		tf2.setBounds(217, 61, 134, 20);
		panel.add(tf2);
		tf2.setColumns(10);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setBounds(25, 99, 109, 14);
		panel.add(lblCheeseBurger);
		
		tf3 = new JTextField();
		tf3.setText("0");
		tf3.setBounds(217, 96, 134, 20);
		panel.add(tf3);
		tf3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(25, 124, 333, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(25, 133, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(227, 133, 46, 14);
		panel.add(lblQty);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"Tea", "coffee", "lime juice", "orange juice"}));
		cb.setBounds(25, 158, 129, 20);
		panel.add(cb);
		
		tf4 = new JTextField();
		tf4.setText("0");
		tf4.setBounds(217, 158, 134, 20);
		panel.add(tf4);
		tf4.setColumns(10);
		
		JRadioButton rd1 = new JRadioButton("Home Delivery");
		rd1.setBounds(25, 185, 109, 23);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Tax");
		rd2.setBounds(217, 185, 109, 23);
		panel.add(rd2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(436, 77, 265, 229);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyCoverter = new JLabel("       Currency Converter");
		lblCurrencyCoverter.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurrencyCoverter.setBounds(49, 11, 141, 24);
		panel_1.add(lblCurrencyCoverter);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Indian rupee", "UAE dirham", "USA dollar", "Chinese yuan"}));
		cb1.setBounds(36, 49, 154, 20);
		panel_1.add(cb1);
		
		tf8 = new JTextField();
		tf8.setEditable(false);
		tf8.setBounds(36, 97, 154, 20);
		panel_1.add(tf8);
		tf8.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n1=cb1.getSelectedIndex();
				float total=Float.parseFloat(tf11.getText());
				tf8.setText(String.valueOf((float)total*cu[n1]));
			}
		});
		btnConvert.setBounds(21, 154, 89, 23);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(142, 154, 89, 23);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(20, 322, 404, 140);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setBounds(24, 23, 129, 14);
		panel_2.add(lblCostOfDrinks);
		
		tf5 = new JTextField();
		tf5.setEditable(false);
		tf5.setBounds(210, 20, 137, 20);
		panel_2.add(tf5);
		tf5.setColumns(10);
		
		JLabel lblCostOfMeals = new JLabel("Cost of Meals");
		lblCostOfMeals.setBounds(24, 57, 110, 14);
		panel_2.add(lblCostOfMeals);
		
		tf6 = new JTextField();
		tf6.setEditable(false);
		tf6.setBounds(210, 51, 137, 20);
		panel_2.add(tf6);
		tf6.setColumns(10);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setBounds(24, 85, 129, 14);
		panel_2.add(lblCostOfDelivery);
		
		tf7 = new JTextField();
		tf7.setEditable(false);
		tf7.setBounds(210, 82, 137, 20);
		panel_2.add(tf7);
		tf7.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(436, 317, 265, 145);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lb1 = new JLabel("Tax");
		lb1.setBounds(21, 27, 95, 14);
		panel_3.add(lb1);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(21, 63, 95, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(21, 95, 82, 14);
		panel_3.add(lblTotal);
		
		tf9 = new JTextField();
		tf9.setEditable(false);
		tf9.setBounds(139, 24, 116, 20);
		panel_3.add(tf9);
		tf9.setColumns(10);
		
		tf10 = new JTextField();
		tf10.setEditable(false);
		tf10.setBounds(139, 60, 116, 20);
		panel_3.add(tf10);
		tf10.setColumns(10);
		
		tf11 = new JTextField();
		tf11.setEditable(false);
		tf11.setBounds(139, 92, 116, 20);
		panel_3.add(tf11);
		tf11.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(20, 473, 971, 85);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int chnbrg=Integer.parseInt(tf1.getText());
				int chnbm=Integer.parseInt(tf2.getText());
				int chesbg=Integer.parseInt(tf3.getText());
				int qnty=Integer.parseInt(tf4.getText());
				int drink=cb1.getSelectedIndex();
				hd=0;
				int tx=1;
				float tv=0.0f;
				if(rd1.isSelected())
				{
					hd=40;
					
				}
				if(rd2.isSelected())
				{
					lb1.setEnabled(true);
					tf9.setEnabled(true);
					tv=0.12f;
					tx=1;
				}
				 cdq=qnty*cd[drink];
				 cost=(chnbrg*48)+(chnbm*80)+(chesbg*80);
				 tf5.setText(String.valueOf(cdq));
				 tf6.setText(String.valueOf(cost));
				 tf7.setText(String.valueOf(hd));
				 float tt=(float)(cost+cdq);
				 tf10.setText(String.valueOf(tt));
				 tf11.setText(String.valueOf((float)(tt+(float)(tt*tx))+hd));
				 
				 if(tx==1)
				 {
					 tf9.setText(String.valueOf(tt*.12));
				 }
				 else
				 {
					 tf9.setText("0");
				 }

			}
		});
		btnTotal.setBounds(67, 23, 117, 39);
		panel_5.add(btnTotal);
		JTextArea TA = new JTextArea();
		TA.setBounds(10, 11, 255, 335);
		
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float total=cdq+cost;
				total=total+(total*tv)+hd;
				
				total=total+(total*tv);
				TA.setText("       HOTEL         \n"
						+ "--------------------------\n"
						+ "Cost of Drinks         "+cdq+"  \n"
						+ "Cost of Meals          "+cost+"  \n"
						+ "Delivery Charge        "+hd+"  \n"
						+ "Tax                    "+tf9.getText()+"  \n"
						+ "Grand Total            "+tf11.getText());
			}
		});
		btnReceipt.setBounds(278, 23, 130, 39);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf1.setText("0");
				tf2.setText("0");
				tf3.setText("0");
				tf4.setText("0");
				tf5.setText("0");
				tf6.setText("0");
				tf7.setText("0");
				tf8.setText("");
				tf9.setText("0");
				tf10.setText("0");
				tf11.setText("0");
				TA.setText("");

			}
		});
		btnReset.setBounds(498, 23, 147, 39);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(753, 23, 111, 39);
		panel_5.add(btnExit);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(711, 77, 280, 385);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setLayout(null);
		
		JButton B = new JButton("B");
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		B.setBounds(16, 68, 57, 37);
		panel_6.add(B);
		
		JButton C = new JButton("C");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf12.setText("");
				f=0;
			}
		});
		C.setBounds(75, 68, 57, 37);
		panel_6.add(C);
		
		JButton btnNewButton_2 = new JButton("...");
		btnNewButton_2.setBounds(135, 68, 57, 36);
		panel_6.add(btnNewButton_2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str1=tf12.getText();
				str2=plus.getText();
				tf12.setText("");
			}
		});
		plus.setBounds(195, 68, 55, 37);
		panel_6.add(plus);
		
		tf12 = new JTextField();
		tf12.setBounds(28, 11, 207, 43);
		panel_6.add(tf12);
		tf12.setColumns(10);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b7.getText()));
				
				
			}
		});
		b7.setBounds(16, 115, 57, 37);
		panel_6.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(72, 116, 60, 36);
		panel_6.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(135, 115, 57, 37);
		panel_6.add(b9);
		
		JButton min = new JButton("-");
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str1=tf12.getText();
				str2=min.getText();
				tf12.setText("");
			}
		});
		min.setBounds(195, 116, 55, 36);
		panel_6.add(min);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(16, 163, 57, 38);
		panel_6.add(b4);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(16, 212, 57, 37);
		panel_6.add(b1);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(zero.getText()));
			}
		});
		zero.setBounds(16, 260, 57, 40);
		panel_6.add(zero);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(75, 163, 57, 38);
		panel_6.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(135, 164, 57, 37);
		panel_6.add(b6);
		
		JButton star = new JButton("*");
		star.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str1=tf12.getText();
				str2=star.getText();
				tf12.setText("");
			}
		});
		star.setBounds(193, 163, 57, 38);
		panel_6.add(star);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(75, 212, 57, 37);
		panel_6.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					tf12.setText("");
					f=0;
				}
				tf12.setText(tf12.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(135, 212, 57, 37);
		panel_6.add(b3);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str1=tf12.getText();
				str2=bdiv.getText();
				tf12.setText("");
			}
		});
		bdiv.setBounds(195, 212, 55, 37);
		panel_6.add(bdiv);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(df==0)
				{
					tf12.setText(tf12.getText().concat(dot.getText()));
					df=1;
				}
			}
		});
		dot.setBounds(75, 260, 57, 40);
		panel_6.add(dot);
		
		JButton btnNewButton_17 = new JButton("...");
		btnNewButton_17.setBounds(135, 260, 57, 40);
		panel_6.add(btnNewButton_17);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f++;
				String str3=tf12.getText();
				tf12.setText("");
				float a=Float.parseFloat(str1);
				float b=Float.parseFloat(str3);
				if(str2.contentEquals("*"))
				{
					float r=a*b;
					String r2=String.valueOf(r);
					tf12.setText(r2);
					
				}
				if(str2.contentEquals("/"))
				{
					float r=a/b;
					String r2=String.valueOf(r);
					tf12.setText(r2);
				}
				if(str2.contentEquals("+"))
				{
					float r=a+b;
					String r2=String.valueOf(r);
					tf12.setText(r2);
				}
				if(str2.contentEquals("-"))
				{
					float r=a-b;
					String r2=String.valueOf(r);
					tf12.setText(r2);
				}
			}
		});
		equal.setBounds(193, 260, 57, 40);
		panel_6.add(equal);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		panel_4.add(TA);
		
	}
}

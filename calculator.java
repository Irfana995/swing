package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	public String str1,str2;
	public int df;
	public int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
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
		
		textField = new JTextField();
		textField.setBounds(10, 39, 414, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(10, 5, 81, 23);
		frame.getContentPane().add(btnEdit);
		
		JButton btnView = new JButton("view");
		btnView.setBounds(85, 5, 86, 23);
		frame.getContentPane().add(btnView);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(155, 5, 94, 23);
		frame.getContentPane().add(btnHelp);
		
		JButton btnScientific = new JButton("Scientific");
		btnScientific.setBounds(10, 71, 143, 23);
		frame.getContentPane().add(btnScientific);
		
		JButton btnStandard = new JButton("Standard");
		btnStandard.setBounds(276, 71, 148, 23);
		frame.getContentPane().add(btnStandard);
		
		JButton bsqrt = new JButton("sqrt");
		bsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText("");
				int a=Integer.parseInt(str1);
				float r=(float)(Math.sqrt(a));
				String r2=String.valueOf(r);
				textField.setText(r2);
			}
		});
		bsqrt.setBounds(10, 96, 65, 35);
		frame.getContentPane().add(bsqrt);
		
		JButton b1x = new JButton("1/x");
		b1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str1=textField.getText();
				textField.setText("");
				float a=Float.parseFloat(str1);
				float r=1/a;
				String r2=String.valueOf(r);
				textField.setText(r2);
			}
		});
		b1x.setBounds(76, 96, 55, 35);
		frame.getContentPane().add(b1x);
		
		JButton bsin = new JButton("sin");
		bsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float bsin=Float.parseFloat(textField.getText());
				textField.setText("");
				float sin=(float)(Math.sin(bsin));
				String str=String.valueOf(sin);
				textField.setText(str);
				f=1;
			}
		});
		bsin.setBounds(135, 96, 55, 35);
		frame.getContentPane().add(bsin);
		
		JButton bmod = new JButton("%");
		bmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText("");
				float a=Float.parseFloat(str1);
				float r=a/100;
				String r2=String.valueOf(r);
				textField.setText(r2);
			}
		});
		bmod.setBounds(10, 136, 65, 35);
		frame.getContentPane().add(bmod);
		
		JButton bexp = new JButton("Exp");
		bexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str1=textField.getText();
				textField.setText("");
				float a=Float.parseFloat(str1);
				float r=(float)(Math.exp(a));
				String r2=String.valueOf(r);
				textField.setText(r2);	
			}
		});
		bexp.setBounds(76, 136, 55, 35);
		frame.getContentPane().add(bexp);
		
		JButton bcos = new JButton("cos");
		bcos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					float bcos=Float.parseFloat(textField.getText());
					textField.setText("");
					float cos=(float)(Math.cos(bcos));
					String str=String.valueOf(cos);
					textField.setText(str);
					f=1;
			}
			
		});
		bcos.setBounds(135, 136, 55, 35);
		frame.getContentPane().add(bcos);
		
		JButton bxy = new JButton("x^y");
		bxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				textField.setText("");
				str2=bxy.getText();
				
			}
		});
		bxy.setBounds(10, 177, 65, 35);
		frame.getContentPane().add(bxy);
		
		JButton bln = new JButton("ln");
		bln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText("");
				float a=Float.parseFloat(str1);
				float r=(float)(Math.log(a));
				String r2=String.valueOf(r);
				textField.setText(r2);
			}
		});
		bln.setBounds(76, 177, 55, 35);
		frame.getContentPane().add(bln);
		
		JButton btan = new JButton("tan");
		btan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					float btan=Float.parseFloat(textField.getText());
					textField.setText("");
					float tan=(float)(Math.tan(btan));
					String str=String.valueOf(tan);
					textField.setText(str);
					f=1;
			}
		});
		btan.setBounds(135, 177, 55, 35);
		frame.getContentPane().add(btan);
		
		JButton bx2 = new JButton("x^2");
		bx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText("");
				float a=Float.parseFloat(str1);
				float r=a*a;
				String r2=String.valueOf(r);
				textField.setText(r2);
			}
		});
		bx2.setBounds(10, 216, 65, 35);
		frame.getContentPane().add(bx2);
		
		JButton bn = new JButton("n!");
		bn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				textField.setText("");
				int a=Integer.parseInt(str1);
				int f=1,i;
				for(i=1;i<=a;i++)
				{
					f=f*i;
				}
				String r2=String.valueOf(f);
				textField.setText(r2);
				
			}
		});
		bn.setBounds(76, 216, 55, 35);
		frame.getContentPane().add(bn);
		
		JButton bsec = new JButton("sec");
		bsec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float bcos=Float.parseFloat(textField.getText());
				textField.setText("");
				float cos=(float)(Math.cos(bcos));
				float sec=1/cos;
				String str=String.valueOf(sec);
				textField.setText(str);
				f=1;
			}
		});
		bsec.setBounds(135, 216, 55, 35);
		frame.getContentPane().add(bsec);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b7.getText()));
				
				
			}
		});
		b7.setBounds(190, 96, 55, 35);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b8.getText()));
			}
			
		});
		b8.setBounds(248, 96, 55, 35);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(303, 96, 55, 35);
		frame.getContentPane().add(b9);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=bdiv.getText();
				textField.setText("");
			}
		});
		bdiv.setBounds(359, 96, 65, 35);
		frame.getContentPane().add(bdiv);
		
		JButton bsta = new JButton("*");
		bsta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=bsta.getText();
				textField.setText("");
				
			}
			
		});
		bsta.setBounds(359, 136, 65, 35);
		frame.getContentPane().add(bsta);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(303, 136, 55, 35);
		frame.getContentPane().add(b6);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(248, 136, 55, 35);
		frame.getContentPane().add(b5);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(190, 136, 55, 35);
		frame.getContentPane().add(b4);
		
		JButton bmin = new JButton("-");
		bmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=bmin.getText();
				textField.setText("");
			}
		});
		bmin.setBounds(359, 177, 65, 35);
		frame.getContentPane().add(bmin);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(303, 177, 55, 35);
		frame.getContentPane().add(b3);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(248, 177, 55, 35);
		frame.getContentPane().add(b2);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
				textField.setText(textField.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(190, 177, 55, 35);
		frame.getContentPane().add(b1);
		
		JButton bpl = new JButton("+");
		bpl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=bpl.getText();
				textField.setText("");
			}
		});
		bpl.setBounds(359, 216, 65, 35);
		frame.getContentPane().add(bpl);
		
		JButton beq = new JButton("=");
		beq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				String str3=textField.getText();
				textField.setText("");
				float a=Float.parseFloat(str1);
				float b=Float.parseFloat(str3);
				if(str2.contentEquals("*"))
				{
					float r=a*b;
					String r2=String.valueOf(r);
					textField.setText(r2);
				}
				if(str2.equals("x^y"))
				{
				float n=Float.parseFloat(str1);
				float m=Float.parseFloat(str3);
				float r=(float)(Math.pow(n,m));
				String r2=String.valueOf(r);
				textField.setText(r2);
				}
				if(str2.contentEquals("/"))
				{
					float r=a/b;
					String r2=String.valueOf(r);
					textField.setText(r2);
				}
				if(str2.contentEquals("+"))
				{
					float r=a+b;
					String r2=String.valueOf(r);
					textField.setText(r2);
				}
				if(str2.contentEquals("-"))
				{
					float r=a-b;
					String r2=String.valueOf(r);
					textField.setText(r2);
				}
			}
		});
		beq.setBounds(303, 216, 55, 35);
		frame.getContentPane().add(beq);
		
		JButton bt = new JButton(".");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(df==0)
				{
					textField.setText(textField.getText().concat(bt.getText()));
					df=1;
				}
			}
		});
		bt.setBounds(248, 216, 55, 35);
		frame.getContentPane().add(bt);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField.setText("");
					f=0;
				}
			textField.setText(textField.getText().concat(b0.getText()));
				
			}
		});
		b0.setBounds(190, 216, 55, 35);
		frame.getContentPane().add(b0);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				f=0;
			}
		});
		btnClear.setBounds(163, 71, 89, 23);
		frame.getContentPane().add(btnClear);
	}

}

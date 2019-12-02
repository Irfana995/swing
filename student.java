package sampleswing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class student {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField n1;
	private JTextField n2;
	private JTextField n3;
	private JTextField n5;
	private JTextField n6;
	private JTextField n7;
	private JTextField n8;
	private JTable tb;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField n4;
	public String g;
	public String str[]=new String[20];
	protected JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
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
	public student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 893, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentId = new JLabel("Student Id");
		lblStudentId.setBounds(25, 22, 90, 14);
		frame.getContentPane().add(lblStudentId);
		
		tf1 = new JTextField();
		tf1.setBounds(101, 19, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(25, 52, 78, 14);
		frame.getContentPane().add(lblFirstName);
		
		tf2 = new JTextField();
		tf2.setBounds(101, 49, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblSurName = new JLabel("Sur Name");
		lblSurName.setBounds(25, 77, 60, 23);
		frame.getContentPane().add(lblSurName);
		
		tf3 = new JTextField();
		tf3.setBounds(101, 78, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course code");
		lblCourseCode.setBounds(25, 111, 68, 14);
		frame.getContentPane().add(lblCourseCode);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"11032B", "11032A", "11032E"}));
		cb.setBounds(101, 109, 86, 20);
		frame.getContentPane().add(cb);
		
		JLabel lblStudentDetails = new JLabel("Student Details");
		lblStudentDetails.setBounds(148, 0, 143, 14);
		frame.getContentPane().add(lblStudentDetails);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(217, 22, 46, 14);
		frame.getContentPane().add(lblMaths);
		
		n1 = new JTextField();
		n1.setBounds(285, 19, 86, 20);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(217, 52, 46, 31);
		frame.getContentPane().add(lblEnglish);
		
		n2 = new JTextField();
		n2.setBounds(285, 52, 86, 23);
		frame.getContentPane().add(n2);
		n2.setColumns(10);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(217, 94, 46, 23);
		frame.getContentPane().add(lblBiology);
		
		n3 = new JTextField();
		n3.setBounds(285, 89, 86, 20);
		frame.getContentPane().add(n3);
		n3.setColumns(10);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setBounds(217, 128, 68, 23);
		frame.getContentPane().add(lblComputer);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 374, 295);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPhysics = new JLabel("Chemistry");
		lblPhysics.setBounds(209, 158, 61, 31);
		panel.add(lblPhysics);
		
		n5 = new JTextField();
		n5.setBounds(278, 163, 86, 20);
		panel.add(n5);
		n5.setColumns(10);
		
		JLabel lblPhysics_1 = new JLabel("Physics");
		lblPhysics_1.setBounds(209, 200, 46, 14);
		panel.add(lblPhysics_1);
		
		n6 = new JTextField();
		n6.setBounds(278, 194, 86, 20);
		panel.add(n6);
		n6.setColumns(10);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(209, 225, 46, 14);
		panel.add(lblTamil);
		
		n7 = new JTextField();
		n7.setBounds(278, 222, 86, 20);
		panel.add(n7);
		n7.setColumns(10);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(209, 259, 61, 14);
		panel.add(lblMalayalam);
		
		n8 = new JTextField();
		n8.setBounds(278, 253, 86, 20);
		panel.add(n8);
		n8.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 145, 174, 2);
		panel.add(separator_2);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setBounds(20, 166, 70, 14);
		panel.add(lblTotalScore);
		
		tf4 = new JTextField();
		tf4.setBounds(98, 163, 86, 20);
		panel.add(tf4);
		tf4.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(20, 210, 46, 14);
		panel.add(lblAverage);
		
		tf5 = new JTextField();
		tf5.setBounds(98, 207, 86, 20);
		panel.add(tf5);
		tf5.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setBounds(20, 256, 46, 14);
		panel.add(lblRanking);
		
		tf6 = new JTextField();
		tf6.setBounds(98, 250, 86, 20);
		panel.add(tf6);
		tf6.setColumns(10);
		
		n4 = new JTextField();
		n4.setBounds(278, 114, 86, 20);
		panel.add(n4);
		n4.setColumns(10);
		
		JLabel lblStudentRecord = new JLabel("   Student Record");
		lblStudentRecord.setBounds(517, 0, 143, 23);
		frame.getContentPane().add(lblStudentRecord);
		
		tb = new JTable();
		tb.setBackground(Color.PINK);
		tb.setBounds(10, 369, 857, 64);
		tb.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_Id", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total_Score", "Average", "Ranking"},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		tb.getColumnModel().getColumn(0).setPreferredWidth(60);
		tb.getColumnModel().getColumn(1).setPreferredWidth(57);
		tb.getColumnModel().getColumn(2).setPreferredWidth(43);
		tb.getColumnModel().getColumn(3).setPreferredWidth(44);
		tb.getColumnModel().getColumn(4).setPreferredWidth(41);
		tb.getColumnModel().getColumn(5).setPreferredWidth(55);
		tb.getColumnModel().getColumn(6).setPreferredWidth(59);
		tb.getColumnModel().getColumn(7).setPreferredWidth(45);
		tb.getColumnModel().getColumn(8).setPreferredWidth(35);
		tb.getColumnModel().getColumn(9).setPreferredWidth(50);
		tb.getColumnModel().getColumn(10).setPreferredWidth(54);
		tb.getColumnModel().getColumn(11).setPreferredWidth(47);
		tb.getColumnModel().getColumn(12).setPreferredWidth(23);
		tb.getColumnModel().getColumn(12).setMinWidth(23);
		tb.getColumnModel().getColumn(12).setMaxWidth(23);
		frame.getContentPane().add(tb);
		
		JButton btnAddReport = new JButton("Add report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n[]=new float[18];
				String studentid=tf1.getText();
				String code=String.valueOf(cb.getSelectedItem());
				n[1]=Float.parseFloat(n1.getText());
				n[2]=Float.parseFloat(n2.getText());
				n[3]=Float.parseFloat(n3.getText());
				n[4]=Float.parseFloat(n4.getText());
				n[5]=Float.parseFloat(n5.getText());
				n[6]=Float.parseFloat(n6.getText());
				n[7]=Float.parseFloat(n7.getText());
				n[8]=Float.parseFloat(n8.getText());
				for(int i=1;i<=8;i++)
				{
					n[9]=n[9]+n[i];
				}
				n[10]=n[9]/8;
				//String str[]=new String[14];
				for(int i=1;i<=10;i++)
				{
					str[i]=String.valueOf(n[i]);
				}
				if(n[9]>40)
					g=("PASSED");
				else
					g=("FAILED");
				tf4.setText(str[9]);
				tf5.setText(str[10]);
				tf6.setText(g);
				DefaultTableModel model=(DefaultTableModel) tb.getModel();
				model.addRow(new String[] {studentid,code,str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10],g});
		}
		});
		btnAddReport.setBounds(87, 444, 89, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton delet = new JButton("Delete");
		delet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) tb.getModel();
				if(tb.getSelectedRow()==-1)
				{
				if(tb.getRowCount()==0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(tb.getSelectedRow());
				}
			}
		});
		delet.setBounds(217, 444, 89, 23);
		frame.getContentPane().add(delet);
		
		JButton btnShowReport = new JButton("Show report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel ta = null;
				ta.setText("                 REPORT CARD\n\nStudent Name :   "+ tf2.getText()+" "+ tf3.getText()+"\n\n-------------------------------------------"
						+"\nMATH		"+str[1]+"\n"
						+"ENGLISH	"+str[2]+"\n"
						+"BIOLOGY	"+str[3]+"\n"
						+"COMPUTER	"+str[4]+"\n"
						+"CHEMISTRY  "+str[5]+"\n"
						+"PHYSICS	"+str[6]+"\n"
						+"TAMIL	    "+str[7]+"\n"
						+"MALAYALAM	"+str[8]+"\n-------------------------------------------"
						+"\nTOTAL SCORE"+str[9]+"\n"
						+"AVERAGE	 "+str[10]+"\n"
						+"RANKING	 "+g);
			}
		});
		btnShowReport.setBounds(337, 444, 123, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(505, 444, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(648, 444, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(406, 25, 461, 315);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 11, 441, 248);
		panel_1.add(ta);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		btnClear.setBounds(323, 270, 89, 23);
		panel_1.add(btnClear);
	}
}

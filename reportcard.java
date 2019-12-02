package sampleswing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
public class REPORTCARD {
	String str[]=new String[14];
	String g;
private JFrame frame;
private JTextField sid;
private JTextField fna;
private JTextField sna;
private JTextField ts;
private JTextField avg;
private JTextField rnk;
private JTextField math;
private JTextField eng;
private JTextField bio;
private JTextField com;
private JTextField che;
private JTextField phy;
private JTextField tam;
private JTextField mal;
private JTable TB;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
REPORTCARD window = new REPORTCARD();
window.frame.setVisible(true);
} catch (Exception e) {
}
}
});
}
/**
* Create the application.
*/
public REPORTCARD() {
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("Student Report");
frame.getContentPane().setBackground(Color.PINK);
frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
frame.setBounds(100, 100, 805, 526);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JPanel panel = new JPanel();
panel.setBackground(Color.CYAN);
panel.setBounds(10, 11, 333, 323);
frame.getContentPane().add(panel);
panel.setLayout(null);
JLabel lblStudentId = new JLabel("Student iD");
lblStudentId.setBounds(10, 41, 75, 14);
panel.add(lblStudentId);
JLabel lblFirstName = new JLabel("First Name");
lblFirstName.setBounds(10, 69, 75, 14);
panel.add(lblFirstName);
JLabel lblSurname = new JLabel("Surname");
lblSurname.setBounds(10, 94, 63, 14);
panel.add(lblSurname);
JLabel lblCourseCode = new JLabel("Course code");
lblCourseCode.setBounds(10, 119, 75, 14);
panel.add(lblCourseCode);
JLabel lblTotalScore = new JLabel("Total Score");
lblTotalScore.setBounds(10, 168, 75, 14);
panel.add(lblTotalScore);
JLabel lblAverage = new JLabel("Average");
lblAverage.setBounds(10, 193, 75, 14);
panel.add(lblAverage);
JLabel lblRanking = new JLabel("Ranking");
lblRanking.setBounds(10, 218, 46, 14);
panel.add(lblRanking);
sid = new JTextField();
sid.setBounds(83, 38, 86, 20);
panel.add(sid);
sid.setColumns(10);
fna = new JTextField();
fna.setBounds(83, 66, 86, 20);
panel.add(fna);
fna.setColumns(10);
sna = new JTextField();
sna.setBounds(83, 91, 86, 20);
panel.add(sna);
sna.setColumns(10);
ts = new JTextField();
ts.setEditable(false);
ts.setBounds(83, 165, 86, 20);
panel.add(ts);
ts.setColumns(10);
avg = new JTextField();
avg.setEditable(false);
avg.setBounds(83, 193, 86, 20);
panel.add(avg);
avg.setColumns(10);
rnk = new JTextField();
rnk.setEditable(false);
rnk.setBounds(83, 215, 86, 20);
panel.add(rnk);
rnk.setColumns(10);
JLabel lblMaths = new JLabel("Maths");
lblMaths.setBounds(181, 41, 46, 14);
panel.add(lblMaths);
JLabel lblEnglish = new JLabel("English");
lblEnglish.setBounds(179, 69, 46, 14);
panel.add(lblEnglish);
JLabel lblBiology = new JLabel("Biology");
lblBiology.setBounds(179, 94, 46, 14);
panel.add(lblBiology);
JLabel lblComputer = new JLabel("Computer");
lblComputer.setBounds(179, 116, 59, 14);
panel.add(lblComputer);
JLabel lblChemistry = new JLabel("Chemistry");
lblChemistry.setBounds(181, 139, 59, 18);
panel.add(lblChemistry);
JLabel lblPhysics = new JLabel("Physics");
lblPhysics.setBounds(179, 165, 46, 14);
panel.add(lblPhysics);
JLabel lblTamil = new JLabel("Tamil");
lblTamil.setBounds(179, 190, 46, 14);
panel.add(lblTamil);
JLabel lblMalayalam = new JLabel("Malayalam");
lblMalayalam.setBounds(179, 218, 59, 14);
panel.add(lblMalayalam);
math = new JTextField();
math.setBounds(237, 38, 86, 20);
panel.add(math);
math.setColumns(10);
eng = new JTextField();
eng.setBounds(235, 66, 86, 20);
panel.add(eng);
eng.setColumns(10);
bio = new JTextField();
bio.setBounds(237, 91, 86, 20);
panel.add(bio);
bio.setColumns(10);
com = new JTextField();
com.setBounds(237, 116, 86, 20);
panel.add(com);
com.setColumns(10);
che = new JTextField();
che.setBounds(237, 141, 86, 20);
panel.add(che);
che.setColumns(10);
phy = new JTextField();
phy.setBounds(237, 165, 86, 20);
panel.add(phy);
phy.setColumns(10);
tam = new JTextField();
tam.setBounds(237, 190, 86, 20);
panel.add(tam);
tam.setColumns(10);
mal = new JTextField();
mal.setBounds(237, 215, 86, 20);
panel.add(mal);
mal.setColumns(10);
JLabel lblStudentDetails = new JLabel("Student Details");
lblStudentDetails.setBounds(125, 11, 102, 14);
panel.add(lblStudentDetails);
JComboBox cmb = new JComboBox();
cmb.setModel(new DefaultComboBoxModel(new String[] {"<select course code>", "MCA003", "MBA002", "MCAL02", "BBA0003"}));
cmb.setBounds(81, 116, 88, 20);
panel.add(cmb);
JSeparator separator = new JSeparator();
separator.setBounds(147, 139, -120, 7);
panel.add(separator);
JPanel panel_1 = new JPanel();
panel_1.setBackground(Color.CYAN);
panel_1.setBounds(353, 11, 426, 337);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);
JTextArea TA = new JTextArea();
TA.setEditable(false);
TA.setToolTipText("");
TA.setBounds(22, 28, 394, 265);
panel_1.add(TA);
JLabel label = new JLabel("Student Record");
label.setForeground(Color.RED);
label.setBounds(169, 11, 100, 14);
panel_1.add(label);
JButton clr = new JButton("clear");
clr.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		TA.setText("");
	}
});
clr.setBounds(180, 303, 89, 23);
panel_1.add(clr);
JButton btnNewButton = new JButton("DELETE");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		DefaultTableModel model=(DefaultTableModel) TB.getModel();
		if(TB.getSelectedRow()==-1)
		{
		if(TB.getRowCount()==0)
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
		model.removeRow(TB.getSelectedRow());
		}
	}
});
btnNewButton.setBounds(262, 454, 89, 23);
frame.getContentPane().add(btnNewButton);
JButton btnNewButton_1 = new JButton("SHOW REPORT");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		TA.setText("                 REPORT CARD\n\nStudent Name :   "+ fna.getText()+" "+ sna.getText()+"\n\n-------------------------------------------"
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
btnNewButton_1.setBounds(361, 454, 111, 23);
frame.getContentPane().add(btnNewButton_1);
JButton btnNewButton_2 = new JButton("EXIT");
btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
});
btnNewButton_2.setBounds(482, 454, 89, 23);
frame.getContentPane().add(btnNewButton_2);
JButton btnNewButton_3 = new JButton("RESET");
btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	sid.setText("");
	fna.setText("");
	sna.setText("");
	ts.setText("");
	rnk.setText("");
	avg.setText("");
	math.setText("");
	eng.setText("");
	bio.setText("");
	com.setText("");
	che.setText("");
	phy.setText("");
	tam.setText("");
	mal.setText("");
	//TB.clearSelection();
	}
});
btnNewButton_3.setBounds(581, 454, 89, 23);
frame.getContentPane().add(btnNewButton_3);
JButton btnNewButton_4 = new JButton("ADD REPORT");
btnNewButton_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		int nn=0;
		float n[]=new float[18];
		String suid=sid.getText();
		String cid=String.valueOf(cmb.getSelectedItem());
		n[1]=Float.parseFloat(math.getText());
		n[2]=Float.parseFloat(eng.getText());
		n[3]=Float.parseFloat(bio.getText());
		n[4]=Float.parseFloat(com.getText());
		n[5]=Float.parseFloat(che.getText());
		n[6]=Float.parseFloat(phy.getText());
		n[7]=Float.parseFloat(tam.getText());
		n[8]=Float.parseFloat(mal.getText());
		for(int i=1;i<=8;i++)
		{
			n[9]=n[9]+n[i];
		}
		n[10]=n[9]/8;
		for(int i=1;i<=10;i++)
		{
			str[i]=String.valueOf(n[i]);
		}
		for(int i=1;i<=10;i++)
		{
			if(str[i].equals(null))
				nn=1;
		}
		if(n[9]>n[10])
			g="PASSED";
		else
			g="FAILED";
		ts.setText(str[9]);
		avg.setText(str[10]);
		rnk.setText(g);
		if(nn==0)
		{
		DefaultTableModel model=(DefaultTableModel) TB.getModel();
		model.addRow(new String[] {suid,cid,str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10],g});
		JOptionPane.showMessageDialog(null, "Report Added",
				"Student Result",JOptionPane.OK_OPTION);
		}
		else
		{
		JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS",
		"Student Result",JOptionPane.OK_OPTION);
		}
	}
});
btnNewButton_4.setBounds(150, 454, 103, 23);
frame.getContentPane().add(btnNewButton_4);
TB = new JTable(13,4);
TB.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
TB.setModel(new DefaultTableModel(
	new Object[][] {
		{"Student ID", "Course Name", "MATHS", "ENGLISH", "BIOLOGY", "COMPUTER", "CHEMISTRY", "PHYSICS", "MALAYALAM", "TAMIL", "TOTAL", "AVERAGE", "RANK"},
	},
	new String[] {
		"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
	}
));
TB.setBounds(10, 363, 769, 84);
frame.getContentPane().add(TB);
}
}
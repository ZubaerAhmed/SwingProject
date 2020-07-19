package BanglaAnisul;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_Panel extends JFrame {

	private Container con;
	private JPanel panel1, panel2;
	
	C_Panel(){
		init();
		myPanel();
	}
	
	public void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setSize(600, 410);
		this.setLocation(300, 200);
		this.setTitle("Anisur Panel");
		this.setVisible(true);

	}
	
	public void myPanel() {
		con = this.getContentPane();
		con.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setBounds(10,50,100,250);
		panel1.setBackground(Color.blue);
		con.add(panel1);
		 
		panel2 = new JPanel();
		panel2.setLocation(120, 50);
		panel2.setSize(440, 250);
		panel2.setBackground(Color.LIGHT_GRAY);
		con.add(panel2);
//---------------------------------------------
		//Header
//		  JPanel top = new JPanel();
//		  //top.setBounds(5,5,560,40);
//		  top.setSize(600, 40);
//		  top.setBackground(Color.LIGHT_GRAY); 
//		  
//		  //con.add(top); 
//		  JLabel label1 = new JLabel("Digital Laboratory"); 
//		  top.add(label1);
//		  con.add(top, BorderLayout.NORTH);
//---------------------------------------------		
//		  //Footer 
//		  JPanel footer = new JPanel();
//		  footer.setSize(600, 30);
//		  footer.setBackground(Color.LIGHT_GRAY); 
//		  String date = new java.util.Date().toString(); 
//		  JLabel footerText = new JLabel(date);
//		  footer.add(footerText); 
//		  con.add(footer, BorderLayout.SOUTH);		

}
}

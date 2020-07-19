package CaveOfProgramming;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_Panel extends B_Frame {

	static Container main;
	
	public static void myPanel() {
	  //------------------------------------------------------------------- JButton
	  JButton button1 = new JButton("button1"); 
	  JButton button2 = new JButton("button2");
	  JButton button3 = new JButton("SUBMIT");
	  
	  JLabel label1 = new JLabel("Digital Laboratory"); 
	  JLabel label2 = new JLabel("User Name"); 
	  JLabel label3 = new JLabel("Password"); 
	  String date = new java.util.Date().toString(); 
	  JLabel footerText = new JLabel(date); 
	  //label1.setBackground(Color.WHITE);
	  //------------------------------------------------------------------
	  
	  //Main Panel 
	  main = frame.getContentPane(); 
	  main.setLayout(new BorderLayout(8,6)); 
	  main.setBackground(Color.lightGray);
	  frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));
	  
	  //------------------------------------------------------- 
	  //Header
	  JPanel top = new JPanel();
	  top.setBorder(BorderFactory.createEmptyBorder(5,50,5,50));
	  //top.setBackground(Color.BLUE); 
	  main.add(top, BorderLayout.NORTH);
	  top.add(label1);
	  
	  //--------------------------------------------------------
	  
	  //Footer 
	  JPanel footer = new JPanel();
	  footer.setBorder(BorderFactory.createEmptyBorder(20,5,5,5));
	  //footer.setBackground(Color.BLUE); 
	  footer.add(footerText); 
	  main.add(footer, BorderLayout.SOUTH);
	 
}
}

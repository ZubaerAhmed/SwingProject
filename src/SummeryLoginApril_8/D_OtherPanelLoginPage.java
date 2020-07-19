package SummeryLoginApril_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class D_OtherPanelLoginPage extends C_LoginLabel{
	
	Container con;
	JFrame frame;
	JPanel top, footer, leftNav;
	
	D_OtherPanelLoginPage(JFrame frame, Container con){
		this.frame = frame;
		this.con = con;
	}
	
	public void myLabel(JFrame frame, Container con)  {			
		
		//Header Panel
		top = new JPanel();
		top.setBorder(new LineBorder(Color.black));
		//top.setBackground(Color.BLUE);
		Font font = new Font("Arial",Font.BOLD, 16);
		label1.setFont(font);
		label1.setForeground(Color.BLUE);		
		//label3.setToolTipText("USERNAME");
		top.add(label1);
		con.add(top, BorderLayout.NORTH);
		//------------------------------------------------
		//Footer Panel
		footer = new JPanel();
		footer.setBorder(new LineBorder(Color.black));
		footer.setBackground(Color.LIGHT_GRAY);
		String date = new java.util.Date().toString(); 
		JLabel footerText = new JLabel(date);
		footer.add(footerText);
		con.add(footer, BorderLayout.SOUTH);
		//-------------------------------------------------
		//Left Nav Panel
		leftNav = new JPanel();
		leftNav.setBorder(new LineBorder(Color.black, 3));
		leftNav.setBackground(Color.LIGHT_GRAY);
		leftNav.add(loginButton);
		leftNav.add(registerButton);
		leftNav.setLayout(new GridLayout(4,1));
		con.add(leftNav, BorderLayout.WEST);
//-------------------------------------------
	
		loginLabel(con); 
	}
}


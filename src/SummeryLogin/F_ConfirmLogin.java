package SummeryLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class F_ConfirmLogin {

	
	JPanel grid;
	JLabel loginConfirm; 
	
	//Login Confirm Panel page
	public void myRegister(Container con){
		grid = new JPanel();
		grid.setBorder(new LineBorder(Color.black));
		grid.setBackground(Color.LIGHT_GRAY);
		
		
		loginConfirm = new JLabel("Login Succesfull");
		grid.add(loginConfirm);
		
		con.add(grid); 
		con.add(grid, BorderLayout.CENTER);
	} 
}

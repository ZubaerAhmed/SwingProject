package BanglaAnisul;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class D_Label extends B_Frame{

	
	public void init() {
		c = this.getContentPane();
		c.setLayout(null); 
		c.setBackground(Color.LIGHT_GRAY);		

		font = new Font("Arial",Font.BOLD, 16);
		user = new JLabel();
		user.setText("Enter your username: ");
		user.setBounds(50, 100, 200, 50);
		user.setFont(font);
		user.setForeground(Color.BLUE);
		user.setToolTipText("USERNAME");
		c.add(user);
		
		pass = new JLabel("Enter your password: ");
		pass.setBounds(50, 150, 200, 50); 
		pass.setFont(font); 
		pass.setForeground(Color.BLUE); 
		pass.setToolTipText("PASSWORD");
		c.add(pass);
	}
}

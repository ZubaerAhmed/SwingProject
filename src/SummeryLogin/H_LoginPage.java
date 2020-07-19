package SummeryLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class H_LoginPage extends H_HomePage{


	JPanel loginPanel; 
	BoxLayout box; 
//	Container con;

	
	//Login Panel Method
	public void loginPanel( Container con){
		loginPanel = new JPanel(); 
		loginPanel.setLayout(null); 
		box = new BoxLayout(loginPanel, BoxLayout.Y_AXIS);
		loginPanel.setLayout(box); 
		loginPanel.setBorder(new LineBorder(Color.black));
		loginPanel.setBackground(Color.LIGHT_GRAY);
				
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Zubaer\\Pictures\\images-1.jpg")
				.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
		image.setIcon(imageIcon);
		loginPanel.add(image); 
		
		loginPanel.add(userLabel);
		loginPanel.add(userField);
		loginPanel.add(passLabel);
		loginPanel.add(passField);
		loginPanel.add(submit);
		loginPanel.add(clear);
		
		con.add(loginPanel, BoxLayout.Y_AXIS); 
	}
}

package SummeryLoginApril_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class G_Register extends E_Button{

	JPanel grid;
	JLabel register, image; 
	
	//Register Panel page
	public void myRegister(Container con){
		grid = new JPanel();
		grid.setBorder(new LineBorder(Color.black));
		grid.setBackground(Color.LIGHT_GRAY);
		
//		image = new JLabel();
//		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Zubaer\\Pictures\\images-1.jpg")
//				.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
//		image.setIcon(imageIcon);
//		grid.add(image);
		
		register = new JLabel("This page is under construction");
		grid.add(register);
		
		con.add(grid); 
		con.add(grid, BorderLayout.CENTER);
	}
}

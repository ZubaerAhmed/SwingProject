package SummeryLogin;

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

public class H_HomePage extends E_Button{

	JPanel home;
//	Container eCon;
	
	JLabel label1 = new JLabel("Digital Laboratory");
	JLabel label2 = new JLabel("User Name",SwingConstants.CENTER);
	JLabel userLabel = new JLabel("User Name");
	JLabel passLabel = new JLabel("Password");
	JLabel image = new JLabel();
	
	String myString =  "<html><p>" +"<br>"
			+ "About COVID-19\r\n " + "<br>"
			+"Coronavirus (COVID-19) is a new virus that causes "+ "<br>"
			+ "respiratory illness in people and is extremely contagious."+ "<br>"
			+ "Symptoms include fever, cough, shortness of breath, and diarrhea. \r\n" + "<br>"
			+"There’s currently no vaccine to prevent coronavirus disease (COVID-19).\r\n" + "<br>" 
			+"You can protect yourself and help prevent spreading the virus to others if you "+ "<br>"
			+ "STAY HOME or keep physical distance:\r\n" + "<br>"
			+ "</p></html>" ;  
	JLabel labelText = new JLabel(myString);		
	JLabel labelText2 = new JLabel("Another Text");
	
	//Home Panel Method
	public void homePanel(Container con){
		home = new JPanel();
		home.setBorder(new LineBorder(Color.black)); 
		home.setBackground(Color.CYAN);
		
		Font font = new Font("Arial",Font.PLAIN, 12);
		labelText.setFont(font);		
		labelText.setForeground(Color.BLUE);

		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Zubaer\\Pictures\\images-1.jpg")
				.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
		image.setIcon(imageIcon);
		home.add(image);
		home.add(labelText);
//		grid.add(labelText2);
//		eCon = con;
//		eCon.add(home);
		con.add(home);
//		return eCon;
	}
//	public Container ss(){
//		return eCon;
//	}
}

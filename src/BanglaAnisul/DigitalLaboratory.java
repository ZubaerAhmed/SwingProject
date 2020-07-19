package BanglaAnisul;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalLaboratory{

	
	public DigitalLaboratory() {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("Title-Login project");
		frame.setSize(600, 400);
		frame.setLocation(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
		
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("SUBMIT");
		
		JLabel label1 = new JLabel("Digital Laboratory");
		JLabel label2 = new JLabel("User Name");
		JLabel label3 = new JLabel("Password");
		//label1.setBackground(Color.WHITE);
		
		//Main Panel
		Container main = frame.getContentPane();
		main.setLayout(new BorderLayout(8,6));
		main.setBackground(Color.lightGray);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));
				
		
		
		//Header
		JPanel top = new JPanel();
		top.setBorder(BorderFactory.createEmptyBorder(5,50,5,50));
		//top.setBorder(new LineBorder(Color.black, 3));
		//top.setBackground(Color.BLUE);
		main.add(top, BorderLayout.NORTH);
		//top.setLayout(new FlowLayout(5));
		top.add(label1);
		top.add(button1);
		top.add(button2);
		
		//Footer
		JPanel footer = new JPanel();
		footer.setBorder(BorderFactory.createEmptyBorder(20,5,5,5));
		footer.setBackground(Color.BLUE);
		main.add(footer, BorderLayout.SOUTH);

		//left
		JPanel left = new JPanel();
		left.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		left.setBackground(Color.DARK_GRAY);
		main.add(left, BorderLayout.WEST);
				
		//right
//		JPanel right = new JPanel();
//		right.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
//		right.setBackground(Color.DARK_GRAY);
//		main.add(right, BorderLayout.EAST);
//		right.add(label2);
		

 
		
		
		
		
	}
}

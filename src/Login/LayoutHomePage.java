package Login;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

public class LayoutHomePage extends JFrame {
	
	public LayoutHomePage() {
		super("Title-Login project");
		this.setSize(600, 400);
		this.setLocation(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); 
		
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
		JButton button4 = new JButton("button4");
		
		//Main Panel
		Container main = this.getContentPane();
		main.setLayout(new BorderLayout(8,6));
		main.setBackground(Color.lightGray);
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));
		
		//Top Panel
		JPanel top = new JPanel();
		top.setBorder(new LineBorder(Color.black));
		top.setBackground(Color.BLUE);
		top.setLayout(new FlowLayout(5));
		top.add(button1);
		top.add(button4);
		main.add(top, BorderLayout.NORTH);
		
		//Middle Panel
		JPanel middle = new JPanel();
		middle.setBorder(new LineBorder(Color.black, 3));
		middle.setBackground(Color.BLUE);
		middle.setLayout(new FlowLayout(4,4,4));
		
		//Grid Panel
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(4,1,5,5));
		grid.setBorder(new LineBorder(Color.black));
		grid.setBackground(Color.blue);
		grid.add(button2);
		
		JLabel label = new JLabel("Center Box", SwingConstants.CENTER);
		label.setOpaque(true);
		label.setBorder(new LineBorder(Color.black, 3));
		
		middle.add(grid);
		main.add(label);
		main.add(middle, BorderLayout.WEST);
		
		//Middle Panel
		JPanel bottom = new JPanel();
		bottom.setBorder(new LineBorder(Color.black, 3));
		bottom.setBackground(Color.BLUE);
		bottom.setLayout(new FlowLayout(4));
		bottom.add(button3);
	    main.add(bottom, BorderLayout.SOUTH);
	}

}

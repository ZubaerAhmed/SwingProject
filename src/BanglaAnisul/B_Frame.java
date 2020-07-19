package BanglaAnisul;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class B_Frame extends JFrame{
	
	protected Container c;
	protected JLabel user, pass;
	protected Font font;
	
	B_Frame(){
		//D_Label d = new D_Label();
		//d.init();
		init();
	}
	
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
	
	public static void setFrame() {				
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				B_Frame frame = new B_Frame();
				frame.setTitle("Digital Laboratory");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				frame.setSize(600, 400);
				frame.setLocation(300, 200);
				frame.setVisible(true);	
				
			}		
		});
		
	}
	
}

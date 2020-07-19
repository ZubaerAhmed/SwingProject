package SummeryLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class C_Container {

	Container con;
	JFrame frame;
	
	C_Container(JFrame frame){
		this.frame = frame;
	}
	
	public void myPanel() {		
		//Container
		con = frame.getContentPane();
		con.setLayout(null);
		con.setLayout(new BorderLayout(8,6));
		con.setBackground(Color.GRAY);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));
	}				
				
}

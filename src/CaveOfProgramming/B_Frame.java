package CaveOfProgramming;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class B_Frame {
	static JFrame frame;
	public static void setFrame() {	
			
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				frame = new JFrame(); 
				frame.setTitle("Digital Laboratory");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				frame.setSize(600, 400);
				frame.setLocation(300, 200);
				frame.setVisible(true);	
				//frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));
			}		
		});
		
	}
	
}

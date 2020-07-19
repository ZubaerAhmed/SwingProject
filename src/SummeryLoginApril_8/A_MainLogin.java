package SummeryLoginApril_8;

import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_MainLogin {

	static JFrame frame;
	static Container con;
	static JPanel home;
	
	public static void main(String[] args) {		 
//		new B_FrameHome();
//		new C_Container();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					init();
					B_PanelHome ph = new B_PanelHome(frame,con,home);
					ph.myContainer();
					ph.myPanel();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}			
		});
	}
//=========================================================	
	public static void init() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,200,600,400);
		frame.setTitle("Digital Laboratory");		
	}

}

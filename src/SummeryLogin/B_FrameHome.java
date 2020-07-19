package SummeryLogin;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class B_FrameHome extends E_Button{
	
	protected static JFrame frame;
	protected static Container con; 
	
	B_FrameHome(){
		init();
	}
	
	public static void init() {	 			
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				frame = new JFrame();
				frame.setTitle("Digital Laboratory");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				frame.setSize(600, 400);
				frame.setLocation(300, 200);
				frame.setVisible(true);					
//------C_Container-------------------------------------------------------------				
				C_Container cont1 = new C_Container(frame);
				cont1.myPanel();
    			con = cont1.con;
//------D_Panel---------------------------------------------------------
			D_PanelHome panel2 = new D_PanelHome(frame, con);
			panel2.myLabel(frame, con);
//			F_Login panel3 = new F_Login(frame, con);
			//panel3.loginPanel(frame, con);
//---------------------------------------------------------------
			loginButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Enter User Name and Password");
					//System.out.println("4 login=> "+con);
					frame.dispose();
					//frame.setLayout(null); 
					new B_FrameLogin();
					//D_PanelLogin f = new D_PanelLogin(frame, con);
					//f.myLabel(frame, con);
					//switchPanel();
					//JOptionPane.showMessageDialog(null, "CLOSED");
				}			
			});	
//--------------------------------------------------------------			
			}

		});
		
	}
	
}

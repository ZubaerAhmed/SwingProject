package SummeryLoginApril_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class B_PanelLogin extends E_Button{
	
	static JFrame frame;
	static Container con;
	
	B_PanelLogin(JFrame frame, Container con){
		this.frame = frame;
		this.con= con;
	}
	public void myContainer() {		
		//Container
		con = frame.getContentPane();
		con.setLayout(null);
		con.setLayout(new BorderLayout(8,6));
		con.setBackground(Color.GRAY);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));
		
//================================================
//===============================================
//------D_Panel---------------------------------------------------------
//			D_PanelHome panel2 = new D_PanelHome(frame, con);
//			panel2.myLabel(frame, con);
//			F_Login panel3 = new F_Login(frame, con);
			//panel3.loginPanel(frame, con);
//---------------------------------------------------------------
//			loginButton.addActionListener(new ActionListener(){
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(null, "Enter User Name and Password");
//					System.out.println("4 login=> "+con);
					//frame.dispose();
					//frame.setLayout(null); 

					D_OtherPanelLoginPage f = new D_OtherPanelLoginPage(frame, con);
					f.myLabel(frame, con);
					//switchPanel();
					//JOptionPane.showMessageDialog(null, "CLOSED");
//				}			
//			});	
//--------------------------------------------------------------			
//			}

//		});
		
	}
	
}

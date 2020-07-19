package SummeryLoginApril_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import SummeryLoginApril_8.E_Button;

public class B_PanelHome extends E_Button{
	 
	static JFrame frame;
	static Container con;
	JPanel home;
	
	B_PanelHome(JFrame frame, Container con, JPanel home){
		this.frame = frame;
		this.con= con;
		this.home = home;
	}
	public void myContainer() {		
		//Container
		con = frame.getContentPane();
		con.setLayout(null);
		con.setLayout(new BorderLayout(8,6));
		con.setBackground(Color.GRAY);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));
	}		
//==================================================
//==============================================
	public static void myPanel() {	 							
//------D_Panel---------------------------------------------------------
		D_OtherPanelHomePage panel2 = new D_OtherPanelHomePage(frame, con);
		panel2.myLabel(frame, con);
		
//		D_OtherPanelLoginPage dol = new D_OtherPanelLoginPage(frame,con);
//		dol.myLabel(frame, con); 
//---------------------------------------------------------------
			
			loginButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Enter User Name and Password"); 
					frame.dispose();
//					C_LoginLabel cll = new C_LoginLabel();
//					cll.loginLabel(con); 

					new B_PanelLogin(frame,con);
//					dol.myContainer(); 
					//JOptionPane.showMessageDialog(null, "CLOSED");
				}			
			});		
	}
	
}

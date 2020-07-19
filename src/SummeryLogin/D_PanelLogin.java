package SummeryLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class D_PanelLogin extends H_LoginPage{
	
	Container con;
	JFrame frame;
	JPanel top, footer, leftNav;
	
	D_PanelLogin(JFrame frame, Container con){
		this.frame = frame;
		this.con = con;
	}
	
	public void myLabel(JFrame frame, Container con)  {			
		
		//Header Panel
		top = new JPanel();
		top.setBorder(new LineBorder(Color.black));
		//top.setBackground(Color.BLUE);
		Font font = new Font("Arial",Font.BOLD, 16);
		label1.setFont(font);
		label1.setForeground(Color.BLUE);		
		//label3.setToolTipText("USERNAME");
		top.add(label1);
		con.add(top, BorderLayout.NORTH);
		//------------------------------------------------
		//Footer Panel
		footer = new JPanel();
		footer.setBorder(new LineBorder(Color.black));
		footer.setBackground(Color.LIGHT_GRAY);
		String date = new java.util.Date().toString(); 
		JLabel footerText = new JLabel(date);
		footer.add(footerText);
		con.add(footer, BorderLayout.SOUTH);
		//-------------------------------------------------
		//Left Nav Panel
		leftNav = new JPanel();
		leftNav.setBorder(new LineBorder(Color.black, 3));
		leftNav.setBackground(Color.LIGHT_GRAY);
		leftNav.add(loginButton);
		leftNav.add(registerButton);
		leftNav.setLayout(new GridLayout(4,1));
		con.add(leftNav, BorderLayout.WEST);
//-------------------------------------------
		//class E_Label: Grid Panel - Body right
//		System.out.println("1 => "+con);
//        homePanel(con); //class E_Label:
        loginPanel(con);  //H_LoginPageLogin
        
//		loginButton.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//JOptionPane.showMessageDialog(null, "Enter User Name and Password");
//				System.out.println("4 login=> "+con);
//				frame.dispose();
//				//frame.setLayout(null); 
//
//				//new B_Frame();
//				F_Login f = new F_Login(frame, con);
//				f.loginPanel(frame, con);
//				//switchPanel();
//				//JOptionPane.showMessageDialog(null, "CLOSED");
//			}			
//		});	
		
		//Another for LOGIN : E_Login
        
//        F_Login f = new F_Login(frame, con);
//		f.loginPanel(frame, con);   //F_Login class
//		System.out.println("5 after=> "+ con);
		
		
//		submit.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Submitted");
//				
//			}
//		});
	}
//------------------------------------------------
//	public void switchPanel() {
//		frame.removeAll();
//		loginPanel(con);  //F_Login class
//		frame.repaint();
//		frame.revalidate();
//	}
//------------------------------------------

}


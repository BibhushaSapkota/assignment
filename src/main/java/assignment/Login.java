package assignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import javax.swing.*;


public class Login implements ActionListener{
	JFrame frame;
	JLabel lbl_image,lbl_heading,lbl_username,lbl_password;
	JTextField txt_username;
	JPasswordField txt_password;
	JButton btn_login,btn_cancel,btn_reg;
	Font fon1,fon2;
	JPanel p,pan;
	ImageIcon image;
	
	public Login() {
		frame=new JFrame ("Login Page");
		fon1=new Font("arial",Font.BOLD,35);
		fon2=new Font("arial",Font.BOLD,25);
		
		pan=new JPanel();
		p= new JPanel();
		p.setSize(1000,700);
		p.setBackground(new Color(234,196,186));
		p.setBounds(400,100, 700, 500);
		p.setLayout(null);
		pan.add(p);
		frame.add(pan);
		
		
		lbl_heading = new JLabel("Login Credentials");
		lbl_heading.setForeground(new Color(200,17,20));
		lbl_heading.setFont(fon1);
		lbl_heading.setBounds(200,10,300,50);
		p.add(lbl_heading);
		
		lbl_username=new JLabel ("Username");
		lbl_username.setForeground(new Color(200,17,20));
		lbl_username.setFont(fon2);
		lbl_username.setBounds(100, 150, 250, 40);
		p.add(lbl_username);
		
		txt_username=new JTextField();
		txt_username.setFont(fon2);
		txt_username.setBounds(300,150, 250, 40);
		p.add(txt_username);
		
		lbl_password=new JLabel("Password");
		lbl_password.setForeground(new Color(200,17,20));
		lbl_password.setFont(fon2);
		lbl_password.setBounds(100, 300, 250, 40);
		p.add(lbl_password);
		
		txt_password=new JPasswordField();
		txt_password.setFont(fon2);
		txt_password.setBounds(300,300,250,40);
		p.add(txt_password);
		
		btn_login=new JButton ("Login");
		btn_login.setFont(fon2);
		btn_login.setForeground(new Color(200,17,20));
		btn_login.setBackground(new Color(218,183,170));
		btn_login.setBounds(100,400,150,40);
		btn_login.addActionListener(this);
		p.add(btn_login);
		
		btn_cancel=new JButton ("Cancel");
		btn_cancel.setFont(fon2);
		btn_cancel.setForeground(new Color(200,17,20));
		btn_cancel.setBackground(new Color(218,183,170));
		btn_cancel.setBounds(300,400,150,40);
		p.add(btn_cancel);
		
		btn_reg=new JButton("Sign up");
		btn_reg.setFont(fon2);
		btn_reg.setForeground(new Color(200,17,20));
		btn_reg.setBackground(new Color(218,183,170));
		btn_reg.setBounds(500,400,150,40);
		btn_reg.addActionListener(this);
		p.add(btn_reg);

		image=new ImageIcon("background.jpg");
		lbl_image=new JLabel(image);
		lbl_image.setBounds(0, 0, 1600, 900);
		lbl_image.setLayout(null);
		pan.add(lbl_image);
		
		

		pan.setSize(1600,900);
		pan.setLayout(null);
		frame.setSize(1600,900);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main (String[]args) {

		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_reg) {
			frame.dispose();
			new Register();
		}
			
		else if(e.getSource()==btn_login) {
			String username=txt_username.getText();
			String password=txt_password.getText();

			String query="select * from registration_form where username='"+username+"' and password='"+password+"'";
			Dbconnection db=new Dbconnection();
			ResultSet rs=db.select(query);
			
			try {
				if(username.length()==0 && password.length()==0) {
					JOptionPane.showMessageDialog(btn_login, "All crediantials should be provided");
				}
				else if(rs.next()) {
					JOptionPane.showMessageDialog(btn_login, "Login successful");
					frame.dispose();
					new Art(username);
				}
				
				else {
					JOptionPane.showMessageDialog(btn_login, "Invalid username of password");
				}
			} catch (SQLException throwables) {
				// TODO Auto-generated catch block
				throwables.printStackTrace();
			}
		}
	 }
		
	}

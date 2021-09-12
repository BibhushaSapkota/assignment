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

		frame.add(pan);
		
		
		lbl_heading = new JLabel("Login Credentials");
		lbl_heading.setForeground(new Color(200,17,20));
		lbl_heading.setFont(fon1);
		lbl_heading.setBounds(1200,100,300,50);
		pan.add(lbl_heading);
		
		lbl_username=new JLabel ("Username");
		lbl_username.setForeground(new Color(200,17,20));
		lbl_username.setFont(fon2);
		lbl_username.setBounds(1150, 200, 250, 40);
		pan.add(lbl_username);
		
		txt_username=new JTextField();
		txt_username.setFont(fon2);
		txt_username.setBounds(1270,200, 250, 40);
		pan.add(txt_username);
		
		lbl_password=new JLabel("Password");
		lbl_password.setForeground(new Color(200,17,20));
		lbl_password.setFont(fon2);
		lbl_password.setBounds(1150, 300, 250, 40);
		pan.add(lbl_password);
		
		txt_password=new JPasswordField();
		txt_password.setFont(fon2);
		txt_password.setBounds(1270,300,250,40);
		pan.add(txt_password);
		
		btn_login=new JButton ("Login");
		btn_login.setFont(fon2);
		btn_login.setForeground(new Color(200,17,20));
		btn_login.setBackground(new Color(218,183,170));
		btn_login.setBounds(1150,450,150,40);
		btn_login.addActionListener(this);
		pan.add(btn_login);

		
		btn_reg=new JButton("Sign up");
		btn_reg.setFont(fon2);
		btn_reg.setForeground(new Color(200,17,20));
		btn_reg.setBackground(new Color(218,183,170));
		btn_reg.setBounds(1350,450,150,40);
		btn_reg.addActionListener(this);
		pan.add(btn_reg);

		image=new ImageIcon("bgggg.png");
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
	public boolean login_test(String username_t, String password_t) {
		String username="bibhu";
		String password="sapkota6";
		boolean result = false;
		if (username_t == username && password_t == password) {
			result = true;
		}
		return result;
	}
	}

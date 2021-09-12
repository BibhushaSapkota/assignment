package assignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Register implements ActionListener{
	JFrame frame;
	JLabel lbl_image,lbl_heading,lbl_fname,lbl_lname,lbl_gender,lbl_username,lbl_password,lbl_cpassword;
	JTextField txt_fname,txt_lname,txt_username;
	JPasswordField txt_password,txt_cpassword;
	JButton register,login;
	JPanel p;
	JComboBox c;
	
	Font fon1,fon2;
	ImageIcon image;
	JButton btn_register,btn_cancel;
	
	public Register() {
	frame=new JFrame ("Registration Page");
	fon1=new Font("arial",Font.BOLD,35);
	fon2=new Font("arial",Font.BOLD,25);
	
	p= new JPanel();
	
	
	
	lbl_heading = new JLabel(" User Registration");
	lbl_heading.setForeground(new Color(200,17,20));
	lbl_heading.setFont(fon1);
	lbl_heading.setBounds(600,60,400,50);
	p.add(lbl_heading);
	
	
	
	lbl_fname = new JLabel("First name");
	lbl_fname.setForeground(new Color(200,17,20));
	lbl_fname.setFont(fon2);
	lbl_fname.setBounds(500,200,250,30);
	p.add(lbl_fname);
	
	txt_fname = new JTextField();
	txt_fname.setForeground(Color.blue);
	txt_fname.setFont(fon2);
	txt_fname.setBounds(740,200,250,30);
	p.add(txt_fname);
	
	
	lbl_lname = new JLabel("Last name");
	lbl_lname.setForeground(new Color(200,17,20));
	lbl_lname.setFont(fon2);
	lbl_lname.setBounds(500,250,250,30);
	p.add(lbl_lname);
	
	txt_lname = new JTextField();
	txt_lname.setForeground(Color.blue);
	txt_lname.setFont(fon2);
	txt_lname.setBounds(740,250,250,30);
	p.add(txt_lname);
	
	lbl_username = new JLabel("Username");
	lbl_username.setForeground(new Color(200,17,20));
	lbl_username.setFont(fon2);
	lbl_username.setBounds(500,350,250,30);
	p.add(lbl_username);
	
	txt_username = new JTextField();
	txt_username.setForeground(Color.blue);
	txt_username.setFont(fon2);
	txt_username.setBounds(740,350,250,30);
	p.add(txt_username);
	
	lbl_password = new JLabel("Password");
	lbl_password.setForeground(new Color(200,17,20));
	lbl_password.setFont(fon2);
	lbl_password.setBounds(500,400,250,30);
	p.add(lbl_password);
	
	txt_password = new JPasswordField();
	txt_password.setForeground(Color.blue);
	txt_password.setFont(fon2);
	txt_password.setBounds(740,400,250,30);
	p.add(txt_password);
	
	lbl_cpassword = new JLabel("Confirm Password");
	lbl_cpassword.setForeground(new Color(200,17,20));
	lbl_cpassword.setFont(fon2);
	lbl_cpassword.setBounds(500,450,250,30);
	p.add(lbl_cpassword);
	
	txt_cpassword = new JPasswordField();
	txt_cpassword.setForeground(Color.blue);
	txt_cpassword.setFont(fon2);
	txt_cpassword.setBounds(740,450,250,30);
	p.add(txt_cpassword);
	
	lbl_gender = new JLabel("Gender");
	lbl_gender.setForeground(new Color(200,17,20));
	lbl_gender.setFont(fon2);
	lbl_gender.setBounds(500,300,250,30);
	p.add(lbl_gender);
	
	String Gender[]= {"Select","Male","Female","Non-Binary"} ;
	c=new JComboBox(Gender);
	c.setBounds(740,300,250,30);
	p.add(c);
	
	
	register = new JButton("Register");
	register.setForeground(new Color(200,17,20));
	register.setFont(fon1);
	register.addActionListener(this);
	register.setBackground(new Color(16,1,35));
	register.setBounds(500,600,240,50);
	p.add(register);
	
	login = new JButton("Login");
	login.setForeground(new Color(200,17,20));
	login.setFont(fon1);
	login.setBackground(new Color(16,1,35));
	login.addActionListener(this);
	login.setBounds(750,600,240,50);
	p.add(login);
	
	image= new ImageIcon("background.png");
	lbl_image=new JLabel(image);
	lbl_image.setBounds(0, 0, 1600, 900);
	p.add(lbl_image);
	
	frame.add(p);
	p.setBounds(0,0,1600,900);
	p.setLayout(null);

	frame.setSize(1600,900);
	frame.setLayout(null);
	frame.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String fname=txt_fname.getText();
		String lname=txt_lname.getText();
		String gender=(String) c.getSelectedItem();
		String username=txt_username.getText();
		String password=txt_password.getText();
		String cpassword=txt_cpassword.getText();
		
		User u=new User(fname,lname,gender,username,password,cpassword);
				
		if(e.getSource()==register) {
			
			if (u.getFname().length()==0 || u.getLname().length()==0 || u.getGender().length()==0 || u.getUsername().length()==0|| u.getPassword().length()==0||u.getCpassword().length()==0) {
				JOptionPane.showMessageDialog(register, " All Fields are required");
			}

			else if (!u.getPassword().equals(u.getCpassword())) {
				JOptionPane.showMessageDialog(register,"Password and Confirm Password doesn't match","Dialog",JOptionPane.ERROR_MESSAGE);}
			
			else {
				Dbconnection db=new Dbconnection();
				
				String query="insert into registration_form(fname,lname,gender,username,password) values('"+u.getFname()+"','"+u.getLname()+"','"+u.getGender()+"','"+u.getUsername()+"','"+u.getPassword()+"')";
				int ans= db.insert(query);
				if (ans>0) {
					JOptionPane.showMessageDialog(register, "User successfully registered");
					txt_fname.setText("");
					txt_lname.setText("");
					txt_username.setText("");
					txt_password.setText("");
					txt_cpassword.setText("");
					c.setSelectedItem("Select");
					
				}
				else {
					JOptionPane.showMessageDialog(register, "User name already used. Please use diffrent "
	        				+ "username. ");
				}

		}
	}
		
		
		
		else if (e.getSource()==login) {
			new Login();
			frame.dispose();
		}
	}
	public boolean registration_test(String pass_t, String cpass_t) {
		String pass_test="sapkota6";
		String cpass_test="sapkota6";
		boolean result = false;
		if (pass_t == pass_test && cpass_t == cpass_test) {
			result = true;
		}
		return result;
	}
}

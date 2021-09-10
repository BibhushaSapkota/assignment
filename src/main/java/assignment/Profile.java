package assignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Profile implements ActionListener{
	Font fon1,fon2;
	JLabel lbl_profile,lbl_fname,lbl_lname,lbl_gender,lbl_username,lbl_password;
	JTextField txt_fname,txt_lname,txt_username,txt_password,txt_gender;
	JButton btn_update;
	String user;
	
	public Profile (JPanel panel,String user) {
		this.user=user;
		fon1=new Font("arial",Font.BOLD,35);
		fon2=new Font("arial",Font.BOLD,20);
		
		lbl_profile=new JLabel("USER PROFILE");
		lbl_profile.setForeground(new Color(200,17,20));
		lbl_profile.setFont(fon1);
		lbl_profile.setBounds(200,10,400,100);
		panel.add(lbl_profile);
		
		lbl_fname=new JLabel ("First Name");
		lbl_fname.setFont(fon2);
		lbl_fname.setBounds(40, 130, 200,40);
		panel.add(lbl_fname);
	    
		
		lbl_lname=new JLabel("Last Name");
		lbl_lname.setFont(fon2);
		lbl_lname.setBounds(350, 130, 200,40);
		panel.add(lbl_lname);

		lbl_gender=new JLabel("Gender");
		lbl_gender.setFont(fon2);
		lbl_gender.setBounds(40, 450, 200,40);
		panel.add(lbl_gender);
		
		lbl_username=new JLabel ("Username");
		lbl_username.setFont(fon2);
		lbl_username.setBounds(350,450, 200,40);
		panel.add(lbl_username);
		
		lbl_password=new JLabel ("Password");
		lbl_password.setFont(fon2);
		lbl_password.setBounds(700,130, 200,40);
		panel.add(lbl_password);
		
		btn_update=new JButton("Update");
		btn_update.setFont(fon1);
		btn_update.setForeground(new Color(200,17,20));
		btn_update.setBackground(new Color(218,183,170));
		btn_update.addActionListener(this);
		btn_update.setBounds(650,450,300,70);
		panel.add(btn_update);
		
		String username=user;
		Dbconnection db=new Dbconnection();
		String query="select * from registration_form where username='"+username+"'";
		ResultSet rs=db.select(query);
		try {
			while (rs.next())
			{
				txt_username= new JTextField(rs.getString("username"));
				txt_username.setFont(fon2);
				txt_username.setBounds(300, 500, 200, 40);
				panel.add(txt_username);
				
				txt_fname= new JTextField(rs.getString("fname"));
				txt_fname.setFont(fon2);
				txt_fname.setBounds(40, 190, 200, 40);
				panel.add(txt_fname);
				
				txt_lname= new JTextField(rs.getString("lname"));
				txt_lname.setFont(fon2);
				txt_lname.setBounds(300, 190, 200, 40);
				panel.add(txt_lname);
				
				txt_gender= new JTextField(rs.getString("gender"));
				txt_gender.setFont(fon2);
				txt_gender.setBounds(40, 500, 200, 40);
				panel.add(txt_gender);

				txt_password= new JTextField(rs.getString("password"));
				txt_password.setFont(fon2);
				txt_password.setBounds(700, 190, 200, 40);
				panel.add(txt_password);
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

		
		
				
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_update) {
			try {
				String query="update registration_form set fname='"+txt_fname.getText()+"',"
						+ "lname='"+txt_lname.getText()+"',gender='"+txt_gender.getText()+"',password='"+txt_password.getText()+"' where username='"+user+"'";
				Dbconnection db=new Dbconnection();
				int rs=db.Update(query);
				JOptionPane.showMessageDialog(btn_update, "Update successsful");
			}
			finally{
				
			}
			
		}
		
	}
	
	

}

package assignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;





public class Art implements ActionListener{
	JFrame frame;
	JLabel lbl_image,lbl_heading,lbl_image1,lbl_image2,lbl_image3;
	Font fon1,fon2;
	JPanel sketch,main,paintings,profile,details;
	JButton btn_sketch,btn_paintings,btn_details,btn_profile,btn_buy;
	ImageIcon image,image1,image2,image3;
	JComboBox com;
	String user;
	
	
	public Art(String user) {
		this.user=user;
		frame=new JFrame ("Login Page");
		fon1=new Font("arial",Font.BOLD,35);
		fon2=new Font("arial",Font.BOLD,25);
		
		main= new JPanel();
		main.setSize(1600,900);
		main.setLayout(null);
		frame.add(main);
		
		sketch=new JPanel();
		sketch.setBackground(new Color(234,196,186));
		sketch.setBounds(400,50,1000,700);
		sketch.setLayout(null);
		main.add(sketch);
		new Sketch(sketch);
		
		paintings=new JPanel();
		paintings.setBackground(new Color(234,196,186));
		paintings.setLayout(null);
		main.add(paintings);
		
		
		profile=new JPanel();
		profile.setBackground(new Color(234,196,186));
		profile.setLayout(null);
		main.add(profile);
		
		details=new JPanel();
		details.setBackground(new Color(234,196,186));
		details.setLayout(null);
		main.add(details);
		

		
		
		btn_sketch=new JButton("Sketch");
		btn_sketch.setBounds(40,50,200, 50);
		btn_sketch.setFont(fon2);
		btn_sketch.setForeground(new Color(16,115,44));
		btn_sketch.addActionListener(this);
		btn_sketch.setBackground(new Color(218,183,170));
		main.add(btn_sketch);
		
		
		btn_paintings=new JButton("Paintings");
		btn_paintings.setBounds(40, 150,200, 50);
		btn_paintings.setFont(fon2);
		btn_paintings.setForeground(new Color(200,17,20));
		btn_paintings.setBackground(new Color(218,183,170));
		btn_paintings.addActionListener(this);
		main.add(btn_paintings);
		
		btn_profile=new JButton("Profile");
		btn_profile.setBounds(40,250,200, 50);
		btn_profile.setFont(fon2);
		btn_profile.setForeground(new Color(200,17,20));
		btn_profile.setBackground(new Color(218,183,170));
		btn_profile.addActionListener(this);
		main.add(btn_profile);
		
		btn_details=new JButton("Details");
		btn_details.setBounds(40,350,200, 50);
		btn_details.setFont(fon2);
		btn_details.setForeground(new Color(200,17,20));
		btn_details.setBackground(new Color(218,183,170));
		btn_details.addActionListener(this);
		main.add(btn_details);
		
		
		String art[]= {"Select","Sketch1","Sketch2","Sketch3","Sketch4","Sketch5","Sketch6","Painting1","Painting2","Painting3","Painting4","Painting5","Painting6"} ;
		com=new JComboBox(art);
		com.setBounds(40,550,200,30);
		main.add(com);
		
		btn_buy=new JButton("BUY ART");
		btn_buy.setBounds(40,700,200, 50);
		btn_buy.setFont(fon2);
		btn_buy.setForeground(new Color(200,17,20));
		btn_buy.setBackground(new Color(218,183,170));
		btn_buy.addActionListener(this);
		main.add(btn_buy);
		
		
		image= new ImageIcon(getClass().getResource("background.jpg"));
		lbl_image=new JLabel(image);
		lbl_image.setBounds(0, 0, 1500, 900);
		main.add(lbl_image);
		

		frame.setSize(1500,900);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
public static void main (String[]args, String user) {
		new Art(user);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_sketch) {
			paintings.setBounds(0, 0, 0, 0);
			profile.setBounds(0, 0, 0, 0);
			btn_sketch.setForeground(new Color(16,115,44));
			btn_sketch.setBackground(new Color(218,183,170));
			btn_paintings.setForeground(new Color(200,17,20));
			btn_paintings.setBackground(new Color(218,183,170));
			btn_profile.setForeground(new Color(200,17,20));
			btn_profile.setBackground(new Color(218,183,170));

			sketch.setBounds(400,50,1000,700);
			new Sketch(sketch);
			
			
		}
		else if (e.getSource()==btn_paintings) {
				sketch.setBounds(0,0,0,0);
				profile.setBounds(0, 0, 0, 0);
				btn_paintings.setForeground(new Color(16,115,44));
				btn_paintings.setBackground(new Color(218,183,170));
				btn_sketch.setForeground(new Color(200,17,20));
				btn_sketch.setBackground(new Color(218,183,170));
				btn_profile.setForeground(new Color(200,17,20));
				btn_profile.setBackground(new Color(218,183,170));
				btn_details.setForeground(new Color(200,17,20));
				btn_details.setBackground(new Color(218,183,170));
			
				paintings.setBounds(400,50,1000,700);
				new Painting(paintings);
		}
		else if (e.getSource()==btn_details) {
			sketch.setBounds(0,0,0,0);
			profile.setBounds(0, 0, 0, 0);
			btn_details.setForeground(new Color(16,115,44));
			btn_details.setBackground(new Color(218,183,170));
			btn_sketch.setForeground(new Color(200,17,20));
			btn_sketch.setBackground(new Color(218,183,170));
			btn_profile.setForeground(new Color(200,17,20));
			btn_profile.setBackground(new Color(218,183,170));
			btn_paintings.setForeground(new Color(200,17,20));
			btn_paintings.setBackground(new Color(218,183,170));
			details.setBounds(400,50,1000,700);
			new Details(details,user);
	}
		else if (e.getSource()==btn_profile) {
			sketch.setBounds(0,0,0,0);
			paintings.setBounds(0,0,0,0);
			profile.setBounds(400,50,1000,700);
			btn_profile.setForeground(new Color(16,115,44));
			btn_profile.setBackground(new Color(218,183,170));
			btn_paintings.setForeground(new Color(200,17,20));
			btn_paintings.setBackground(new Color(218,183,170));
			btn_sketch.setForeground(new Color(200,17,20));
			btn_sketch.setBackground(new Color(218,183,170));
			btn_details.setForeground(new Color(200,17,20));
			btn_details.setBackground(new Color(218,183,170));
			new Profile(profile,user);
			
		}
		
		else if (e.getSource()==btn_buy) {
			String username=user;
			String art=(String) com.getSelectedItem();
			
			buy b = new buy(username,art);
			
			sketch.setBounds(0,0,0,0);
			paintings.setBounds(0,0,0,0);
			profile.setBounds(400,50,1000,700);
			btn_profile.setForeground(new Color(16,115,44));
			btn_profile.setBackground(new Color(218,183,170));
			btn_paintings.setForeground(new Color(200,17,20));
			btn_paintings.setBackground(new Color(218,183,170));
			btn_sketch.setForeground(new Color(200,17,20));
			btn_sketch.setBackground(new Color(218,183,170));
			btn_details.setForeground(new Color(200,17,20));
			btn_details.setBackground(new Color(218,183,170));
			
			if (com.getSelectedItem()=="Select") {
				JOptionPane.showMessageDialog(btn_buy,"Please select the art you want to buy");
				
			}
			
			else {
					String query1="select * from art where art_piece='"+b.getArt()+"'";
					Dbconnection db1=new Dbconnection();
					ResultSet rs=db1.select(query1);
					try {
						if(rs.next()) {
							JOptionPane.showMessageDialog(btn_buy, "Sorry the art you have choosen is already sold");
				
						}else {
							Dbconnection db=new Dbconnection();
							String query="insert into art(username,art_piece) values('"+b.getUsername()+"','"+b.getArt()+"')";
							int ans = db.insert(query);
							if(ans>0) {
								JOptionPane.showMessageDialog(btn_buy, "Your order has been placed.");
							}
						}
						
					}
					catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			
				}
		
			}
		}
	}
}

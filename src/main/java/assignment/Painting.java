package assignment;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Painting implements ActionListener {
	ImageIcon imagep1,imagep2,imagep3,imagep4,imagep5,imagep6;
	JLabel lbl_imagep1,lbl_imagep2,lbl_imagep3,lbl_imagep4,lbl_imagep5,lbl_imagep6;
	JButton painting1,painting2,painting3,painting4,painting5,painting6;
	JPanel paintinga,paintingb,paintingc,paintingd,paintinge,paintingf;
	
	public Painting(JPanel p) {
		
		painting1=new JButton("Painting 1");
		painting1.setBounds(10, 10,150, 50);
		painting1.setForeground(new Color(226,11,183));	
		painting1.addActionListener(this);
		painting1.setBackground(new Color(16,1,35));
		p.add(painting1);
		
		painting2=new JButton("Painting 2");
		painting2.setBounds(170, 10,150, 50);
		painting2.setForeground(new Color(226,11,183));	
		painting2.addActionListener(this);
		painting2.setBackground(new Color(16,1,35));
		p.add(painting2);
		
		painting3=new JButton("Painting 3");
		painting3.setBounds(330, 10,150, 50);
		painting3.setForeground(new Color(226,11,183));	
		painting3.addActionListener(this);
		painting3.setBackground(new Color(16,1,35));
		p.add(painting3);
		
		painting4=new JButton("Painting 4");
		painting4.setBounds(490, 10,150, 50);
		painting4.setForeground(new Color(226,11,183));	
		painting4.addActionListener(this);
		painting4.setBackground(new Color(16,1,35));
		p.add(painting4);
		
		painting5=new JButton("Painting 5");
		painting5.setBounds(650, 10,150, 50);
		painting5.setForeground(new Color(226,11,183));	
		painting5.addActionListener(this);
		painting5.setBackground(new Color(16,1,35));
		p.add(painting5);
		
		painting6=new JButton("Painting 6");
		painting6.setBounds(810, 10,150, 50);
		painting6.setForeground(new Color(226,11,183));	
		painting6.addActionListener(this);
		painting6.setBackground(new Color(16,1,35));
		p.add(painting6);
		
		paintinga=new JPanel();
		paintinga.setLayout(null);
		p.add(paintinga);
		
		paintingb=new JPanel();
		paintingb.setLayout(null);
		p.add(paintingb);
		
		paintingc=new JPanel();
		paintingc.setLayout(null);
		p.add(paintingc);
		
		paintingd=new JPanel();
		paintingd.setLayout(null);
		p.add(paintingd);
		
		paintinge=new JPanel();
		paintinge.setLayout(null);
		p.add(paintinge);
		
		paintingf=new JPanel();
		paintingf.setLayout(null);
		p.add(paintingf);
		
		imagep1= new ImageIcon("p1.jpg");
		lbl_imagep1=new JLabel(imagep1);
		lbl_imagep1.setBounds(0, 0, 760, 600);
		paintinga.add(lbl_imagep1);
		
		imagep2= new ImageIcon("p2.jpg");
		lbl_imagep2=new JLabel(imagep2);
		lbl_imagep2.setBounds(0, 0, 509, 600);
		paintingb.add(lbl_imagep2);
		
		imagep3= new ImageIcon("p3.jpg");
		lbl_imagep3=new JLabel(imagep3);
		lbl_imagep3.setBounds(0, 0, 524, 600);
		paintingc.add(lbl_imagep3);
		
		imagep4= new ImageIcon("p4.jpg");
		lbl_imagep4=new JLabel(imagep4);
		lbl_imagep4.setBounds(0, 0, 584, 600);
		paintingd.add(lbl_imagep4);
	
		imagep5= new ImageIcon("p5.jpg");
		lbl_imagep5=new JLabel(imagep5);
		lbl_imagep5.setBounds(0, 0, 728, 600);
		paintinge.add(lbl_imagep5);
		
		imagep6= new ImageIcon("p6.jpg");
		lbl_imagep6=new JLabel(imagep6);
		lbl_imagep6.setBounds(0, 0, 533, 600);
		paintingf.add(lbl_imagep6);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==painting1) {
			painting1.setForeground(new Color(16,1,35));	
			painting1.setBackground(new Color(226,11,183));
			painting2.setForeground(new Color(226,11,183));	
			painting2.setBackground(new Color(16,1,35));
			painting3.setForeground(new Color(226,11,183));	
			painting3.setBackground(new Color(16,1,35));
			painting4.setForeground(new Color(226,11,183));	
			painting4.setBackground(new Color(16,1,35));
			painting5.setForeground(new Color(226,11,183));	
			painting5.setBackground(new Color(16,1,35));
			painting6.setForeground(new Color(226,11,183));	
			painting6.setBackground(new Color(16,1,35));
			paintinga.setBounds(190,90,760,600);
			paintingb.setBounds(0,0,0,0);
			paintingc.setBounds(0,0,0,0);
			paintingd.setBounds(0,0,0,0);
			paintinge.setBounds(0,0,0,0);
			paintingf.setBounds(0,0,0,0);
			
		}
		
		else if (e.getSource()==painting2) {
			painting2.setForeground(new Color(16,1,35));	
			painting2.setBackground(new Color(226,11,183));
			painting1.setForeground(new Color(226,11,183));	
			painting1.setBackground(new Color(16,1,35));
			painting3.setForeground(new Color(226,11,183));	
			painting3.setBackground(new Color(16,1,35));
			painting4.setForeground(new Color(226,11,183));	
			painting4.setBackground(new Color(16,1,35));
			painting5.setForeground(new Color(226,11,183));	
			painting5.setBackground(new Color(16,1,35));
			painting6.setForeground(new Color(226,11,183));	
			painting6.setBackground(new Color(16,1,35));
			paintingb.setBounds(190,90,509,600);
			paintinga.setBounds(0,0,0,0);
			paintingc.setBounds(0,0,0,0);
			paintingd.setBounds(0,0,0,0);
			paintinge.setBounds(0,0,0,0);
			paintingf.setBounds(0,0,0,0);
			
		}
		
		else if (e.getSource()==painting3) {
			painting3.setForeground(new Color(16,1,35));	
			painting3.setBackground(new Color(226,11,183));
			painting1.setForeground(new Color(226,11,183));	
			painting1.setBackground(new Color(16,1,35));
			painting2.setForeground(new Color(226,11,183));	
			painting2.setBackground(new Color(16,1,35));
			painting4.setForeground(new Color(226,11,183));	
			painting4.setBackground(new Color(16,1,35));
			painting5.setForeground(new Color(226,11,183));	
			painting5.setBackground(new Color(16,1,35));
			painting6.setForeground(new Color(226,11,183));	
			painting6.setBackground(new Color(16,1,35));
			paintingc.setBounds(190,90,524,600);
			paintinga.setBounds(0,0,0,0);
			paintingb.setBounds(0,0,0,0);
			paintingd.setBounds(0,0,0,0);
			paintinge.setBounds(0,0,0,0);
			paintingf.setBounds(0,0,0,0);
			
		}
		
		else if (e.getSource()==painting4) {
			painting4.setForeground(new Color(16,1,35));	
			painting4.setBackground(new Color(226,11,183));
			painting1.setForeground(new Color(226,11,183));	
			painting1.setBackground(new Color(16,1,35));
			painting3.setForeground(new Color(226,11,183));	
			painting3.setBackground(new Color(16,1,35));
			painting2.setForeground(new Color(226,11,183));	
			painting2.setBackground(new Color(16,1,35));
			painting5.setForeground(new Color(226,11,183));	
			painting5.setBackground(new Color(16,1,35));
			painting6.setForeground(new Color(226,11,183));	
			painting6.setBackground(new Color(16,1,35));
			paintingd.setBounds(190,90,584,600);
			paintinga.setBounds(0,0,0,0);
			paintingc.setBounds(0,0,0,0);
			paintingb.setBounds(0,0,0,0);
			paintinge.setBounds(0,0,0,0);
			paintingf.setBounds(0,0,0,0);
			
		}
		
		else if (e.getSource()==painting5) {
			painting5.setForeground(new Color(16,1,35));	
			painting5.setBackground(new Color(226,11,183));
			painting1.setForeground(new Color(226,11,183));	
			painting1.setBackground(new Color(16,1,35));
			painting3.setForeground(new Color(226,11,183));	
			painting3.setBackground(new Color(16,1,35));
			painting2.setForeground(new Color(226,11,183));	
			painting2.setBackground(new Color(16,1,35));
			painting4.setForeground(new Color(226,11,183));	
			painting4.setBackground(new Color(16,1,35));
			painting6.setForeground(new Color(226,11,183));	
			painting6.setBackground(new Color(16,1,35));
			paintinge.setBounds(190,90,728,600);
			paintinga.setBounds(0,0,0,0);
			paintingc.setBounds(0,0,0,0);
			paintingb.setBounds(0,0,0,0);
			paintingd.setBounds(0,0,0,0);
			paintingf.setBounds(0,0,0,0);
			
		}
		
		else if (e.getSource()==painting6) {
			painting6.setForeground(new Color(16,1,35));	
			painting6.setBackground(new Color(226,11,183));
			painting1.setForeground(new Color(226,11,183));	
			painting1.setBackground(new Color(16,1,35));
			painting3.setForeground(new Color(226,11,183));	
			painting3.setBackground(new Color(16,1,35));
			painting2.setForeground(new Color(226,11,183));	
			painting2.setBackground(new Color(16,1,35));
			painting4.setForeground(new Color(226,11,183));	
			painting4.setBackground(new Color(16,1,35));
			painting5.setForeground(new Color(226,11,183));	
			painting5.setBackground(new Color(16,1,35));
			paintingf.setBounds(190,90,533,600);
			paintinga.setBounds(0,0,0,0);
			paintingc.setBounds(0,0,0,0);
			paintingb.setBounds(0,0,0,0);
			paintingd.setBounds(0,0,0,0);
			paintinge.setBounds(0,0,0,0);
			
		}
		
	}
			
	

}

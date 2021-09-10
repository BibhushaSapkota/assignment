package assignment;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sketch implements ActionListener {
	ImageIcon images1,images2,images3,images4,images5;
	JLabel lbl_images1,lbl_images2,lbl_images3,lbl_images4,lbl_images5;
	JButton sketch1,sketch2,sketch3,sketch4,sketch5;
	JPanel sketcha,sketchb,sketchc,sketchd,sketche;
	
	public Sketch(JPanel q) {
		sketch1=new JButton("SKETCH 1");
		sketch1.setBounds(10, 10,150, 50);
		sketch1.setForeground(new Color(226,11,183));	
		sketch1.addActionListener(this);
		sketch1.setBackground(new Color(16,1,35));
		q.add(sketch1);
		
		
		sketch2=new JButton("SKETCH 2");
		sketch2.setBounds(170, 10,150, 50);
		sketch2.setForeground(new Color(226,11,183));	
		sketch2.setBackground(new Color(16,1,35));
		sketch2.addActionListener(this);
		q.add(sketch2);
		
		sketch3=new JButton("SKETCH 3");
		sketch3.setBounds(330, 10,150, 50);
		sketch3.setForeground(new Color(226,11,183));	
		sketch3.setBackground(new Color(16,1,35));
		sketch3.addActionListener(this);
		q.add(sketch3);
		
		sketch4=new JButton("SKETCH 4");
		sketch4.setBounds(490, 10,150, 50);
		sketch4.setForeground(new Color(226,11,183));	
		sketch4.setBackground(new Color(16,1,35));
		sketch4.addActionListener(this);
		q.add(sketch4);
		
		sketch5=new JButton("SKETCH 5");
		sketch5.setBounds(650, 10,150, 50);
		sketch5.setForeground(new Color(226,11,183));	
		sketch5.setBackground(new Color(16,1,35));
		sketch5.addActionListener(this);
		q.add(sketch5);
		
		sketcha=new JPanel();
		sketcha.setLayout(null);
		q.add(sketcha);
		
		sketchb=new JPanel();
		sketchb.setLayout(null);
		q.add(sketchb);
		
		sketchc=new JPanel();
		sketchc.setLayout(null);
		q.add(sketchc);
		
		sketchd=new JPanel();	
		sketchd.setLayout(null);
		q.add(sketchd);
		
		sketche=new JPanel();	
		sketche.setLayout(null);
		q.add(sketche);
		
		images1= new ImageIcon("s1.jpg");
		lbl_images1=new JLabel(images1);
		lbl_images1.setBounds(0, 0, 488, 600);
		lbl_images1.setLayout(null);
		sketcha.add(lbl_images1);
		
		images2= new ImageIcon("s2.jpg");
		lbl_images2=new JLabel(images2);
		lbl_images2.setBounds(0, 0, 542, 600);
		lbl_images2.setLayout(null);
		sketchb.add(lbl_images2);
		
		images3= new ImageIcon("s3.jpg");
		lbl_images3=new JLabel(images3);
		lbl_images3.setBounds(0, 0, 510, 600);
		lbl_images3.setLayout(null);
		sketchc.add(lbl_images3);
		
		images4= new ImageIcon("s4.jpg");
		lbl_images4=new JLabel(images4);
		lbl_images4.setBounds(0, 0, 507, 600);
		lbl_images4.setLayout(null);
		sketchd.add(lbl_images4);
	
		images5= new ImageIcon("s5.jpg");
		lbl_images5=new JLabel(images5);
		lbl_images5.setBounds(0, 0, 472, 600);
		lbl_images5.setLayout(null);
		sketche.add(lbl_images5);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==sketch1) {
			sketch1.setForeground(new Color(16,1,35));	
			sketch1.setBackground(new Color(226,11,183));
			sketch2.setForeground(new Color(226,11,183));	
			sketch2.setBackground(new Color(16,1,35));
			sketch3.setForeground(new Color(226,11,183));	
			sketch3.setBackground(new Color(16,1,35));
			sketch4.setForeground(new Color(226,11,183));	
			sketch4.setBackground(new Color(16,1,35));
			sketch5.setForeground(new Color(226,11,183));	
			sketch5.setBackground(new Color(16,1,35));
			sketcha.setBounds(190,90,488,600);
			sketchb.setBounds(0,0,0,0);
			sketchc.setBounds(0,0,0,0);
			sketchd.setBounds(0,0,0,0);
			sketche.setBounds(0,0,0,0);
		}
		else if (e.getSource()==sketch2) {
			sketch2.setForeground(new Color(16,1,35));	
			sketch2.setBackground(new Color(226,11,183));
			sketch1.setForeground(new Color(226,11,183));	
			sketch1.setBackground(new Color(16,1,35));
			sketch3.setForeground(new Color(226,11,183));	
			sketch3.setBackground(new Color(16,1,35));
			sketch4.setForeground(new Color(226,11,183));	
			sketch4.setBackground(new Color(16,1,35));
			sketch5.setForeground(new Color(226,11,183));	
			sketch5.setBackground(new Color(16,1,35));
			sketchb.setBounds(190,90,542,600);
			sketcha.setBounds(0,0,0,0);
			sketchc.setBounds(0,0,0,0);
			sketchd.setBounds(0,0,0,0);
			sketche.setBounds(0,0,0,0);
		}
		else if (e.getSource()==sketch3) {
			sketch3.setForeground(new Color(16,1,35));	
			sketch3.setBackground(new Color(226,11,183));
			sketch1.setForeground(new Color(226,11,183));	
			sketch1.setBackground(new Color(16,1,35));
			sketch2.setForeground(new Color(226,11,183));	
			sketch2.setBackground(new Color(16,1,35));
			sketch4.setForeground(new Color(226,11,183));	
			sketch4.setBackground(new Color(16,1,35));
			sketch5.setForeground(new Color(226,11,183));	
			sketch5.setBackground(new Color(16,1,35));
			sketchc.setBounds(190,90,510,600);
			sketcha.setBounds(0,0,0,0);
			sketchb.setBounds(0,0,0,0);
			sketchd.setBounds(0,0,0,0);
			sketche.setBounds(0,0,0,0);
		}
		else if (e.getSource()==sketch4) {
			sketch4.setForeground(new Color(16,1,35));	
			sketch4.setBackground(new Color(226,11,183));
			sketch1.setForeground(new Color(226,11,183));	
			sketch1.setBackground(new Color(16,1,35));
			sketch2.setForeground(new Color(226,11,183));	
			sketch2.setBackground(new Color(16,1,35));
			sketch3.setForeground(new Color(226,11,183));	
			sketch3.setBackground(new Color(16,1,35));
			sketch5.setForeground(new Color(226,11,183));	
			sketch5.setBackground(new Color(16,1,35));
			sketchd.setBounds(190,90,507,600);
			sketcha.setBounds(0,0,0,0);
			sketchb.setBounds(0,0,0,0);
			sketchc.setBounds(0,0,0,0);
			sketche.setBounds(0,0,0,0);
		}
		else if (e.getSource()==sketch5) {
			sketch5.setForeground(new Color(16,1,35));	
			sketch5.setBackground(new Color(226,11,183));
			sketch1.setForeground(new Color(226,11,183));	
			sketch1.setBackground(new Color(16,1,35));
			sketch2.setForeground(new Color(226,11,183));	
			sketch2.setBackground(new Color(16,1,35));
			sketch3.setForeground(new Color(226,11,183));	
			sketch3.setBackground(new Color(16,1,35));
			sketch4.setForeground(new Color(226,11,183));	
			sketch4.setBackground(new Color(16,1,35));
			sketche.setBounds(190,90,472,600);
			sketcha.setBounds(0,0,0,0);
			sketchb.setBounds(0,0,0,0);
			sketchc.setBounds(0,0,0,0);
			sketchd.setBounds(0,0,0,0);
		}
	}
}

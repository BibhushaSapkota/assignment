package assignment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Details implements ActionListener{
	JLabel lbl_topic,lbl_select;
	JTextField txt_id;
	JButton btn_delete;
	Font fon1,fon2;
	String user;
	JPanel panel;
	public void del(JPanel panel,String user) {
		this.user=user;
		this.panel=panel;
		
		DefaultTableModel model = new DefaultTableModel();
	    JTable jt= new JTable(model);
	    
    	jt.setFont(fon1);
    	jt.setRowHeight(50);
    	jt.setBackground(new Color(218,183,170));
    	model.addColumn("Id");
        model.addColumn("User Name");
        model.addColumn("Art");
 
        JTableHeader header = jt.getTableHeader();
        header.setFont(fon2);
        header.setBackground(Color.black);
        header.setForeground(Color.white);
        jt.getTableHeader().setPreferredSize(new Dimension(100,50));
        try {
        	Dbconnection db=new Dbconnection();
        	String query="select * from art where username='"+user+"'";
        	ResultSet rs=db.select(query);
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),rs.getString(3)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		JScrollPane pg = new JScrollPane(jt);
		pg.setBackground(new Color(218,183,170));
		pg.setBounds(10,200,950,500);
		panel.add(pg);
	}
	
	public Details(JPanel panel,String user) {
		this.user=user;
		fon1=new Font("arial",Font.BOLD,35);
		fon2=new Font("arial",Font.BOLD,18);
		
		lbl_topic=new JLabel("Type Id of the order you want to cancel");
		lbl_topic.setBounds(100,30,600,50);
		lbl_topic.setFont(fon2);
		panel.add(lbl_topic);
		
		txt_id=new JTextField();
		txt_id.setFont(fon1);
		txt_id.setBounds(500,30,170,45);
		txt_id.setBackground(new Color(245,254,255));
		panel.add(txt_id);
		
		btn_delete =new JButton("Cancel order");
		btn_delete.setFont(fon2);
		btn_delete.setBounds(400,100,170,45);
		btn_delete.setBackground(Color.black);
		btn_delete.setForeground(Color.white);
		btn_delete.addActionListener(this);
		panel.add(btn_delete);
		del(panel,user);

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_delete) {
			try {
		Dbconnection db=new Dbconnection();
		String sql = "DELETE FROM art WHERE id='"+txt_id.getText()+"'";
		int rowsDeleted = db.executeDelete(sql);
		
		if (rowsDeleted > 0) {
			JOptionPane.showMessageDialog(btn_delete, "Successfully deleted");
			panel.removeAll();
			panel.repaint();
			panel.revalidate();

			new Details(panel,user);
			del(panel,user);
			
		}
	}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
		}
	}
}

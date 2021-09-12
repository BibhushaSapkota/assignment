package assignment;

import org.junit.Test;

import javax.swing.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    User u = new User();
    buy b= new buy();

    @org.junit.jupiter.api.Test
    void test_insert(){
        Dbconnection db=new Dbconnection();
        String query="insert into registration_form(fname,lname,gender,username,password)values('\"+shova+ \"','\"+sapkota+\"','\"+female+\"','\"+shova5+\"','\"+sapkota6+\"')";

        int result =db.insert(query);
        assertEquals(1,result);

    }
    @org.junit.jupiter.api.Test
    void test_select() throws SQLException {
        Dbconnection db=new Dbconnection();
        String username="bibhu";
        String query="select * from registration_form where username='"+username+"'";
        ResultSet rs= db.select(query);
        int count = rs.getRow();
        assertEquals(0,count);

    }
    @org.junit.jupiter.api.Test
    void test_delete(){
        Dbconnection db=new Dbconnection();
        String sql = "DELETE FROM art WHERE id='"+12+"'";
        int rowsDeleted = db.executeDelete(sql);
        assertEquals(1,rowsDeleted);
    }
    @org.junit.jupiter.api.Test
    void test_update(){
        String query="update registration_form set fname='\"+sova+\"',"
                + "lname='\"+sapkot+\"' where username='\"+shova5+\"'";
        Dbconnection db=new Dbconnection();
        int rs=db.Update(query);
        assertEquals(1,rs);
    }

    @org.junit.jupiter.api.Test
    public void test_setFname(){
        u.setFname("bibhu");
        String name= u.getFname();
        assertEquals("bibhu",name);

    }
    @org.junit.jupiter.api.Test
    public void test_setArt(){
        b.setArt("sketch1");
        String art=b.getArt();
        assertEquals("sketch1",art);
    }
    @org.junit.jupiter.api.Test
    void registration_test() {
        String pas="sapkota6";
        String cpass="sapkota6";
        Register reg=new Register();
        boolean result=reg.registration_test(pas,cpass);
        assertEquals(true,result);

    }

    @org.junit.jupiter.api.Test
    void registration_test2() {
        String pas="sapkota6";
        String cpass="sapkota5";
        Register reg=new Register();
        boolean result=reg.registration_test(pas,cpass);
        assertEquals(true,result);

    }
    @org.junit.jupiter.api.Test
    void login_test(){
        String username="bibhu";
        String password="sapkota6";
        Login log=new Login();
        boolean result=log.login_test(username,password);
        assertEquals(true,result);

    }

    @org.junit.jupiter.api.Test
    void login_test2(){
        String username="bibhu6";
        String password="sapkota";
        Login log=new Login();
        boolean result=log.login_test(username,password);
        assertEquals(true,result);

    }


}
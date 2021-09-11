package assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection {
	Connection con;
	Statement st;
	int val,values,value;
	ResultSet rows;
	public Dbconnection() {
		// register the driver class
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// creating connection object
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","@!2002bisesh");
			
			//creating the statement object
			st=con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		

public int insert(String query) {
	try {
		
	val=st.executeUpdate(query); 
	}catch(SQLException throwables){
		throwables.printStackTrace();
		
	}
	
return val;
}

public ResultSet select(String query) {
	try {
		rows=st.executeQuery(query);
	} catch (SQLException throwables) {
		throwables.printStackTrace();
	}
	return rows;
	
}

public int Update(String query) {
	
	try {
		values=st.executeUpdate(query);
	} catch (SQLException throwables) {
		// TODO Auto-generated catch block
		throwables.printStackTrace();
	}
	return values;
}

public int executeDelete(String sql) {
	try {
		value=st.executeUpdate(sql);
	}
	catch(SQLException throwables) {
		throwables.printStackTrace();
	}
	// TODO Auto-generated method stub
	return value;
}

public static void main(String[]args) {
	new Dbconnection();
}

}

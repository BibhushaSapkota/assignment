package assignment;

public class User {
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	String fname;
	String lname;
	String gender;
	String username;
	String password;
	String cpassword;
	public User(String fname, String lname, String gender, String username, String password, String cpassword) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.cpassword = cpassword;
	}

}

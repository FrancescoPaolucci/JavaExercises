import java.sql.*;

public class Utenti {
	
	private String name;
	private String lastname;
	private String email;
	private String pw;
	
	public Utenti () {
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public void addUSer(String name, String lastname,String email,String pw) {
		try {
	Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","Lezzume55");
	Statement myStmt = myConn.createStatement();
	myStmt.executeUpdate("INSERT INTO utenti(firstname,lastname,email,pw) VALUES ('"+name+"','"+lastname+"','"+email+"','"+pw+"');");
	}	
	catch(Exception exc) {
		exc.printStackTrace();
	}
		
			
		
	}
	
}

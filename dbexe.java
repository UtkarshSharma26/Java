import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class dbexe {

  public static void main(String[] args) {

	/*System.out.println("-------- MySQL JDBC Connection Testing ------------");

	try {
	Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("MySQL JDBC Driver Registered!");*/
	Connection con = null;
	Statement st = null;

	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root", "root");

	

	if (con == null) {
		System.out.println("Failed to make connection!");
	}


	System.out.println("Creating statement...");
	st=con.createStatement();
	String sql;
	sql = "SELECT user_id,user_name,user_age FROM user";
	ResultSet rs= st.executeQuery(sql);
System.out.println("User Id		User Name 	User Age");
System.out.println("___________________________________________");
	while(rs.next()){
		int id = rs.getInt("user_id");
		int age = rs.getInt("user_age");
		String name = rs.getString("user_name");

	//Display Values
		System.out.println("												");
		System.out.println("   "+id+"		   "+name+"		   "+age);
		System.out.println("___________________________________________");
	}

	rs.close();
	st.close();
	con.close();
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}
  }
}
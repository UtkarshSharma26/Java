import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
class dbdel
{
	public static void main(String args[])
	{
		try
		{
                                                              
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");

Statement ps= con.createStatement();
String s="Delete from User where user_id=5";
ps.execute(s);
ps.close();
con.close();
	}
	catch(Exception e){
		System.out.print("Error");
	}

	}
}
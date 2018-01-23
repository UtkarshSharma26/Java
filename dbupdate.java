import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
class dbupdate
{
	public static void main(String args[])
	{
		try
		{
                                                              
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
String s="UPDATE user SET user_name = 'lmn' where user_id= 4";
Statement ps= con.createStatement();
ps.execute(s);
ps.close();
con.close();
	}
	catch(Exception e){
		System.out.print("Error");
	}

	}
}
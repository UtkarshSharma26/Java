import java.sql.*;

class dbtest
{
	public static void main(String args[])
	{
	  try
	  {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
	  Statement st=con.createStatement();

	  ResultSet rs = st.executeQuery("select * from user");

	  while(rs.next())
	  {
	  	System.out.println("hello"+rs.getString("user_name")+rs.getInt("user_age"));
	  }
	  }catch(Exception e){System.out.println(e);}
	}
}
import java.sql.*;


class dbinsert
{
	public static void main(String args[])
	{
		try
		{
                                     
                            
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");

PreparedStatement pst = con.prepareStatement("insert into user(user_name,user_age) values( ?,?)");
pst.setString(1,"kkk");
pst.setString(2,"22");
pst.executeUpdate();


/*pst.setString(1,"def");
pst.setString(2,"25");
pst.executeUpdate();


pst.setString(1,"ghi");
pst.setString(2,"26");
pst.executeUpdate();

*/

	}catch(Exception e){
		System.out.print("Error");
	}

	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.lang.*;
class Login extends JFrame implements ActionListener
{
	 JTextField tf1;
	 JPasswordField tf2;
	 JButton b1,b2;
	 JLabel l1,l2,l3;

     Login(String s)
     {
      super(s);
      l1=new JLabel("User Name     : ");
      l2=new JLabel("Password      : ");
      l3=new JLabel("Enter your Credentials :");
      tf1=new JTextField("");
      tf2=new JPasswordField("");
      b1 = new JButton("Submit");
      b2 = new JButton("Quit");
	 l1.setBounds(40,100,100,50);
	 l2.setBounds(40,180,100,50);
	 l3.setBounds(20,25,600,50);
	 tf1.setBounds(200,110,400,30);
	 tf2.setBounds(200,190,400,30);
	 b1.addActionListener(this);
	 b1.setBounds(100,300,150,50);
	 b2.addActionListener(this);
	 b2.setBounds(450,300,150,50);
	 add(l1);
	 add(tf1);
	 add(l2);
	 add(tf2);
	 add(l3);
	 add(b1);
	 add(b2);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(null);
     setLocation(450,200);
     setSize(750,450);
	 setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
   {    
       if(e.getSource()==b1)
       {
        setVisible(false);
       	if(((tf1.getText()).trim()).equals("Admin") && ((tf2.getText()).trim()).equals("quiz"))
       	{
      		JFrame frame = new JFrame("Admin");
        	frame.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
        	frame.getContentPane().add(new Admin(),BorderLayout.CENTER);
        	frame.setSize(700, 1000);
        	frame.setVisible(true);
       		
       	}
       	else 
	{
		if(checkdb(tf1.getText(),tf2.getText())==1)
    	   		new Subjects("Quiz",tf1.getText());
		else
	        	JOptionPane.showMessageDialog(this,"Wrong Credentials!! Contact Admin");
       	}

	}
       else
       {
       	System.exit(0);
       }
   }


   public int checkdb(String uname, String upass)
   {
   		Connection con;
		Statement st = null;

	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Quiz","root", "root");

	   	st=con.createStatement();
		String sql;
		sql = "SELECT * FROM Contestant where contestant_name = '" + uname + "' and contestant_Pass = '" + upass + "'";
		ResultSet rs= st.executeQuery(sql);
		if (!rs.next() )
		    	return(0);
	    	else 
			return(1);
 
		} 

	catch (SQLException e) 
	{
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return(2);
	}

	finally
	{ 
		con=null;
	}
   }

   public static void main(String[] args)
   {
   	new Login("Quiz");
   }
}
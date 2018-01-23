import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException; 

class Subjects extends JFrame implements ActionListener
{
	 JList ls1;
   public static String sub,username;
   public int sub_id;
	 JButton b1,b2;
	 JLabel l1,l2;
   DefaultListModel subj ;
     Subjects(String s,String uname)
     {
      super(s);
      username=uname;
      l1=new JLabel("Welcome "+uname+" !");
      l2=new JLabel("Select Subject Before Proceeding : ");
      subj = new DefaultListModel();
      JScrollPane sp = new JScrollPane();
      //Jlist = new Jlist();
    
      FillList();
      ls1=new JList(subj);
      ls1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      ls1.setSelectedIndex(0);
      ls1.setVisibleRowCount(4);
      //sp.setViewportView(subj);
      b1 = new JButton("Start Quiz!");
      b2 = new JButton("Give Up!");
	 //setLayout(Layout.GridLayout);
     l1.setBounds(20,25,500,50); 
     l2.setBounds(40,100,500,50);
	 	 b1.addActionListener(this);
	   b1.setBounds(100,300,150,50);
	   b2.addActionListener(this);
	   b2.setBounds(450,300,150,50);
	   ls1.setBounds(300,120,150,80);
   	   add(l1);
           add(l2);
	   add(ls1);
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
        sub_id=ls1.getSelectedIndex()+1;
        l1.setText("You have selected : " +ls1.getSelectedIndex());
        sub=new String(""+ls1.getSelectedValue());
        setVisible(false);
       	new kbc("Quiz",sub_id,username);
       }
       else
       {
       	System.exit(0);
       }
   }

   public void FillList()
   {
      Connection con = null;
      Statement st = null;

  try {
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");

  

  if (con == null) 
  {
    System.out.println("Failed to make connection!");
  }

  st=con.createStatement();
  String sql;
  sql = "SELECT Sub_name from Subject";
  ResultSet rs= st.executeQuery(sql);
  while(rs.next())
  {
       subj.addElement(rs.getString("sub_name"));
  }

  rs.close();
  st.close();
  con.close();
  } 
  catch (SQLException e)
  {
    System.out.println("Connection Failed! Check output console");
    e.printStackTrace();
    return;
  }

  }
   
   public static void main(String[] args)
   {
   	new Subjects("Quiz",username);
   }
}
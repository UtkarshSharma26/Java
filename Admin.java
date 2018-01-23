import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.lang.*;

public class Admin extends JPanel implements ActionListener
{
		JTextField tf1,tfopt1,tfopt2,tfopt3,tfopt4,tfcopt,tfdiff;
		JTextArea taq;
		JPasswordField tf2,tf3;
		JButton b1,b2,b3;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JList ls1;
	        DefaultListModel subj ;

       
    public Admin() 
    {
        ImageIcon icon = new ImageIcon("java-swing-tutorial.JPG");
        JTabbedPane jtbExample = new JTabbedPane();

 	JPanel jplInnerPanel1 = new JPanel(); 
        jtbExample.addTab("Add Questions", icon, jplInnerPanel1, "Quiz");
        jtbExample.setSelectedIndex(0);
        setControls1(jplInnerPanel1);
        JPanel jplInnerPanel2 = new JPanel();
	jtbExample.addTab("Add Users", jplInnerPanel2);
        setControls2(jplInnerPanel2);

        //Add the tabbed pane to this panel.
        setLayout(new GridLayout(1,1));
        add(jtbExample);
	setVisible(true);
    }

	public void setControls1(JPanel jp)
	{
		l1=new JLabel("Select Subject     : ");
      		l2=new JLabel("Question      : ");
      		l3=new JLabel("option A :");
      		l4=new JLabel("option B :");
      		l5=new JLabel("option C :");
      		l6=new JLabel("option D :");
      		l7=new JLabel("Correct Option :");
      		l8=new JLabel("Difficulty Level :");

      		taq=new JTextArea(5,200);
      		tfopt1=new JTextField("");
	  	tfopt2=new JTextField("");
	  	tfopt3=new JTextField("");
	  	tfopt4=new JTextField("");
      		tfcopt=new JTextField("");
                tfdiff=new JTextField("");      
      		subj = new DefaultListModel();
      		JScrollPane sp = new JScrollPane();
      		subj.addElement("Mathematics");
      		subj.addElement("Science");
      		subj.addElement("GK");
      		subj.addElement("Mental Ability");
  
 		ls1=new JList(subj);
      		ls1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      		ls1.setSelectedIndex(0);
      		ls1.setVisibleRowCount(4);

	      	b3 = new JButton("Save");
      		b2 = new JButton("Quit");
	 
		jp.setLayout(null);
     
	     	l1.setBounds(40,10,100,50);
	 	l2.setBounds(40,80,100,50);
	 	l3.setBounds(40,190,100,50);
	 	l4.setBounds(40,265,100,50);
	 	l5.setBounds(40,340,100,50);
	 	l6.setBounds(40,415,100,50);
	 	l7.setBounds(40,490,100,50);
		l8.setBounds(400,490,100,50);
	 	
		ls1.setBounds(200,10,400,70);
	 	taq.setBounds(200,90,400,90);
	 	tfopt1.setBounds(200,200,400,30);
	 	tfopt2.setBounds(200,275,400,30);
		tfopt3.setBounds(200,350,400,30);
	 	tfopt4.setBounds(200,425,400,30);
	 	tfcopt.setBounds(200,500,50,30);
		tfdiff.setBounds(550,500,50,30);	
		
		b3.setBounds(100,575,150,50); 	
		b3.addActionListener(this);
	 
		b2.addActionListener(this);
	 	b2.setBounds(450,575,150,50);
	
		jp.add(l1);
	 	jp.add(ls1);
	 	jp.add(l2);
	 	jp.add(taq);
	 	jp.add(l3);
	 	jp.add(tfopt1);
	  	jp.add(l4);
	 	jp.add(tfopt2);
 	 	jp.add(l5);
	 	jp.add(tfopt3);
	 	jp.add(l6);
	 	jp.add(tfopt4);
	 	jp.add(l7);
	 	jp.add(tfcopt);
		jp.add(l8);
		jp.add(tfdiff); 	
		jp.add(b3);
	 	jp.add(b2);
	 	setVisible(true);
	}

	public void setControls2(JPanel jp)
	{

		l1=new JLabel("User Name     : ");
      		l2=new JLabel("Password      : ");
      		l3=new JLabel("Re-Enter Password :");
      		l4=new JLabel("Add Details For Creation Of New Contestant Account");
      		tf1=new JTextField("");
      		tf2=new JPasswordField("");
      		tf3=new JPasswordField("");
      		b1 = new JButton("Submit");
      		b2 = new JButton("Quit");
	 
     		jp.setLayout(null);
     		l1.setBounds(40,100,150,50);
	 	l2.setBounds(40,180,150,50);
	 	l3.setBounds(40,260,150,50);
	 	l4.setBounds(200,50,400,30);
	 	tf1.setBounds(200,110,400,30);
	 	tf2.setBounds(200,190,400,30);
	 	tf3.setBounds(200,270,400,30);
	 	b1.addActionListener(this);
	 	b1.setBounds(100,340,150,50);
	 	b2.addActionListener(this);
	 	b2.setBounds(450,340,150,50);
	 	jp.add(l1);
	 	jp.add(tf1);
	 	jp.add(l2);
	 	jp.add(tf2);
	 	jp.add(l3);
	 	jp.add(tf3);
	 	jp.add(l4);
	 	jp.add(b1);
	 	jp.add(b2);
   		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{    
       		if(e.getSource()==b1)
       		{    
       	    		if(tf2.getText().equals(tf3.getText()))
        	    		checkdb(tf1.getText(),tf2.getText());
        		else
        	    		JOptionPane.showMessageDialog(this,"Passwords Do not Match.");	     		
       		}

   	   	else if(e.getSource()==b3)
               		addToDB(""+ls1.getSelectedValue());
   	   	else
           		System.exit(0);
	}


	public void checkdb(String uname, String upass)
   	{
   		Connection con;
		Statement st = null;

		try 
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Quiz","root", "root");
	   		st=con.createStatement();
			String sql;
			sql = "SELECT * FROM Contestant where contestant_name = '" + uname + "'";
			ResultSet rs= st.executeQuery(sql);
	    		if (!rs.next() )
	     		{
	     			PreparedStatement pst = con.prepareStatement("insert into Contestant(contestant_name,contestant_pass) values(?,?)");
				pst.setString(1,uname);
				pst.setString(2,upass);
				pst.executeUpdate();
				pst.close();
				JOptionPane.showMessageDialog(this,"Account Created Successfully.");	     	
	     		}
	     		else
  			JOptionPane.showMessageDialog(this,"Account With This Name Already Exists!!");	     	
		
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

		finally
		{ 
			con=null;
		}
	}


	public void addToDB(String sub)
   	{
   		Connection con;
		Statement st = null;
		PreparedStatement pst =null;
		try 
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Quiz","root", "root");

			if(sub.equals("Mathematics"))
	     			pst = con.prepareStatement("insert into Mathematics(q_des,opt1,opt2,opt3,opt4,correct_ans,difficulty) values(?,?,?,?,?,?,?)");
			else if(sub.equals("Science"))
	     			pst = con.prepareStatement("insert into Science(q_des,opt1,opt2,opt3,opt4,correct_ans,difficulty) values(?,?,?,?,?,?,?)");
			else if(sub.equals("GK"))
	     			pst = con.prepareStatement("insert into GK(q_des,opt1,opt2,opt3,opt4,correct_ans,difficulty) values(?,?,?,?,?,?,?)");
			else if(sub.equals("Mental Ability"))
	     			pst = con.prepareStatement("insert into MentalAbility(q_des,opt1,opt2,opt3,opt4,correct_ans,difficulty) values(?,?,?,?,?,?,?)");

				pst.setString(1,taq.getText());
				pst.setString(2,tfopt1.getText());
				pst.setString(3,tfopt2.getText());
				pst.setString(4,tfopt3.getText());
				pst.setString(5,tfopt4.getText());
				pst.setString(6,tfcopt.getText());
				pst.setString(7,tfdiff.getText());
				pst.executeUpdate();
				pst.close();
	    		con.close();
		} 
		catch (SQLException e) 
		{
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		finally
		{ 
			con=null;
		}

	}
    

/*	public static void main(String[] args) 
    	{
        	JFrame frame = new JFrame("Admin");
        	frame.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
        	frame.getContentPane().add(new Admin(),BorderLayout.CENTER);
        	frame.setSize(700, 1000);
        	frame.setVisible(true);
    	}*/
}
/*Quiz
* Created by Utkarsh Sharma on 3/29/2017.
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

class kbc extends JFrame implements ActionListener
{  String q[][]=new String[10][7];
   JLabel l;
   JRadioButton jb[]=new JRadioButton[5];
   JButton b1,b2,b3;
   ButtonGroup bg;
   int count=0,current=0,x=1,y=1,now=0;
   int m[]=new int[10];
   String username;
   kbc(String s, int sub_id, String uname)
   { 
       super(s);
       username=uname;
       setQues(sub_id);
       
       l=new JLabel(q[0][1]);
       add(l);
       bg=new ButtonGroup();
       for(int i=0;i<5;i++)
       {
           jb[i]=new JRadioButton();
           add(jb[i]);
           bg.add(jb[i]);
       }
       b1=new JButton("Next");
       b2=new JButton("Previous");
       b3=new JButton("Result");
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       add(b1);
       add(b2);
       add(b3);
       set();
       l.setBounds(50,20,900,30);
       jb[0].setBounds(50,150,900,30);
       jb[1].setBounds(50,200,900,30);
       jb[2].setBounds(50,250,900,30);
       jb[3].setBounds(50,300,900,30);
       b1.setBounds(175,400,150,40);
       b2.setBounds(450,400,150,40);
       b3.setBounds(175,400,150,40);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(null);
       setLocation(50,50);
       setVisible(true);
       setSize(1000,500);
   }
   public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==b1)
       {
          checkedOption();
        //  if(q[current][5].equals(q[current][6]))
          //JOptionPane.showMessageDialog(this,"You have selected : "+q[current][5] + " and correct_ans = "+q[current][6]);
          current++;
          set();
       }
       if(e.getActionCommand().equals("Previous"))
       {
          checkedOption();
       	  if(current>0)
       	   {
       	   	current--;
           set();
           }
       }
       if(e.getActionCommand().equals("Result"))
       {    
          checkedOption();
            count=0;
           //if(check())
            for(int i = 0;i<10;i++)
            {
              if(q[i][5].equals(q[i][6]))
               count=count+1;
            }
           //current++;
           //System.out.println("correct ans="+count);
           
           JOptionPane.showMessageDialog(this,"Congratulations "+ username + " Your Total Score is: "+count+" / 10");
	   updateDB();
           System.exit(0);
       }
   }
   void set()
   {
       jb[4].setSelected(true);
       //if(current==0)
       	   int q_no=current+1;
           l.setText("<html><p>Que "+q_no+"  : "+q[current][0]+"</p></html>");
           jb[0].setText(q[current][1]);jb[1].setText(q[current][2]);jb[2].setText(q[current][3]);jb[3].setText(q[current][4]);
    
           l.setBounds(50,20,900,80);
       for(int i=0,j=0;i<=50;i+=300,j++)
           jb[j].setBounds(50,150+i,900,30);
        if (q[current][5] != "")
        {
          if(q[current][5] == "A")
            jb[0].setSelected(true) ;
  
          else if(q[current][5] == "B")
            jb[1].setSelected(true);
          else if(q[current][5] == "C")
            jb[2].setSelected(true);
          else if(q[current][5] == "D")
            jb[3].setSelected(true);
        }

       if(current==0)
       	b2.setVisible(false);
       else
       	b2.setVisible(true);
       
       if (current==9)
       	b1.setVisible(false);
       else
       	b1.setVisible(true);

       if(current==9)
         b3.setVisible(true);
       else
         b3.setVisible(false);
   }  
   void checkedOption()
   {
        if(jb[0].isSelected()) 
           q[current][5]="A";
        else if (jb[1].isSelected()) 
           q[current][5]="B";
        else if (jb[2].isSelected()) 
           q[current][5]="C";
        else if (jb[3].isSelected()) 
           q[current][5]="D";
   }



  void setQues(int sub_id)
   {  
   	Connection con = null;
	Statement st = null;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root", "root");
	if (con == null) {
		System.out.println("Failed to make connection!");
	}
	
	int i=0,j=1,cnt=0;
	st=con.createStatement();
	String sql="",csq="";

	if(sub_id==1)
	{
		sql = "SELECT * FROM Mathematics";
		csq = "SELECT COUNT(q_id) FROM Mathematics";
	}
	else if(sub_id==2)
	{
		sql = "SELECT * FROM Science";
		csq = "SELECT COUNT(q_id) FROM Science";
	}
	else if(sub_id==3)
	{
		sql = "SELECT * FROM GK";
		csq = "SELECT COUNT(q_id) FROM GK";
	}
	else if(sub_id==4)
	{
		sql = "SELECT * FROM MentalAbility";
		csq = "SELECT COUNT(q_id) FROM MentalAbility";
	}

	ResultSet rs= st.executeQuery(sql);
	ResultSet crs= st.executeQuery(csq);

	if(crs.next())
        cnt=crs.getInt(1);


  int n=0,fnd=0,k=0;

   i=0;
   while(i<10)
  {
	j=(int) ((Math.random() * cnt)+1);   
   fnd=0;
  for(n=0;n<10;n++)
    {
      if(m[n]==j)
        {
          fnd=1;
          break;
        }
    }
    if(fnd==0)
    { 
      
 	switch(sub_id)
    {
      case 1 :   sql = "SELECT * FROM Mathematics where q_id="+j;
                break;
      case 2 :   sql = "SELECT * FROM Science where q_id="+j;
                break;  
      case 3 :   sql = "SELECT * FROM GK where q_id="+j;
                break;
      case 4 :   sql = "SELECT * FROM MentalAbility where q_id="+j;
                break;
     }
      rs= st.executeQuery(sql);
      if(rs.next())
      {
        m[k++]=j;
        q[i][0]=rs.getString("q_des");
        q[i][1]=rs.getString("opt1");
        q[i][2]=rs.getString("opt2");
        q[i][3]=rs.getString("opt3");
        q[i][4]=rs.getString("opt4");
        q[i][5]="";
        q[i][6]=rs.getString("correct_ans");  
         i++;
     }
    }
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

public void updateDB()
{
   	Connection con = null;
	Statement st = null;
	try
	{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root", "root");
		if (con == null)
		{
			System.out.println("Failed to make connection!");
		}
	PreparedStatement pst = con.prepareStatement("Update Contestant set ques_correct = "+ count +", score = "+count+ " where contestant_name = '" + username +"'");
	pst.executeUpdate();
	pst.close();
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
}
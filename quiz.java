/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class quiz extends JFrame implements ActionListner
{
	Jlabel l;
	JRadiobutton jb[]=new JRadiobutton[6];
	JButton b1,b2,b3,b4;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    quiz(String s)
    {
    	super(s);
    	l=new Jlabel();
    	add(l);
    	b1=new JButton("Contestant");
        b2=new JButton("Official");
        b1.addActionListner(this);
        b2.addActionListner(this);
        add(b1);
        add(b2);
        set();
        l.setBounds(50,50,500,30);
    	b1.setBounds(175,220,150,40);
        b2.setBounds(450,220,150,40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(450,200);
        setVisible(true);
        setSize(900,400);
    }
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		b1.setEnabled(false);
    		b2.setText("")
    	}
    }


    public static void main(String s[])
   {
       new quiz("Quiz");
   }
}*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class quiz extends JFrame
{
    //declaring our swing components
    JLabel l_name,l_pass;
    JTextField t_name;
    JPasswordField t_pass;     //A special JTextField but hides input text
    JButton button;
    Container c;
 
    //a inner class to handling ActionEvents
    handler handle;
 
    //a separate class for processing database connection and authentication
    database db;
 
    quiz()
    {
        super("Login form");
 
        c=getContentPane();
        c.setLayout(new FlowLayout());
 
        //extra classes
        db=new database();
            handle =new handler();
 
                //swing components
        l_name=new JLabel("Username");
        l_pass=new JLabel("Password");
        t_name=new JTextField(10);
        t_pass=new JPasswordField(10);
        button=new JButton("Login");
 
        //adding actionlistener to the button
        button.addActionListener(handle);
 
        //add to contaienr
        c.add(l_name);
        c.add(t_name);
        c.add(l_pass);
        c.add(t_pass);
        c.add(button);
        //visual
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,130);
 
    }
    public static void main(String args[])
    {
        quiz sample=new quiz();
    }
 
    //an inner class .You can also write as a separate class
    class handler implements ActionListener
    {
        //must implement method
        //This is triggered whenever the user clicks the login button
        public void actionPerformed(ActionEvent ae)
        {
            //checks if the button clicked
            if(ae.getSource()==button)
            {
                char[] temp_pwd=t_pass.getPassword();
                String pwd=null;
                pwd=String.copyValueOf(temp_pwd);
                System.out.println("Username,Pwd:"+t_name.getText()+","+pwd);
 
                //The entered username and password are sent via "checkLogin()" which return boolean
                if(db.checkLogin(t_name.getText(), pwd))
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
            }//if
        }//method
 
    }//inner class
}//class
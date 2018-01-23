import java.io.*;
class oddeven
{
     public static void main(String args[])
        {
        int n;
        DataInputStream ds = new DataInputStream(System.in);
        try
        {
           System.out.print("Enter any number :");
            n=Integer.parseInt(ds.readLine());
            if(n%2==0)
            {
              System.out.println(n+" is Even");
             }
             else
             {
              System.out.println(n+" is odd");
              }
             }
        catch(Exception e)
        {
        }
        
        }
    }

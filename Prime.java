import java.util.Scanner;
class Prime
{
public static void main( String args[])
{
Scanner a= new Scanner(System.in);
System.out.print("Series will end at:");
int n = a.nextInt();
int x=2;
for(int i=1;i<n;i++)
{
int c=0;
for(int j=1;j<=x;j++)
if(x%j==0)
c++;
if(c==2)
System.out.println(x+"  ");
x++;
}
}
}
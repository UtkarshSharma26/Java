import java.util.Scanner;
class Digitsum
{
	public static void main(String args[])
	{
		long cnt=0,sum=0,b=0,rev=0;
		Scanner n=new Scanner(System.in);
		System.out.print("Enter the Number  ");
		long a=n.nextLong();
		System.out.println("The number entered is  "+a);
	//	for(cnt=0;a!=0;cnt++)
	    while (a>0)
		{
			b=a%10;
			sum=sum+b;
			rev=rev*10+b;
			cnt++;
			a=a/10;
		}
		System.out.println("Number of Digits is  "+cnt);
		System.out.println("Digit sum of is  "+sum);
		System.out.println("Reverse of the Number is  "+rev);
	}
}
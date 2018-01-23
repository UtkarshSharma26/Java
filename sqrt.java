import java.lang.Math;
import java.util.Scanner;
class sqrt
{
	public static void main(String args[])
	{
		Scanner n=new Scanner(System.in);
		System.out.print("Enter the number: ");
		double x=n.nextDouble();
		double y;
		y=Math.sqrt(x);
		System.out.println("Square root of "+x+" is "+y);
	}
}

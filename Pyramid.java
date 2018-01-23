import java.util.Scanner;
class Pyramid
{
	public static void main(String args[])
	{
		int p,i,j;
		Scanner n=new Scanner(System.in);
		System.out.print("Enter number of rows ");
		p=n.nextInt();
		for(i=1;i<=p;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		for(i=p;i>=1;i--)
		{
			for(j=1;j<=i-1;j++)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}

	}
}
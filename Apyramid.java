import java.util.Scanner;
class Apyramid
{
	public static void main(String args[])
	{
		int p,i,j,k,l,m;
		char c='A';
		Scanner n=new Scanner(System.in);
		System.out.print("Enter number of rows ");
		p=n.nextInt();
		m=p*2+1;
		for(i=1;i<=p;i++)
		{
			for(k=1;k<=m;k++)
				{
					System.out.print(" ");		
				}	
			for(j=1,c='A';j<=i;j++,c++)
				{
					System.out.print(c+" ");
				}
				c--;
				for(l=j-2,c--;l>=1;l--,c--)
				{
					System.out.print(c+" ");
				}
				System.out.println();
				m=m-2;
		}	

	}
}
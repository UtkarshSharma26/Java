class fib
{
	public static void main(String args[])
	{
		int a=0;
		int b=1;
		int c;
		int x=1;
		System.out.print(a+" "+b+" ");
		while(x<=5)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			x++;
		}
	}
}
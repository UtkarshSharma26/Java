class factorial
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int f=1;
		/*System.out.println("Number is "+x);
		for(int i=1;i<=x;i++)
		{
			//int f;
			f=f*i;
		}*/
		while(x>0)
		{
			f=f*x;
			x--;
		}
		System.out.println("Factorial is "+f);
	}
}
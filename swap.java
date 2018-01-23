class swap
{
	public static void main(String args[])
	{
		int x=5;
		int y=7;
		int z;
		System.out.println("Original numbers "+x+"  "+y);
		z=x;
		x=y;
		y=z;
		System.out.println("Swapped numbers "+x+"  "+y);

	}
}
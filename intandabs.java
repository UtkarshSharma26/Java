interface Area
{
	public void Circarea(int r);
	public void Sqarea(int s);
}
class Circle
{
	void Circarea(int r)
	{
		double a;
		a=3.14*r*r;
		System.out.println("The area of the Circle is"+a);
	}
}
class Square
{
	void Sqarea(int s)
	{
		int a;
		a=s*s;
		System.out.println("The area of the Square is"+a);
	}
}
public class intandabs
{
	public static void main(String args[])
	{
		Circle obj = new Circle();
		Square k = new Square();
		k.Sqarea(6);
		obj.Circarea(4);
	}
}
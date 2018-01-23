//package nestedClass;

public class OuterClass 
{
	int a;
	OuterClass(int n)
	{
		 a=n;
	}
	public static class InnerClass
	{
		final int b=33;
		OuterClass outer;
		InnerClass(int m)
		{
			outer=new OuterClass(m);
		}
		void display()
		{
			System.out.println("The outer class variable is"+ outer.a);
			System.out.println("The inner class variable is" + b);
		}
	}

}
class nestedClass
{
    public static void main(String[] args)
    {
        OuterClass.InnerClass inner=new OuterClass.InnerClass(77);
        inner.display();
    }
}

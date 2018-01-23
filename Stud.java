import java.util.Scanner;
class Stud
{
	int p,c,m,t;
	double a;
	Stud()
	{
		p=0;c=0;m=0;
	}
	void getmarks(int x,int y,int z)
	{
		p=x;c=y;m=z;
	}
	void calc()
	{
		t=p+c+m;
		a=t/3;
	}
	void disp()
	{
		System.out.println("Total: "=t);
		System.out.println("Average: "+a);
		if(a>=50.0)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
Public class marks
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter marks of Subjects: ");
	int x= s.nextInt();
	int y= s.nextInt();
	int z= s.nextInt();
	Stud obj = new Stud()
	obj.getmarks(x,y,z);
	obj.calc();
	obj.disp();
}
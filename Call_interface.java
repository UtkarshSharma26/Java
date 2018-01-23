 interface Area
{
 public void circarea(int r);
 public void squarearea(int s);
}
class Circle
{
 void circarea(int r)
{
 double a;
a=3.14*r*r;
System.out.println("the area is "+a);
}
}
class Square
{
 void squarearea(int s)
{
 int a;
a=s*s; 
System.out.println("area of square is "+a);
}
}
	
public class Call_interface
{
public static void main(String []Args)
{
 
 Circle obj=new Circle();
Square k=new Square();
k.squarearea(6);
obj.circarea(4);
}}

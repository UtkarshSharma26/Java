//operators and flow control
import java.util.Scanner;
class Ofc
{	
	public static void main ( String args[])
	{
		Student s = new Student();
		s.getdata();
		s.putdata();
	}
}
 class Student
 {
 	Scanner in=new Scanner (System.in);
 	String name , reg_no;
    int sem;
    float m;
    String mgrade[] = new String[5];
    String subject[] = new String[5];
    float marks[] = new float[5];
    String grade;
    int mean;

    public void getdata()
    {
    	System.out.println("Enter the name of the student : ");
    	name = in.nextLine();
    	System.out.println("Enter the Reg No. of "+name+" : ");
    	reg_no = in.nextLine();
    	System.out.println("Enter the current semester of "+reg_no+" : ");
    	sem = in.nextInt();
    	System.out.println("Enter the "+sem+" sems Subjects : ");
    	for(int i=0;i<5;i++)
    	{
    		subject[i] = in.next();
    	}
    	System.out.println("Enter the "+sem+" sems marks : ");
    	for(int i=0;i<5;i++)
    	{
    		marks [i] = in.nextFloat();
    		m = marks[i];
    		if(m>=90) mgrade[i]="A+";
    		else if(m>=80&&m<90) mgrade[i]="A";
    		else if(m>=70&&m<80) mgrade[i]="B+";
    		else if(m>=60&&m<70) mgrade[i]="B";
    		else if(m>=50&&m<60) mgrade[i]="c";
    		else mgrade[i]="F";
    		mean+= marks[i];
    	}
    	mean/=5;
    	if(mean>=90) grade="A+";
    		else if(mean>=80&&mean<90) grade ="A";
    		else if(mean>=70&&mean<80) grade ="B+";
    		else if(mean>=60&&mean<70) grade ="B";
    		else if(mean>=50&&mean<60) grade ="c";
    		else grade ="F";	
    }

    	public void putdata()
    	{
    		System.out.println("Student Name :"+name);
    		System.out.println("Student Reg.No. :"+reg_no);
    		System.out.println("Semester :"+sem);
    		for(int i=0;i<5;i++)
    		{
    			System.out.print("\t"+subject[i]);
    			System.out.print("\t"+marks[i]);
    			System.out.print("\t"+mgrade[i]);
    		System.out.println();
    		}
    		System.out.println("Total Grade : "+grade);
    	}
 }
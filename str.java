import java.util.*;
import java.lang.StringBuffer;
class string
{
    public static void main(String[] args)
      {
        String first="",second="";
        Scanner sc =new Scanner(System.in);
            System.out.println("\t\t\tString Operation");
            System.out.println();
            System.out.print("Enter the first String: ");
            first=sc.nextLine();
            System.out.print("Enter the second String: ");
            second=sc.nextLine();
            System.out.println();
            System.out.println("The strings are: "+first+" , "+second);
            System.out.println();
            System.out.println("The length of the first string is :"+first.length());
            System.out.println();
         	System.out.println("The length of the second string is :"+second.length());
         	System.out.println();
         	System.out.println("The Second string trimmed is :"+second.trim());
         	System.out.println();
         	System.out.println("The concatenation of first and second string is :"+first.concat(" "+second.trim()));
         	System.out.println();
         	System.out.println("The first character of " +first+" is: "+first.charAt(0));
         	System.out.println();
         	System.out.println("The uppercase of " +second+" is: "+second.toUpperCase());
         	System.out.println();
            System.out.println("The lowercase of " +first+" is: "+first.toLowerCase());
            System.out.println();
            System.out.print("Enter the occurance of a character in "+first+" : ");
            String str=sc.next();
            char c=str.charAt(0);
            System.out.println("The "+c+" occurs at position " + first.indexOf(c)+ " in " + first);
            System.out.println();
            System.out.println("The substring of "+first+" starting from index 3 and ending at 6 is: " + first.substring(3,7));
            System.out.println();
            System.out.println("Replacing 'a' with 'o' in "+first+" is: "+first.replace('a','o'));
            System.out.println();
            boolean check=first.equals(second);
            if(!check)
                System.out.println(first + " and " + second + " are not same.");
            else
                System.out.println(first + " and " + second + " are same.");  
            
            System.out.println();
            System.out.println("\t\t\tString Buffer");
            StringBuffer sb=new StringBuffer("language"); 
            System.out.print("String is replaced as ");
            sb.replace(1,3,"Java");  
            System.out.println(sb);
            System.out.print("Delete ");
            sb.delete(1,3);  
            System.out.println(sb);
            System.out.print("Reverse ");
            System.out.println(sb.reverse());
            System.out.print("Comparing ");
            StringBuffer sb2 = new StringBuffer("Java");
            System.out.println(sb == sb2);
            System.out.println(sb.equals(sb2));
            
    }
}
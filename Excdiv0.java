public class Excdiv0 {
  public static void main(String args[]) {
 
    int Quot, Div;
 
    try {
 
      Quot = 0;
      Div = 25 / Quot;
 
      System.out.println("Do you really think this will print out? No! It won't!");
 
    }
 
    catch (ArithmeticException e) {
 
      System.out.println("Division by zero not Possible!");
 
    }
 
    System.out.println("This will print out after Exception Handling");
  }
 
}
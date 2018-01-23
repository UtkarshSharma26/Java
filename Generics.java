package Generics;

public class Generics {
static <T, V extends T> boolean isIn(T x, V[] y) {
for(int i=0; i < y.length; i++)
if(x.equals(y[i])) return true;
return false;
}
public static void main(String args[]) {
// Use isIn() on Integers.
Integer numbers[] = { 1, 2, 3, 4, 5 };
if(isIn(2, numbers))
System.out.println("2 is in numbers");
if(!isIn(7, numbers))
System.out.println("7 is not in numbers");
System.out.println();
// Use isIn() on Strings
String strings[] = { "one", "two", "three",
"four", "five" };
if(isIn("two", strings))
System.out.println("two is in strings");
if(!isIn("seven", strings))
System.out.println("seven is not in strings");

}
}
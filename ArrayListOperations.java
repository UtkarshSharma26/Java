import java.util.*;
public class ArrayListOperations
{
  public static void main(String args[])
  {
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    al1.add(10);
    al1.add(50);
    al1.add(30);
    al1.add(20);
    al1.add(40);
 
    System.out.println("Max of al1: " + Collections.max(al1));
    System.out.println("Min of al1: " + Collections.min(al1));
    System.out.println("Index of 30: " + Collections.binarySearch(al1, 30));
 
    System.out.println("\nOriginal elements: " + al1);
    Collections.swap(al1, 1, 3);
    System.out.println("Elements after swap 1 and 3: " + al1);
 
    Collections.reverse(al1);
    System.out.println("Reversed elements: " + al1);
  
    Collections.shuffle(al1);
    System.out.println("\nFirst time shuffled elements: " + al1);
    Collections.shuffle(al1);
    System.out.println("Second time shuffled elements: " + al1);
 
    ArrayList al2 = new ArrayList();
    al2.add(1000);
    al2.add("hello");
    al2.add('A');
    System.out.println("\nal2 elements before filling with 100: " + al2);
    Collections.fill(al2, 100);
    System.out.println("al2 elements filled with 100: " + al2);
 
    TreeSet ts = new TreeSet(al1);
    System.out.println("\nSorted elements: " + ts);
 
        // ARRAY OF ARRAYLISTS
    ArrayList myList[] = { al1, al2 };
    System.out.println("\nmyList[0] elements: " + myList[0]);
    System.out.println("myList[1] elements: " + myList[1]);
  }
}
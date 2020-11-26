/**
 * C5Q5: Write a java program which read number from user and check is this
number is palindrome number or not.
 */
import java.util.*;  

public class C5Q5 {

    public static void main(String[] args) {
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered number is a palindrome.");  
      else  
         System.out.println("Entered number isn't a palindrome.");
    }
}
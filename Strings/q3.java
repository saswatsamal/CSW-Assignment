import java.util.Scanner;

/**
 * q3: Write a program to enter a string and count how many vowels present in it.
 */
public class q3 {
    public static void main(String[] args) {
        int v = 0;
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");
        String str = sc.nextLine();;
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                v++;
            } 
        }
        System.out.println("Number of Vowels:" +v);
    }
}

import java.util.Scanner;

public class C5Q7 {
    public static void main(String[] args) {
        int r, sum = 0,sum1=0, temp, temp1 ,temp2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you like: ");
        int n = sc .nextInt();
        temp = n;
        // Reversing the number 
        while (n > 0) {
            r = n % 10; 
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp != sum){
            System.out.println("The reverse is = "+sum);
            temp1 = sum+temp;
                temp2 = temp1;
                while (temp1 > 0) {
                    r = temp1 % 10; 
                    sum1 = (sum1 * 10) + r;
                    temp1= temp1 / 10;
                }
                if (temp2 == sum1){
                    System.out.println("Its sum = "+sum1+" which is a Pallindromic number.");

                }
                else 
                System.out.println("Its sum = "+sum1+" which is not a Pallindromic number.");
        }
            
        else{
            System.out.println("The number you entered cannot be reversed.");
            }
    }
}

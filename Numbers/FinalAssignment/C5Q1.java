import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class C5Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("##.00");
        System.out.print("Enter Borrowed Amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter monthly Intrest rate: ");
        double i = sc.nextDouble() / 12 * 0.01;
        System.out.print("Enter total no. of payments you want to make: ");
        int n = sc.nextInt();

        double payment = ((i * p) / (1 - Math.pow(1 + i, -n)));

        System.out.println("Principal\t\t\t$" + p + "\t\t\tPayment\t\t\t$" + d.format(payment));
        System.out.println("Annual Intrest\t\t\t" + (i * 12 * 100) + "%\t\t\tTerm\t\t\t" + n + " month(s)");

        System.out.println("Payment:\nBalance\t\t\tIntrest\t\t\tPrincipal\t\tPrincipal");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");

        for (int j = 1; j <= n; j++) {
            double x = payment - (p * i);
            System.out.println(j + "\t\t\t" + d.format(p * i) + "\t\t\t" + d.format(x) + "\t\t\t" + d.format(p -= x));
        }
        System.out.println("Final Payment = " + d.format(payment));

        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
        sc.close();
    }
}
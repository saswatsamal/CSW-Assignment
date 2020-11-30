// prints a table of Fahrenheit temperatures and the corresponding Celsius
// temperatures, rounded up-to two digits after decimal point
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class C5Q6 {
    public static void main(String[] args) {
		 System.out.println("Celsius\t\tFarenheit");

		for (double c=0;c<=100;c++){
        	NumberFormat nf=new DecimalFormat("0.00");
    		double d=(c*9.0/5.0)+32 ;
            System.out.println(c+"\t\t"+nf.format(d)+"\t");
  }
 }
}

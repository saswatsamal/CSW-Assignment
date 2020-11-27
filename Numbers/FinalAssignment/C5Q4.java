import java.text.DecimalFormat;

public class C5Q4 {
    public static void main(String[] args) {
        float numArgs = args.length;

        // this program requires at least two arguments on the command line
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments. Please Enter two arguements");
        } 
        else {
            double sum = 0.0;

            for (int i = 0; i < numArgs; i++) {
                sum += Double.valueOf(args[i]).doubleValue();
            }

            // format the sum
            DecimalFormat f = new DecimalFormat("###,###.##");
            String output = f.format(sum);

            // print the sum
            System.out.println("The sum of the numbers entered is = "+output);
        }
    }
}

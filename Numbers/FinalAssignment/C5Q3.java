public class C5Q3 {
    public static void main(String[] args) {
        int numArgs = args.length;

		//this program requires at least two arguments on the command line
	        if (numArgs < 2) {
	            System.out.println("This program requires two command-line arguments.");
	        } else {
		    int sum = 0;

		    for (int i = 0; i < numArgs; i++) {
	                sum += Integer.valueOf(args[i]).intValue();
		    }


                System.out.println("The sum of the numbers entered is = "+sum);
        }
    }
}

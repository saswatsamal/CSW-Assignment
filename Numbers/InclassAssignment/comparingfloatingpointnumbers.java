public class comparingfloatingpointnumbers {
//saswatsamal
    public static void main(String[] args) {
        // WAP to compare two double numbers for equality 
        // within a given tolerance or as epsilon.

        final double THRESHOLD = .0001;


        double d1 = 1.999998;
        double d2 = 1.999999;

        if (Math.abs(d1 - d2) < THRESHOLD)
            System.out.println("f1 and f2 are equal using threshold\n");
        else
            System.out.println("f1 and f2 are not equal using threshold\n");
    }
}

public class floatingpoint {
    public static void main(String[] args) {
        // WAP for floating-point computation to compare 
        // the result with POSITIVE_INFINITY, NEGATIVE_INFINITY,
        // and NaN.

        double d = 123;
        double f = -123;
        double e = 0;

        if (d/e == Double.POSITIVE_INFINITY)
            System.out.println("POSITIVE_INFINITY");

        if (f/e == Double.NEGATIVE_INFINITY)
            System.out.println("NEGATIVE_INFINITY");

        double s = Math.sqrt(-1);

        if (s == Double.NaN);
            System.out.println("NaN");

    }
}

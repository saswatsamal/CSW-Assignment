public class floatingpoint {
    public static void main(String[] args) {
        // You want to know if a floating-point computation generated a sensible result.

        double d = 123;
        double e = 0;

        if (d/e == Double.POSITIVE_INFINITY)
            System.out.println("POSITIVE_INFINITY");

        double s = Math.sqrt(-1);

        if (s == Double.NaN);
            System.out.println("Comparison with NaN incorrectly returns true");

        if (Double.isNaN(s))
            System.out.println("Double.isNaN() correctly returns true");
    }
}

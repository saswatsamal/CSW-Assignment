public class roundingfloatingpoint {

        // WAP to round numbers greater than 0.54 instead of the normal 0.5, you could write your own version of round().
        
        public static final double TH = 0.54;

         public static int round(double d) {

            return (int)Math.floor(d + 1.0 - TH);

         }
         public static void main(String[] args) {   
            double d=0.54;
           
            System.out.println("Ownway: " + d + "-> " + round(d));
            System.out.println("Math.round:" + d + "-> " + Math.round(d));

    }
}

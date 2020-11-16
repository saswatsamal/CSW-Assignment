import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q5 {
    public static void main(String[] args) {
        String str = ("There is 60 students in cse-d section, 40 in cse-b, and 55 in");
        Pattern patt = Pattern.compile("\\d+");
        Matcher m = patt.matcher(str);
        int max = 0;
        while (m.find()) {
          int n = Integer.parseInt(m.group());
          if (n > max) {
            max = n;
          }
        }
        System.out.println("The maximum numeric value is: " + max);
    }
}

/**
 * q1
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q1 {

    public static void main(String[] args) {
        // Write a program in Java to remove whitespaces from a string.
        String patt = " ";

        String str = "Hello World !";
    
        Pattern r = Pattern.compile(patt);
        Matcher m = r.matcher(str);
        StringBuffer sb = new StringBuffer();
        
        System.out.print("Using Append methods: ");
        while (m.find()) {
          m.appendReplacement(sb, "");
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
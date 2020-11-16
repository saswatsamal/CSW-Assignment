import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class q7 {
    public static void main(String[] args) {
        String s1 = "This is CSE Students";

        Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
        Matcher m = p.matcher(s1); 
  
        while (m.find()) 
            System.out.print(m.group()); 
    }
}

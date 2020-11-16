import java.util.regex.*;
import java.io.*;

public class q2 {
    public static void main(String[] args) throws IOException{

    Pattern patt = Pattern.compile("(0|91)?[7-9][0-9]{9}");

    BufferedReader br = new BufferedReader(new FileReader("q2.txt"));
    String line = br.readLine();

    while (line != null) {
        Matcher m = patt.matcher(line);

    while (m.find()) 
        {
    System.out.println(m.group());
        }

  line = br.readLine();

    }
}}

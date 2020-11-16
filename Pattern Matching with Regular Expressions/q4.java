import java.util.regex.*; 
import java.io.*; 

public class q4 {
    public static void main(String[] args)throws IOException {
        Pattern patt = Pattern.compile("^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))"+ "(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" + "([).!';/?:,][[:blank:]])?$");
        BufferedReader br = new BufferedReader 
                                (new FileReader("q4.txt")); 

        String line = br.readLine(); 
          
        while (line != null)  
        { 
            Matcher m = patt.matcher(line); 
  
            if (m.find())  
            { 
                System.out.print(line);
                System.out.println(" :URL is Valid.");
            } 
            else{
              System.out.print(line);
                System.out.println(" :URL is invalid");
            }
           line = br.readLine(); 
    }
    }
}

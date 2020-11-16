import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q3 {
    public static void main(String[] args)throws IOException{
        Pattern patt = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
        BufferedReader br = new BufferedReader 
                                (new FileReader("input.txt")); 

        String line = br.readLine(); 
          
        while (line != null)  
        { 
            Matcher m = patt.matcher(line); 
  
            if (m.find())  
            { 
                
                System.out.println("True");
            } 
            else{
                System.out.println("False");
            }
           line = br.readLine(); 
        }   
    }
}
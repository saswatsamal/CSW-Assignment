/**
 * q1: A Simple Text Formatter as in text book.
 */
import java.io.*;
import java.util.*;
public class q1 {
    static int COLWIDTH=72;
    public static void process(BufferedReader in,FileWriter out) throws Exception{
      String inputLine;
      StringBuilder sb=new StringBuilder();
      while((inputLine=in.readLine())!=null)
      {
        StringTokenizer st=new StringTokenizer(inputLine);
        while(st.hasMoreTokens())
        {
          String word=st.nextToken();
          //System.out.println(sb);
          if(sb.length()+word.length()>COLWIDTH)
          {
            out.write(sb.toString()+'\n');
            sb.setLength(0);
          }
          sb.append(word).append(' ');
        }
      }
      if(sb.length()>0)
        out.write(sb.toString());
      else
        out.write('\n');
    }
  
    public static void main(String[] args) throws Exception {
      FileReader fr=new FileReader("input.txt");
      BufferedReader in=new BufferedReader(fr);
  
      FileWriter fw=new FileWriter("output.txt");
      process(in,fw);
      fw.close();
    
    }   
}
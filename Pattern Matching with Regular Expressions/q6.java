public class q6 {
    public static void main(String[] args) {
        String str = "CSE1ECE2EEE3CIVIL"; 
        String[] arrOfStr = str.split("[0-9]"); 
  
        for (String arr : arrOfStr) 
            System.out.println(arr); 
    }
}

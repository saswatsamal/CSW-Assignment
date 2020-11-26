// prints a table of Fahrenheit temperatures and the corresponding Celsius
// temperatures, rounded up-to two digits after decimal point

public class C5Q6 {
    public static void main(String[] args) {
        C5Q6 t = new C5Q6();
    t.start();
    t.data();
    t.end();
    }
    protected void start() {
    }
    protected void data() {
    for (int i=-40; i<=120; i+=10) {
    float c = (i-32)*(5f/9);
    print(i, c);
    }
    }
    protected void print(float f, float c) {
    System.out.println(f + " " + c);
    }
    protected void end() {
    }
   
}

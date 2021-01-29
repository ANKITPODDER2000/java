import java.lang.Thread;
class A extends Thread{
    public void run(){
        System.out.println("Hello from class A.");
    }
}
public class Thread1 {
    public static void main(String[] args) throws Exception{
        A obj1 = new A();
        System.out.println("Program will hold for 5secs.");
        Thread.sleep(5000);
        System.out.println("Program starts again.");
        obj1.start();
    }   
}
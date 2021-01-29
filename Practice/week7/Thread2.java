import java.lang.Thread;
class A extends Thread{
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Hello from class A.");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Hello from class B.");
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Thread a, b;
        a = new A();
        b = new B();
        a.start();
        b.start();
    }
}

import java.lang.Thread;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread3.x += 1;
            // Thread3.x -= 1;
            System.out.println("Value of x is : "+Thread3.x);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread3.x += 1;
            Thread3.x -= 1;
            System.out.println("Value of x is : "+Thread3.x);
        }
    }
}

public class Thread3 {
    public static int x = 0;
    public static void main(String[] args) throws Exception {
        Thread a, b;
        a = new A();
        b = new B();
        a.start();
        a.join();
        b.start();
        b.join();
        System.out.println("Value of x is = " + Thread3.x);
    }
}

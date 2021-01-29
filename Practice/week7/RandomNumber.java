import java.util.Random;
import java.lang.Thread;
class square extends Thread {
    int num;
    public square(int num) {
        this.num = num;
    }
    public void run() {
        System.out.printf("Square of %2d is : %3d.\n", this.num, this.num * this.num);
    }
}
class cube extends Thread {
    int num;
    public cube(int num) {
        this.num = num;
    }
    public void run() {
        System.out.printf("cube of %2d is : %4d.\n", this.num, this.num * this.num * this.num);
    }
}
class generateRandom extends Thread {
    Random r = new Random();
    public void run(){
        while (true) {
            int num = r.nextInt() % 20;
            if ((num % 2) == 1) {
                new square(num).start();
            }
            else {
                new cube(num).start();
            }
            try{
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class RandomNumber {
    public static void main(String[] args) {
        new generateRandom().start();
    }
}

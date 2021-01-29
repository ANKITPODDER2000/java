import pack.*;
public class Main implements Interface1{
    public void display() {
        System.out.println("HI...");
        System.out.printf("Value of Pi = %.2f\n", PI);
    }
    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.display();
    }
}
import pack.*;
import java.util.Scanner;
class Life extends life {
    Life(String name, String college, int age, int salary) {
        super(name, college, age, salary);
    }
    public void history() {
        pro_history();
        per_history();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name : ");
        String name = sc.nextLine();
        System.out.print("Enter college name : ");
        String college = sc.nextLine();
        System.out.print("Enter age and yearly salary : ");
        int age = sc.nextInt();
        int salary = sc.nextInt();
        Life obj1 = new Life(name, college, age, salary);
        obj1.history();
    }
}

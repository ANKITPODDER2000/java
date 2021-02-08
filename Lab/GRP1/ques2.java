import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c , firstroot , secondroot;
        System.out.print("Enter the a , b and c : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double d = ((b * b) - (4 * a * c));
        if (d < 0) {
            System.out.print("Roots are imagimary.");
        }
        else if (d == 0) {
            firstroot = -1 * (b / (2 * a));
            System.out.println("Roots are real and same.");
            System.out.printf("Root is : %f",firstroot);
        }
        else {
            firstroot = ((-1 * b) + Math.sqrt(d)) / (2 * a);
            secondroot = ((-1 * b) - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.printf("First root is : %f\nSecond root is : %f", firstroot, secondroot);
        }
    }
}

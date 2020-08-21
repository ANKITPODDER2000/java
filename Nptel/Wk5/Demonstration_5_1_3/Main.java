import Pack.Circle;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Circle c = new Circle();
		Scanner s = new Scanner(System.in);
		System.out.printf("Area of circle is : %.2f\n",c.area());
		System.out.print("Enter radius of the circle : ");
		c.r = s.nextDouble();
		System.out.printf("Area of circle is : %.2f",c.area());
	}
}
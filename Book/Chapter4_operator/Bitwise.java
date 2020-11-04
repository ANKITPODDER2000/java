import java.util.Scanner;
public class Bitwise{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Left shift  (a << b) is : "+(a << b));
		System.out.println("Right shift (a >> b) is : "+(a >> b));
	}
}
import java.util.Scanner;

public class scanner1{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.printf("\nEnter value of a := ");
		int a = S.nextInt();
		System.out.printf("\nEnter value of b := ");
		int b = S.nextInt();
		int c = a + b;
		System.out.printf("\nSum of %d & %d is : %d",a,b,c);
	}
}
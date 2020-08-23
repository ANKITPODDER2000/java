import Package.Error;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int a , b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of a and b : ");
		a = s.nextInt(); // if user Give any value other than int , then this this line will produce an error
		b = s.nextInt(); /* if user Give any value other than int , then this this line will produce an error &
						    if b = 0 then this will produce an ArithmeticError
					     */
		System.out.printf("%d / %d = %d" , a,b,Error.Divide(a,b));
	}
}
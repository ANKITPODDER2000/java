import java.util.Scanner;

public class DoWhile1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter vale of n : ");
		int n = s.nextInt();
		System.out.print("Rev from n to 0 : ");
		do{
			System.out.print(n + " ");
		}while(--n >= 0);
	}
	//Try this code with n>=0 & n<0
}
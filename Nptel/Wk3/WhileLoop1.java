import java.util.Scanner;

public class WhileLoop1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter vale of n : ");
		int n = s.nextInt();
		if(n<0){
			System.out.print("N must be greater than or equal to 0 !");
			System.exit(1);
		}
		System.out.print("Rev from n to 0 : ");
		while(n >= 0){
			System.out.print(n + " ");
			--n;
		}
	}
}
import java.util.Scanner;

public class ForLoop1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter vale of n : ");
		int n = s.nextInt();
		if(n<0){
			System.out.print("N must be greater than or equal to 0 !");
			System.exit(1);
		}
		System.out.print("Rev from n to 0 : ");
		for(int i=n;i>=0;){
			System.out.print(i + " ");
			i--;
		}

		System.out.println("\nValue of n is : "+n);
	}
}
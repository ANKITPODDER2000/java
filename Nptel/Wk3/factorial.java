import java.util.Scanner;

public class factorial{
	public static int fact(int a){
		if(a==0 || a==1)
			return 1;
		else
			return a * fact(a-1);
	}

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n to find out factorial : ");
		n = s.nextInt(); 
		System.out.printf("Factorial of %d is : %d.",n,fact(n));
	}
}
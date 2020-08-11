import java.util.Scanner;

public class gcd_prog{
	public static int gcd(int a , int b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b,a % b);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a , b;
		System.out.print("\nEnter value of a and b : ");
		a = s.nextInt();
		b = s.nextInt();
		System.out.printf("GCD of %d & %d is : %d",a,b,gcd(a,b));
	}
}
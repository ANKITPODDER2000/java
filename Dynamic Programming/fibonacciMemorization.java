import java.util.Scanner;
class fibonacciMemorization{
	public static long fib(int n){
		long a = 0,b = 1,c;
		for(int i = 2;i<=n;i++){
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the pos : ");
		int n = s.nextInt();
		System.out.printf("fib[%d] is : %d",n,fib(n));
	}
}
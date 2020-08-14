import java.util.Scanner;
class fibonacciRec{
	int fib(int a){
		if(a==0 || a==1)
			return a;
		else
			return fib(a-1) + fib(a-2);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the pos : ");
		int n = .nextInt();
		System.out.printf("fib[%d] is : %d",n,fib(n));
	}
}
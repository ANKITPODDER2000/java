import java.util.Scanner;

public class fibonacci{
	public static int fib(int a){
		if(a<=1){
			return a;
		}
		else{
			return fib(a - 1) + fib(a - 2);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter len of fibonacci series : ");
		int l = s.nextInt();
		System.out.print("Fib series is : ");
		for(int i = 0;i<l;i++)
			System.out.printf("%d ",fib(i));
	}
}
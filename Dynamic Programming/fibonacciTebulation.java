import java.util.Scanner;
class fibonacciTebulation{
	public static long fib(long []map , int a){
		if(map[a]!=-1)
			return map[a];
		if(a<=1){
			map[a] = a;
			return map[a];
		}
		else{
			map[a] = fib(map , a-1) + fib(map , a-2);
			return map[a];
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the pos : ");
		int n = s.nextInt();
		long []map = new long [n+1];
		for(int i=0;i<map.length;i++)
			map[i] = -1;
		System.out.printf("fib[%d] is : %d",n,fib(map , n));
	}
}
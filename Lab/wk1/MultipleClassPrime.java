import java.lang.*;
import java.util.*;

class prime{
	int isPrime(int num){
		if(num==1) return 0;
		if(num==2) return 1;
		for(int i = 2 ; i <= (int) Math.round(Math.sqrt(num)) ; i++){
			if(num % i == 0)
				return 0;
		}
		return 1;
	}
}

class MultipleClassPrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start , end;
		System.out.print("Enter the start pos & end pos: ");
		start = sc.nextInt();
		end   = sc.nextInt();
		prime p = new prime();
		System.out.printf("Prime numbers in range(%d to %d) : ",start , end);
		for(int i = start ; i <= end ; i++){
			if(p.isPrime(i) == 1)
				System.out.printf(" %d",i);
		}
	}
}
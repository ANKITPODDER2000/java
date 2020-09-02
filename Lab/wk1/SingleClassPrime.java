import java.lang.*;
import java.util.*;

class SingleClassPrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start , end;
		System.out.print("Enter the start pos & end pos: ");
		start = sc.nextInt();
		end   = sc.nextInt();
		System.out.printf("Prime numbers in range(%d to %d) : ",start , end);
		for(int i = start ; i <= end ; i++){
			int flag = 1;
			for(int j = 2 ; j <= (int)Math.round(Math.sqrt(i)) ; j++){
				if(i%j==0)
				{
					flag = 0;
					break;
				}
			}
			if(i==1) flag = 0;
			if(i==2) flag = 1;
			if(flag == 1)
				System.out.printf(" %d",i);
		}
	}
}
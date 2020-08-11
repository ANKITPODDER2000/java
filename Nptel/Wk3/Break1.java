import java.util.Scanner;
import java.lang.*;

public class Break1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num,i;
		boolean flag = true;
		System.out.print("Enter the number to check prime : ");
		num = s.nextInt();
		if(num==1){
			System.out.println(num + " is not a prime no!");
			System.exit(0);
		}
		if(num==2){
			System.out.println(num + " is a prime no!");
			System.exit(0);
		}
		for(i=2;i<=Math.ceil(Math.sqrt(num));i++){
			if(num%i==0){
				flag = false;
				System.out.println(num + " is not a prime no!");
				break;
			}
		}
		if(flag){
			System.out.println(num + " is a prime no!");
		}
	}
}
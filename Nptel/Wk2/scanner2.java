import java.util.*;

public class scanner2{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.printf("\nEnter total no of elements : ");
		int n = S.nextInt() , sum = 0;
		int []arr = new int[n];
		System.out.printf("\nEnter array elements : ");
		
		for(int i = 0;i<n;i++){
			arr[i] = S.nextInt();
		}

		for(int i = 0;i<n;i++){
			sum += arr[i];
		}
		System.out.printf("Sum of all array elements is := %d",sum);
	}
}
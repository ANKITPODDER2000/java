//Bubble Sort -- maam's assignment
import java.util.Scanner ; 
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n , a[];
		System.out.print("Enter total no of array ele : ");
		n = s.nextInt();
		a = new int[n];
		System.out.print("Enter array ele : ");
		for(int i =0 ; i < n - 1 ; i++)
			a[i] = s.nextInt();
		for(int i = 0 ; i  < a.length ; i++)
		{
			for(int j = 0 ; j < a.length - i - 1; j++){
				if(a[j] > a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Sorted array is : ");
		for(int i = 0 ; i < a.length ; i++ )
			System.out.print(a[i] + " ");
	}
}
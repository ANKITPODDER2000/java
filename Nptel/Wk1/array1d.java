import java.lang.*;

class array1d{
	public static void main(String args[]){
		int []arr;
		arr = new int[10];
		System.out.print("Initial value of array is : ");
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<10;i++){
			arr[i] = i;
		}
		System.out.print("\nValue of array is : ");
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
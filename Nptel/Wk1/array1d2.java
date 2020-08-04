import java.lang.*;

class array1d2{
	public static void main(String args[]){
		int [] arr1 = new int [10];
		for(int i=0;i<10;i++)
			arr1[i] = i;
		int [] arr2 = {0,1,2,3,4,5,6,7,8,9};
		System.out.print("Value of arr1 := ");
		for(int i=0;i<10;i++)
			System.out.print(arr1[i]+" ");
		System.out.print("\nValue of arr2 := ");
		for(int i=0;i<10;i++)
			System.out.print(arr2[i]+" ");
	}
}
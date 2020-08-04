import java.lang.*;

class array2d{
	public static void main(String args[]){
		int arr[][];
		arr = new int[3][3];
		System.out.print("Initial value of array is : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j] = 3 * i + j;
			}
		}
		System.out.print("\nValue of array is : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i]+" ");
			}
			System.out.print("\n");
		}
	}
}
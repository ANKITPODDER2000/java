import java.util.Scanner;

class LIS{
	public static int LIS_length(int []arr){
		int []lis = new int [arr.length];
		for(int i=0;i<lis.length;i++){
			lis[i] = 1;
		}
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j] < arr[i])
					lis[i] = lis[j] + 1 > lis[i] ? lis[j] + 1 : lis[i];
			}
		}
		int max = lis[0];
		for(int i=1;i<lis.length;i++)
		{
			if(lis[i]>max)
				max = lis[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[],n;
		System.out.print("Enter the total no of element : ");
		n = s.nextInt();
		arr = new int[n];
		System.out.print("Enter the array : ");
		for(int i = 0;i<n;i++){
			arr[i] = s.nextInt();
		}
		System.out.print("LIS length is : "+LIS_length(arr));
	}
}
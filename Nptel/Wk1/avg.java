public class avg{
	public static void main(String args[]){
		int []arr = {10,20,30,40,50};
		System.out.print("\nArray is := ");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		float avg = 0;
		avg = ((float) sum) / arr.length;
		System.out.print("\nAvg of array is := " + avg);
	}
}
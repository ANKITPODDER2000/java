import java.util.Scanner;

class Array{
	int []arr;
	Scanner sc;
	Array(int n){
		sc = new Scanner(System.in);
		this.arr = new int[n];
	}
	void input(){
		for(int i = 0 ; i<arr.length;i++){
			this.arr[i] = sc.nextInt();
		}
	}
	void sort(){
		for(int i = 0 ; i < this.arr.length - 1 ; i++){
			for(int j = 0 ; j < this.arr.length-i-1 ; j++){
				if(this.arr[j] > this.arr[j+1]){
					int temp = this.arr[j+1];
					this.arr[j+1] = this.arr[j];
					this.arr[j] = temp;
				}
			}
		}
	}
	void output(){
		System.out.print("Sorted array : ");
		for(int i = 0 ; i< this.arr.length ; i++)
			System.out.printf("%d ",this.arr[i]);
	}
}
class sort{
	public static void main(String[] args) {
		int n;
		Array arr;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		n = sc.nextInt();
		arr = new Array(n);
		System.out.print("Enter the array elements : ");
		arr.input();
		arr.sort();
		arr.output();
	}
}
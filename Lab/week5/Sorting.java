import java.util.Scanner;

class ListObj{
	int n , arr[];
	Scanner sc = new Scanner(System.in);
	ListObj(int num){
		n = num;
		arr = new int[n];
	}
	void setElement(){
		System.out.print("Enter array elements : ");
		for(int i = 0 ; i< n ;i++){
			arr[i] = sc.nextInt();
		}
	}
	void display(){
		System.out.print("Elements of the array : ");
		for(int i = 0 ; i< n ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void sort(){
		int i , j;
		for(i = 0 ; i < n-1 ; i++){
			
			int min_ind = i;
			for(j = i+1 ; j<n;j++){
				if(arr[j]<arr[min_ind])
					min_ind = j;
			}

			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;
		}
	}
}

class Sorting{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter total no of array element : ");
		n = sc.nextInt();
		ListObj list = new ListObj(n);
		list.setElement();
		list.display();
		list.sort();
		System.out.println("\nAfter sorting :");
		list.display();
	}
}
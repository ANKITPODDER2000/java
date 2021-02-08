import java.util.Scanner;
class NumberList{
    int []arr;
    Scanner sc;
    NumberList(int n){
        sc = new Scanner(System.in);
        arr = new int[n];
    }
    void input(){
        for(int i = 0 ; i<arr.length ; i++)
            arr[i] = sc.nextInt();
    }
    void sort(){
        int key , j;
        for(int i = 1 ; i < arr.length ; i++){
            j = i - 1;
            key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    void display(){
        System.out.print("Sorted array is : ");
        for(int i = 0 ; i< arr.length ; i++)
            System.out.print(arr[i] + " ");
    }
}
class Insertion_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the length of array : ");
        n = sc.nextInt();
        NumberList arr = new NumberList(n);
        System.out.print("Enter array elements : ");
        arr.input();
        arr.sort();
        arr.display();
    }
}
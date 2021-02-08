import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,arr[];
        System.out.print("Enter the length of the array : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter the array ellements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Arrays is(before sorting) : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Arrays is(after  sorting) : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

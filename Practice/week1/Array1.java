public class Array1 {
    public static void main(String[] args) {
        int arr[] = new int[26];
        System.out.println("Length of array is : " + arr.length);
        System.out.print("Array is(initially) : ");
        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = i + (int) 'A';
        System.out.println();
        System.out.print("Array is(after modification) : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.print("Array is(after modification int to char) : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print((char)arr[i] + " ");
    }
}
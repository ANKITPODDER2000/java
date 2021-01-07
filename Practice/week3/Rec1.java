import java.io.DataInputStream;
class Rec1{
    static int Factorial(int n){
        if (n<=1) return 1;
        return n * Factorial(n - 1);
    }
    public static void main(String []args) throws Exception{
        int num;
        String temp;
        System.out.print("Enter the number to find out factorial : ");
        System.out.flush();
        DataInputStream in = new DataInputStream(System.in);
        temp = in.readLine();
        num = Integer.parseInt(temp);
        System.out.printf("Factorial of %d is = %d\n", num, Factorial(num));
    }
}
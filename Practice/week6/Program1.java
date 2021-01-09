import java.util.Scanner;
class Program1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a and b : ");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.printf("%d / %d = %d\n", a, b, a / b);
        }
        catch (Exception e) {
            System.out.println("An Error occur !");
            // System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
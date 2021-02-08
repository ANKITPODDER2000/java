import java.util.*;
class PrintPrime{
    int isPrime(int n) {
        if (n == 1)
            return 0;
        else if (n == 2) {
            return 1;
        } else {
            for (int i = 2; i <= (int) Math.round(Math.sqrt(n)); i++) {
                if (n % i == 0)
                    return 0;
            }
            return 1;
        }
    }
    void printPrimeInRange(int s , int e){
        System.out.printf("Prime numbers in the range (%d to %d) is : ", s, e);
        for (int i = s; i <= e; i++) {
            if(isPrime(i)==1)
                System.out.print(i+" ");
        }
    }
}
class ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting and ending range : ");
        int s, e;
        s = sc.nextInt();
        e = sc.nextInt();
        if (s > e) {
            System.out.println("It is not possible to print in this range.");
        }
        else {
            PrintPrime obj = new PrintPrime();
            obj.printPrimeInRange(s, e);
        }
    }
}
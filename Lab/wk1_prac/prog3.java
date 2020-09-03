import java.util.Scanner;
import java.lang.Math;

class prog3{
    public static void main(String[] args) {
        double a , b , c;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of a , b & c : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double d = Math.pow(b , 2) - 4 * a * c;
        double sq_d = Math.sqrt(Math.abs(d));
        if(d>0)
        {
            System.out.print("Roots are : "+(-b + sq_d)/(2*a)+" "+(-b - sq_d)/(2*a));
        }
        else if(d==0){
            double pr = -(b  / (2*a));
            System.out.printf("Root is : %.4f",pr);
        }
        else{
            System.out.println("Complex Roots are : "+(-b / (2*a))+"+i*"+sq_d+"  &  "+(-b / (2*a))+"-i*"+sq_d);
            System.out.print("Real : ", (-b / (2*a)));
            System.out.println("Imaginary : i*"+sq_d);
        }
    }
}
import java.util.Scanner;
class Rectangle {
    double x, y;
    public double perimeter() {
        return 2 * (x + y);
    }

    public double area() {
        return x * y;
    }
    public void initialise(double a , double b){
        x = a;y=b;
    }
}
public class Geo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        double x, y;
        
        System.out.print("Enter the height & width of rectangle1 : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        r1.initialise(x, y);

        System.out.print("Enter the height & width of rectangle2 : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        r2.initialise(x, y);

        //This is for rectangle1
        System.out.println("Area of the rectangle1 is : " + r1.area());
        System.out.println("Perimeter of the rectangle1 is : " + r1.perimeter());
        // This is for rectangle2
        System.out.println("Area of the rectangle2 is : " + r2.area());
        System.out.println("Perimeter of the rectangle2 is : " + r2.perimeter());
    }
}
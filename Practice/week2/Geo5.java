import java.util.Scanner;
class Rectangle {
    double x, y;
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double perimeter() {
        return 2 * (this.x + this.y);
    }

    public double area() {
        return this.x * this.y;
    }
}

public class Geo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1, r2;
        double x, y;

        System.out.print("Enter the height & width of rectangle1 : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        r1 = new Rectangle(x, y);

        System.out.print("Enter the height & width of rectangle2 : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        r2 = new Rectangle(x, y);

        // This is for rectangle1
        System.out.println("Area of the rectangle1 is : " + r1.area());
        System.out.println("Perimeter of the rectangle1 is : " + r1.perimeter());
        // This is for rectangle2
        System.out.println("Area of the rectangle2 is : " + r2.area());
        System.out.println("Perimeter of the rectangle2 is : " + r2.perimeter());
    }
}
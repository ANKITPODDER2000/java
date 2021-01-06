class Rectangle {
    double x, y;
    public double perimeter() {
        return 2 * (x + y);
    }
    public double area() {
        return x * y;
    }
}
public class Geo2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.x = Double.parseDouble(args[0]);
        r.y = Double.parseDouble(args[1]);
        System.out.println("Area of the rectangle is : " + r.area());
        System.out.println("Perimeter of the rectangle is : " + r.perimeter());
    }
}
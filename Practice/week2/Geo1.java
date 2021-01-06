class Rectangle {
    double x, y;
    public double perimeter() {
        return 2 * (x + y);
    }
    public double area() {
        return x * y;
    }
}
public class Geo1{
    public static void main(String []args){
        Rectangle r = new Rectangle();
        r.x = 3;
        r.y = 2;
        System.out.println("Area of the rectangle is : " + r.area());
        System.out.println("Perimeter of the rectangle is : " + r.perimeter());
    }
}
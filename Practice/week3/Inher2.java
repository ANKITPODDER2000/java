class Point1D {
    double x;
    // Point1D(){
    //     this(0);
    // }
    Point1D(double x){
        this.x = x;
    }
    void display(){
        System.out.printf("X = %.2f   ",x);
    }
}
class Point2D extends Point1D{
    double y;
    Point2D(){
        this(0, 0);
    }
    Point2D(double x , double y){
        super(x);
        this.y = y;
    }
    void display() {
        super.display();
        System.out.printf("Y = %.2f   ",y);
    }
}
class Point3D extends Point2D {
    double z;
    Point3D() {
        this(0, 0 , 0);
    }
    Point3D(double x, double y , double z) {
        super(x , y);
        this.z = z;
    }
    void display() {
        super.display();
        System.out.printf("z = %.2f", z);
    }
}
public class Inher2 {
    public static void main(String[] args) {
        Point1D p1 = new Point1D(5);
        p1.display();
        System.out.println("\n--------------------------------");
        Point2D p2 = new Point2D(5, 8);
        p2.display();
        System.out.println("\n--------------------------------");
        Point3D p3 = new Point3D(5, 8, 11);
        p3.display();
    }
}

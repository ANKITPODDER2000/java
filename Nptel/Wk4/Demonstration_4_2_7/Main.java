import MyPackage1.*;
public class Main{
	public static void main(String[] args) {
		Point1D a = new Point1D(5.0);
		Point2D b = new Point2D(5.0,7.5);
		Point3D c = new Point3D();
		a.Details("1D Point is : ");
		b.Details("\n2D Point is : ");
		c.Details("\n3D Point is : ");

		a.update(2.0);
		a.Details("\n1D Point is : ");
		b.update(3.0,50.0);
		b.Details("\n2D Point is : ");
		c.update(1.0,2.0,3.0);
		c.Details("\n3D Point is : ");
	}
}
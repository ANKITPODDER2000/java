import MyPackage1.*;
public class Main{
	public static void main(String[] args) {
		Point1D []arr = new Point1D[3];
		arr[0] = new Point1D(5.0);
		arr[1] = new Point2D(5.0,7.5);
		arr[2] = new Point3D();
		arr[0].Details("1D Point is : ");
		arr[1].Details("\n2D Point is : ");
		arr[2].Details("\n3D Point is : ");

		arr[0].x = 10.0;
		arr[0].Details("1D Point is : ");
	}
}
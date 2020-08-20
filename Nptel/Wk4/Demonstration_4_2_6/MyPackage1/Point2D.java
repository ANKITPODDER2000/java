package MyPackage1;

public class Point2D extends Point1D{
	public double y;
	public Point2D(){
		this(0.0,0.0);
	}
	public Point2D(double x , double y){
		super(x);
		this.y = y;
	}
	public void Details(String msg){
		super.Details(msg);
		System.out.println("Y := "+this.y);
	}
}


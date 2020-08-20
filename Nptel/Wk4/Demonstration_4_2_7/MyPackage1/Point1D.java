package MyPackage1;

public class Point1D{
	private double x;
	public Point1D(){
		this(0.0);
	}
	public Point1D(double x){
		this.x = x;
	}
	public void Details(String msg){
		System.out.println(msg);
		System.out.println("X := "+this.x);
	}

	public void update(double x){
		this.x = x;
	}
}
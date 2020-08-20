package MyPackage1;

public class Point3D extends Point2D{
	private double z;
	public Point3D(){
		this(0.0,0.0,0.0);
	}
	public Point3D(double x , double y,double z){
		super(x,y);
		this.z = z;
	}
	public void Details(String msg){
		super.Details(msg);
		System.out.println("Z := "+this.z);
	}

	public void update(double x , double y , double z){
		super.update(x,y);
		this.z = z;
	}
}
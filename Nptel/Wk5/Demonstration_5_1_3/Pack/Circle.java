package Pack;

public class Circle implements A{
	public double r;
	public Circle(){
		this(0.0);
	}
	public Circle(double r){
		this.r = r;
	}
	public double area(){
		return (PI * this.r * this.r);
	}
}
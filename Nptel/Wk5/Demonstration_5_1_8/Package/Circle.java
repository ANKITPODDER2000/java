package Package;
public class Circle implements Interface{
	double r;
	public Circle(double r){
		this.r = r;
	}
	public double area(){
		return (PI * this.r * this.r);
	}
	public double circumstances(){
		return (2 * PI * this.r);
	}
}
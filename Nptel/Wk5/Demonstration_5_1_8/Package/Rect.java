package Package;
public class Rect implements Interface{
	double h , w;
	public Rect(double h, double w){
		this.h = h;
		this.w = w;
	}
	public double area(){
		return (this.h * this.w);
	}
	public double circumstances(){
		return (2 * (this.h + this.w));
	}
}
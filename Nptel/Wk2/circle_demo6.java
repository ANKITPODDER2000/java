class Circle{
	double x,y,r;

	Circle(double x , double y , double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public double circumstances(){
		return 3.14 * r * r;
	}

	public double area(){
		return 2 * 3.14 * r;
	}

	public void printDetails(String msg){
		System.out.printf("\n\nDetails of %s :\n============================",msg);
		System.out.printf("\nCurcumstances := %.2f",circumstances());
		System.out.printf("\nArea := %.2f",area());
	}
}

public class circle_demo6{
	public static void main(String []args){
		Circle c1 = new Circle(0.0,0.0,	5.0);
		Circle c2 = new Circle(0.0,0.0,	3.0);
		
		c1.printDetails("Circle1");
		c2.printDetails("Circle2");

	}
}
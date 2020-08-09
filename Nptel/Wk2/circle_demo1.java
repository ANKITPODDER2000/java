class Circle{
	double x,y,r;

	public double circumstances(){
		return 3.14 * r * r;
	}

	public double area(){
		return 2 * 3.14 * r;
	}
}

public class circle_demo1{
	public static void main(String []args){
		Circle c = new Circle();
		c.x = 0.0;
		c.y = 0.0;
		c.r = 5.0;

		System.out.printf("\nCurcumstances := %.2f",c.circumstances());
		System.out.printf("\nArea := %.2f",c.area());
	}
}
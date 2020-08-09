class Circle{
	double x,y,r;

	public double circumstances(){
		return 3.14 * r * r;
	}

	public double area(){
		return 2 * 3.14 * r;
	}
}

public class circle_demo2{
	public static void main(String []args){
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.x = 0.0;
		c1.y = 0.0;
		c1.r = 5.0;

		c2.x = 0.0;
		c2.y = 0.0;
		c2.r = 3.0;

		System.out.printf("Details of Circle1 :\n============================");
		System.out.printf("\nCurcumstances := %.2f",c1.circumstances());
		System.out.printf("\nArea := %.2f",c1.area());

		System.out.printf("\n\nDetails of Circle2 :\n============================");
		System.out.printf("\nCurcumstances := %.2f",c2.circumstances());
		System.out.printf("\nArea := %.2f",c2.area());
	}
}
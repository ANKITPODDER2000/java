class Circle{
	public static int circleCount  = 0; 
	public double x,y,r;
	Circle(){
		this(0.0,0.0,0.1);
	}
	Circle(double r){
		this(0.0,0.0,r);
	}
	Circle(Circle c){
		this(c.x,c.y,c.r);
	}
	Circle(double x , double y , double r){
		this.x = x;
		this.y = y;
		this.r = r;
		circleCount++;
	}
	public int COUNT(){
		return circleCount;
	}
}

public class Static1{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("No. of Circle : " + c1.COUNT());
		Circle c2 = new Circle(5.0);
		System.out.println("No. of Circle : " + c2.COUNT());
		Circle c3 = new Circle(c2);
		System.out.println("No. of Circle : " + c3.COUNT());

		System.out.printf("Value of c1.circleCount is : %d\nValue of c2.circleCount is : %d\nValue of c3.circleCount is : %d",
			c1.circleCount,c2.circleCount,c3.circleCount);
		System.out.printf("\nValue of Circle.circleCount is : %d",Circle.circleCount);

	}
}
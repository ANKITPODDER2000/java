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
	public static int COUNT(){
		return circleCount;
	}

	public Circle bigger(Circle c){
		if(this.r > c.r)
			return this;
		return c;
	}
	public static Circle bigger(Circle a , Circle b){
		if(a.r > b.r)
			return a;
		return b;
	}
}

public class Static2{
	public static void main(String[] args) {
		Circle c1 = new Circle(3.0);
		System.out.println("1. No. of Circle : " + Circle.COUNT());
		Circle c2 = new Circle(5.0);
		System.out.println("2. No. of Circle : " + Circle.COUNT());
		Circle c3 = c1.bigger(c2);
		System.out.println("3. No. of Circle : " + Circle.COUNT());
		Circle c4 = Circle.bigger(c1 , c2);
		System.out.println("4. No. of Circle : " + Circle.COUNT());

		System.out.printf("\nValue of c1.circleCount is : %d\nValue of c2.circleCount is : %d\nValue of c3.circleCount is : %d\nValue of c4.circleCount is : %d",
			c1.circleCount,c2.circleCount,c3.circleCount,c4.circleCount);
		System.out.printf("\n\nValue of Circle.circleCount is : %d",Circle.circleCount);

		System.out.printf("\n\nc1.r = %f\nc2.r = %f\nc3.r = %f\nc4.r = %f",c1.r,c2.r,c3.r,c4.r);

	}
}
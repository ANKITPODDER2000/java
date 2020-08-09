class Rect{
	double x , y;
	public void setParam(double a ,double b){
		x = a;
		y = b;
	}

	public double area(){
		return x * y;
	}

	public double circumstances(){
		return 2 * ( x + y );
	}

	public void printDetails(String msg){
		System.out.printf("\n\nDetails of %s :\n============================",msg);
		System.out.printf("\nCurcumstances := %.2f",circumstances());
		System.out.printf("\nArea := %.2f",area());
	}
}

class Circle{
	double x,y,r;

	public double circumstances(){
		return 3.14 * r * r;
	}

	public double area(){
		return 2 * 3.14 * r;
	}

	public void setParam(double c){
		//System.out.printf("\nControl block1 ->\n");
		setParam(0.0,0.0,c);
	}

	public void setParam(double a , double b , double c){
		//System.out.printf("\nControl block2 -> End\n");
		x = a;
		y = b;
		r = c;
	}

	public void printDetails(String msg){
		System.out.printf("\n\nDetails of %s :\n============================",msg);
		System.out.printf("\nCurcumstances := %.2f",circumstances());
		System.out.printf("\nArea := %.2f",area());
	}
}

public class multiclass{
	public static void main(String []args){
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Rect   r1 = new Rect();
		
		c1.setParam(5.0);
		c2.setParam(3.0);
		r1.setParam(3.0,4.0);
		
		c1.printDetails("Circle1");
		c2.printDetails("Circle2");
		r1.printDetails("Rect1");

	}
}
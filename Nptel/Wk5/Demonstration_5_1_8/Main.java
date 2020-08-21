import Package.*;

public class Main{
	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		Rect   r = new Rect(5.0,3.0);
		PrintDetails.print("Circle details",c.area(),c.circumstances());
		PrintDetails.print("Rect details",r.area(),r.circumstances());
	}
}
import java.util.Scanner;

abstract class Quadrilateral{
	int x[] , y[];
	Quadrilateral(int x[] , int y[]){
		this.x = x;
		this.y = y;
	}
	abstract void area();	
}

class Trapizoid extends Quadrilateral{
	Trapizoid(int x[] , int y[]){
		super(x , y);
	}
	void area(){
		int a = super.x[1] - super.x[0];
		int b = super.x[3] - super.x[2];
		int h = super.y[0] - super.y[2];

		double area = (((double)(a + b)) / 2) * h;
		System.out.printf("Area of Trapizoid is : %.3f\n",area);
	}
}

class Parallelogram extends Quadrilateral{
	Parallelogram(int x[] , int y[]){
		super(x , y);
	}
	void area(){
		int b = super.x[1] - super.x[0];
		int h = super.y[0] - super.y[2];

		int area = b * h;
		System.out.printf("Area of Parallelogram is : %d\n",area);
	}
}

class Rectangle extends Quadrilateral{
	Rectangle(int x[] , int y[]){
		super(x , y);
	}
	void area(){
		int w = super.x[1] - super.x[0];
		int h = super.y[0] - super.y[2];

		int area = w * h;
		System.out.printf("Area of Rectangle is : %d\n",area);
	}
}

class Square extends Quadrilateral{
	Square(int x[] , int y[]){
		super(x , y);
	}
	void area(){
		int a = super.x[1] - super.x[0];

		int area = a * a;
		System.out.printf("Area of Square is : %d\n",area);
	}
}

class Geometry{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[4];
		int y[] = new int[4];


		System.out.print("Enter the x-positions of Trapizoid: ");
		for(int i = 0 ; i< 4 ;i++)
			x[i] = sc.nextInt();

		System.out.print("Enter the y-positions of Trapizoid: ");
		for(int i = 0 ; i< 4 ;i++)
			y[i] = sc.nextInt();

		Trapizoid t = new Trapizoid(x , y);
		t.area();

		

		System.out.print("Enter the x-positions of Parallelogram : ");
		for(int i = 0 ; i< 4 ;i++)
			x[i] = sc.nextInt();

		System.out.print("Enter the y-positions of Parallelogram : ");
		for(int i = 0 ; i< 4 ;i++)
			y[i] = sc.nextInt();

		Parallelogram p = new Parallelogram(x , y);
		p.area();


		System.out.print("Enter the x-positions of Rectangle : ");
		for(int i = 0 ; i< 4 ;i++)
			x[i] = sc.nextInt();

		System.out.print("Enter the y-positions of Rectangle : ");
		for(int i = 0 ; i< 4 ;i++)
			y[i] = sc.nextInt();

		Rectangle r = new Rectangle(x , y);
		r.area();

		System.out.print("Enter the x-positions of Square : ");
		for(int i = 0 ; i< 4 ;i++)
			x[i] = sc.nextInt();

		System.out.print("Enter the y-positions of Square : ");
		for(int i = 0 ; i< 4 ;i++)
			y[i] = sc.nextInt();

		Square a = new Square(x , y);
		a.area();
	}
}
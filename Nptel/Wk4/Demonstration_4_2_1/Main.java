import java.lang.Math;
import java.util.Scanner;

class Calculator{
	double x , y;
	Calculator(double x){
		this.x = x;
	}
	void Calculate(){
		this.y = Math.sqrt(this.x);
	}
	void display(){
		System.out.printf("Sqrt(%f) is := %f\n",this.x,this.y);
	}
}

class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of x := ");
		double x = s.nextDouble();
		Calculator cal = new Calculator(x);
		cal.display();
		cal.Calculate();
		cal.display();
	}
}
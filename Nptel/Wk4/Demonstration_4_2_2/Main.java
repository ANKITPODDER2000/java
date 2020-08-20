class Calculator{
	double x , y;
	Calculator(double x){
		this.x = x;
	}
	void Calculate(){
		this.y = java.lang.Math.sqrt(this.x);
	}
	void display(){
		System.out.printf("Sqrt(%.2f) is := %.2f\n",this.x,this.y);
	}
}

class Main{
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("Enter value of x := ");
		double x = s.nextDouble();
		Calculator cal = new Calculator(x);
		cal.display();
		cal.Calculate();
		cal.display();
	}
}
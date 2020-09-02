import java.util.*;
import java.lang.*;
class solve{
	double a,b,c;
	solve(double a , double b , double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	double findPosEq(){
		double s = -b + Math.sqrt(Math.pow(b , 2) - 4 * a * c);
		return s / (2 * a);
	}
	double findNegEq(){
		double s = -b - Math.sqrt(Math.pow(b , 2) - 4 * a * c);
		return s / (2 * a);
	}
}
class quardetic{
	public static void main(String[] args) {
		double a , b , c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a , b & c : ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		solve s = new solve(a,b,c);
		System.out.printf("Equation : %.3f & %.3f",s.findPosEq(),s.findNegEq());
	}
}
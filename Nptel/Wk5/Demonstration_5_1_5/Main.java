import Package.*;

public class Main{
	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.method1();
		s.method2();
		//s.a = 15; // cannot assign a value to final variable a
		System.out.println("Value of a is := " + s.a);
		System.out.println("Value of b is := " + s.b);
	}
}
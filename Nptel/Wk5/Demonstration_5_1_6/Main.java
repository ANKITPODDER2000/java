import Package.*;

public class Main{
	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.method1();
		s.method2();
		s.method3();
		System.out.println("a := " + s.a);
		System.out.println("b := " + s.b);
		System.out.println("c := " + s.c);
		System.out.println("\n========================");
		s.details();
	}
}
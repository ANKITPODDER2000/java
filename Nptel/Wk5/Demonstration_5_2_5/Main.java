//Runtime error for some input
public class Main{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		System.out.println("Value of c is : " + c);
	}
}
/*
	try this for different command line input
	>>javac Main.java

	>>java Main 50 10 
		-->Value of c is : 5
	>>java Main 10 20
		-->Value of c is : 0
	>>java Main 10 20 30 40 50
		-->Value of c is : 0
	>>java Main 10 
		-->Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	>>java Main 10 20.5
		-->Exception in thread "main" java.lang.NumberFormatException: For input string: "20.5"
	>>java Main 10 0
		-->Exception in thread "main" java.lang.ArithmeticException: / by zero
	So is it a robust program?
*/
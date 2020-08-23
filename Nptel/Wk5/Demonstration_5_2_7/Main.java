//Runtime error for some inputs
public class Main{
	public static int anyOperation(int a , int b){
		int result = 0;
		try{
			result = a / b;
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		return result;
	}
	public static void main(String[] args) {
		int a = 0 , b = 0 , result;
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		}
		catch(Exception e){
			b = 1;
		}
		System.out.println("Value a : "+a+" & b : "+b);
		result = Main.anyOperation(a , b);
		System.out.println("result is : "+result);
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
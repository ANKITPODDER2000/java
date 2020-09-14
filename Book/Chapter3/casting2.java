public class casting2{
	public static void main(String[] args) {
		double a = 10;
		int b = (int) a; // may cause a data lossing
		byte c = (byte) a; // may cause a data lossing
		System.out.println("Value of a(double) is : " + a);
		System.out.println("Value of b(int) is : " + b);
		System.out.println("Value of c(byte) is : " + c);

		System.out.println("\n==============================\n");

		a = 323.56;
		b = (int) a; // may cause a data lossing
		c = (byte) a; // may cause a data lossing
		System.out.println("Value of a(double) is : " + a);
		System.out.println("Value of b(int) is : " + b);
		System.out.println("Value of c(byte) is : " + c);
	}
}
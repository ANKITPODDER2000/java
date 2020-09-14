public class casting1{
	public static void main(String[] args) {
		int a = 10;
		//byte b = a; //Cause a Error  -> possible lossy conversion from int to byte
		byte b = (byte)a;
		System.out.println("Value of a(int) is : " + a);
		System.out.println("Value of b(byte) is : " + b);
		a = Integer.parseInt(args[0]);
		b = (byte) a; // may cause a data lossing
		System.out.println("Value of a(int) is : " + a);
		System.out.println("Value of b(byte) is : " + b);
	}
}
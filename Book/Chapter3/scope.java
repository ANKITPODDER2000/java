public class scope{
	public static void main(String[] args) {
		int a = 100;
		System.out.println("1. Value of a is : " + a);
		{
			int y = a*2;
			System.out.println("2. Value of a is : " + a);
			System.out.println("3. Value of y is : " + y);
		}
		System.out.println("4. Value of a is : " + a);
		//System.out.println("5. Value of y is : " + y); //Y isn't declared in this scope
	}
}
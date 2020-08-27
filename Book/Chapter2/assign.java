public class assign{
	public static void main(String[] args) {
		int num1 ;
		int num2 ;
		num1 = 100;
		num2 = 50;
		System.out.println("Value of num1 : " + num1);
		System.out.println("Value of num2 : " + num2);
		System.out.println("=================================");
		num1 += num2;
		num2 += num1;
		System.out.println("Value of num1 : " + num1);
		System.out.println("Value of num2 : " + num2);
		System.out.println("=================================");
		System.out.println("Value of num1 : " + ++num1);
		System.out.println("Value of num2 : " + ++num2);
		System.out.println("=================================");
		System.out.println("Value of num1 : " + num1--);
		System.out.println("Value of num2 : " + num2--);
		System.out.println("=================================");
		System.out.println("Value of num1 : " + num1);
		System.out.println("Value of num2 : " + num2);
		System.out.println("=================================");
		System.out.println("Value of num1 : " + --num1);
		System.out.println("Value of num2 : " + --num2);
	}
}
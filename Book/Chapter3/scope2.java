public class scope2{
	public static void main(String[] args) {
		for(int i = 0;i<=5;i++) {System.out.println("Value of i := "+i);}
		//System.out.println("Value of i := "+i); //i isn't declared in this scope
		
		System.out.println("\n========================================\n");

		int i = 0;
		for(;i<=5;) {System.out.println("Value of i := "+i++);}
		System.out.println("Outside of for loop Value of i := "+i); //i isn't declared in this scope
	}
}
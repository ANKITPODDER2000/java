package Package;

public class Thread2{
	public void run(){
		System.out.println("\nPrint from Thread2\n============================");
		for(int i = 0;i <= 5;i++)
			System.out.println("Value of j : " + (2 * i));
	}
}
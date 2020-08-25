package Package;

public class Thread3 implements Runnable{
	public void run(){
		System.out.println("\nPrint from Thread3\n============================");
		for(int i = 0;i <= 5;i++)
			System.out.println("Value of k : " + ((2 * i) - 1));
	}
}
package Package;

public class Thread1 extends Thread{
	public void run(){
		System.out.println("\nPrint from Thread1\n============================");
		for(int i = 0;i <= 5;i++)
			System.out.println("Value of i : " + (-1 * i));
	}
}
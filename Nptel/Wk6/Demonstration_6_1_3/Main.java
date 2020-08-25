import Package.*;
public class Main{
	public static void main(String[] args) {
		Thread1 a = new Thread1();
		Thread t1 = new Thread(a);
		Thread2 b = new Thread2();
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(new Thread3());
		t1.start();
		t2.start();
		t3.start();
	}
}
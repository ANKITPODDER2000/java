import Package.*;
public class Main{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.run();
		t2.start();
		t3.start();
	}
}
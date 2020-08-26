import Package.*;
public class Main{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread2 t2 = new Thread2();
		t2.setPriority(t2.getPriority() + 1);
		Thread3 t3 = new Thread3();
		t3.setPriority(Thread.MIN_PRIORITY);
		System.out.println("-----------------1-------------------");
		t1.start();
		System.out.println("-----------------2-------------------");
		t2.start();
		try{
			t1.join();
			t2.join();
		}
		catch(Exception e){}
		System.out.println("-----------------3-------------------");
		t3.start();
	}
}
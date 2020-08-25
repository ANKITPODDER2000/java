import Package.*;
public class Main{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t2.getPriority()+1);
		t3.setPriority(Thread.MIN_PRIORITY);
		System.out.println("-----------------1-------------------");
		t1.start();
		System.out.println("-----------------2-------------------");
		t2.start();
		System.out.println("-----------------3-------------------");
		t3.start();
		try{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception c){}
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}
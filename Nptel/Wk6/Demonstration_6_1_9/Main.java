class ThreadExa extends Thread{
	public void run(){
		try{
			for(int i = 0 ; i < 5 ; i++){
				System.out.println("Helloo There " + i);
			}
			suspend();
			System.out.println("Done");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
public class Main{
	public static void main(String[] args) {
		try{
			ThreadExa t1 = new ThreadExa();
			t1.start();
			System.out.println("Wait for 2 sec");
			t1.sleep(2000);
			t1.resume();
			System.out.println("Finally done !");

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
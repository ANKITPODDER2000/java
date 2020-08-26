class ThreadEx1 extends Thread{
	public void run(){
		for(int i = 0 ; i<= 10 ; i++){
			try{
				System.out.println("Hi from thread1 !");
				sleep(2000);
			}
			catch (Exception e){
				System.out.println(e.toString());
			}
		}
	}
}

class ThreadEx2 extends Thread{
	public void run(){
		for(int i = 0 ; i<= 10 ; i++){
			try{
				System.out.println("Hi from thread2 !");
				sleep(1000);
			}
			catch (Exception e){
				System.out.println(e.toString());
			}
		}
	}
}

public class Main{
	public static void main(String[] args) {
		ThreadEx1 ex1 = new ThreadEx1();
		ThreadEx2 ex2 = new ThreadEx2();
		ex1.start();
		ex2.start();
	}
}
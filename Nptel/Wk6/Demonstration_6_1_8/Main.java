class ThreadId extends Thread{
	public void run(){
		try{
			System.out.println("Current thread is is : " + Thread.currentThread().getId());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Main{
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++)
			new ThreadId().start();
	}
}
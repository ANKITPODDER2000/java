public class Main extends Thread{
	static int x;
	public void run(){
		for(int i = 0; i<10000 ; i++){
			x = x + 1;
			x = x - 1;
		}
	}
	public static void main(String[] args) {
		x = 0;
		for(int i = 0; i < 10000 ; i++)
			new Main().start();
		System.out.println("Value of x : " + x);
	}
}
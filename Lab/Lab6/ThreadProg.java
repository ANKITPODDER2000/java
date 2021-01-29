import java.util.*;
class Thread1 extends Thread{
	public void run(){
		Random rd = new Random();
		for(int i=0 ; i <30 ; i++){
			try {
				int val = rd.nextInt() % 30;
				if(val % 2 == 0){
					Thread2 t = new Thread2(val);
					t.start();
				}
				else{
					Thread3 t = new Thread3(val);
					t.start();
				}
				Thread.sleep(1000);
			} catch (Exception e) {
				continue;
			}
		}
	}
}
class Thread2 extends Thread{
	int val;
	public Thread2(int val){
		this.val = val;
	}
	public void run(){
		int square = this.val * this.val;
		System.out.println("Suqare of "+this.val+" is : "+square);
	}
}
class Thread3 extends Thread{
	int val;
	public Thread3(int val){
		this.val = val;
	}
	public void run(){
		int cube = this.val * this.val * this.val;
		System.out.println("Cube of "+this.val+" is : "+cube);
	}
}
class ThreadProg{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
	}
}
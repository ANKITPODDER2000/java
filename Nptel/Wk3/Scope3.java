public class Scope3{
	public static void main(String[] args) {
		int x = 100;
		if(x==100){
			int y = 10;
			System.out.printf("Value of X : %d & Y : %d\n",x,y);
		}
		//y = 100;
		System.out.printf("Value of X : %d\n",x);
	}
}
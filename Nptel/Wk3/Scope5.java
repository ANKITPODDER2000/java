public class Scope5{
	public static void main(String[] args) {
		
		{
			int x , y;
			y = 10;
			x = 10;
			System.out.printf("1. Value of X : %d & Y : %d\n",x,y);
		}

		{
			int x , y;
			y = 20;
			x = 20;
			System.out.printf("2. Value of X : %d & Y : %d\n",x,y);
		}
	}
}
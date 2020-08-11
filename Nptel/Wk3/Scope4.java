public class Scope4{
	public static void main(String[] args) {
		int x = 100 , y = 100;
		System.out.printf("1. Value of X : %d & Y : %d\n",x,y);
		{
			//int y ; //Scope4.java:6: error: variable y is already defined in method main(String[])  int y;	1 error
			y = 10;
			x = 10;
			System.out.printf("2. Value of X : %d & Y : %d\n",x,y);
		}
		System.out.printf("3. Value of X : %d & Y : %d\n",x,y);
	}
}
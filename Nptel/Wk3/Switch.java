import java.util.Scanner;

public class Switch{
	public static void main(String[] args) {
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any digit between 1 - 5 : 4\n");
		ch = '4';
		switch(ch){
			case '1':
				System.out.print("You entered : One");
				break;
			case '2':
				System.out.print("You entered : Two");
				break;
			case '3':
				System.out.print("You entered : Three");
				break;
			case '4':
				System.out.print("You entered : Four");
				break;
			case '5':
				System.out.print("You entered : Five");
				break;
		}
	}
}
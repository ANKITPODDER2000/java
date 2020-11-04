import java.util.Scanner;
public class BooleanOperator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		boolean [][]arr = {{true , true} , {true , false} , {false , true} , {false , false}};
		System.out.println("Enter | -> or\nEnter & -> and \nEnter ^ -> xor \nEnter q -> quit");
		char ch;
		do{
			System.out.print("\nEnter the operation : ");
			ch = sc.nextLine().charAt(0);
			switch(ch){
				case '|':
					count = 1;
					for(boolean[] a : arr){
						System.out.printf("%d. %6b | %6b : %b\n",count++,a[0],a[1],a[1] | a[0]);
					}
					break;
				case '&':
					count = 1;
					for(boolean[] a : arr){
						System.out.printf("%d. %6b & %6b : %b\n",count++,a[0],a[1],a[1] & a[0]);
					}
					break;
				case '^':
					count = 1;
					for(boolean[] a : arr){
						System.out.printf("%d. %6b ^ %6b : %b\n",count++,a[0],a[1],a[1] ^ a[0]);
					}
					break;
				case 'q':
					System.out.println("End of program!");
					break;	
				default:
					System.out.println("Enter the proper operation !!!");
			}
		}while(ch!='q');
	}
}
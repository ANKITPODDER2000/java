import java.util.Scanner;

public class ForLoop2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start , end,i;
		System.out.print("Enter the value of start & end : ");
		start = s.nextInt();
		end = s.nextInt();

		System.out.print("Odd numbers in this range : ");
		for(i=start;i<=end;i++){
			if(i%2==0)
				continue;
			System.out.print(i + " ");
		}
	}
}
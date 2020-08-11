import java.util.Scanner;

public class Continue1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start , end,i;
		System.out.print("Enter the value of start & end : ");
		start = s.nextInt();
		end = s.nextInt();

		System.out.print("Odd numbers in this range : ");
		i = start;
		while(i<=end){
			if(i%2==0)
			{
				i++;
				continue;
			}
			System.out.print(i + " ");
			i++;
		}
	}
}
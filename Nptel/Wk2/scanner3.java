import java.util.*;

public class scanner3{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		ArrayList <Integer> l = new ArrayList <Integer>();
		int sum = 0;
		System.out.printf("\nEnter all array element : ");
		while(S.hasNextInt()){
			l.add(S.nextInt());
		}

		for(int i = 0;i<l.size();i++){
			sum += l.get(i);
		}
		System.out.printf("Sum of all array elements is := %d",sum);
	}
}
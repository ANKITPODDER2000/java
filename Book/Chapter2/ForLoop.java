public class ForLoop{
	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		if(start > end){
			System.out.print("You enter wrong value.");
		}
		else{
			System.out.print("Odd numbers in the range : ");
			int i = start;
			if(i%2==0)
				i += 1;
			for(;i<=end;){
				System.out.print(i + " ");
				i += 2;
			}
			System.out.println();

			System.out.print("Even numbers in the range : ");
			i = start;
			if(i%2!=0)
				i += 1;
			for(;i<=end;){
				System.out.print(i + " ");
				i += 2;
			}
			System.out.println();
		}
	}
}
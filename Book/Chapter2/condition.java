public class condition{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num==0)
			System.out.print("Number is equal to 0.");
		else if(num > 0)
			System.out.print("Number is greater than 0.");
		else
			System.out.print("Number is less than 0.");
	}
}
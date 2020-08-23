public class Main{
	public static void main(String[] args) {
		try{
			int i = args.length;
			System.out.println("Value i : " + i);
			if(args[0].equals("Java"))
				System.out.printf("%s\n",args[0]);
			int []arr = new int[i];
			int a = 18 / i;
			int []val = {10,20};
			System.out.println(val[i]);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println("Do u make any mistake ?");
		}
	}
}
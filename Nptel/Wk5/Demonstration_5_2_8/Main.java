public class Main{
	public static void main(String[] args) {
		try{
			int i  = args.length;
			String []myString = new String[i];
			if(i!=0){
				myString[0] = "Java";
			}
			if(myString[0].equals("Java")){
				System.out.println("First word is Java!!");
			}
			System.out.println("Value of i is := " + i);
			int x = 18 / i;
			int []y = {555 , 444};
			y[i] = x;
			System.out.println("y[ i ] : "+y[i]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of Bound : " + e);
		}
		catch(NullPointerException e){
			System.out.println("Null pointer error : " + e);
		}
		catch(ArithmeticException e){
			System.out.println("You can't divide by 0 : " + e);
		}
	}
}
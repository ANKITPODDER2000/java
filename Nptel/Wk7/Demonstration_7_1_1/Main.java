import java.io.*;
public class Main{
	public static void main(String[] args) {
		try{
			int numberOfYears = new Integer(0);
			float interest    = new Float(0);
			float amount    = new Float(0);
			String tempString;
			DataInputStream in = new DataInputStream(System.in);
			System.out.print("Enter the total amount : ");
			System.out.flush();
			tempString = in.readLine();
			amount = Float.valueOf(tempString);
			System.out.print("Enter the interest : ");
			System.out.flush();
			tempString = in.readLine();
			interest = Float.valueOf(tempString);
			interest = interest / 100;
			System.out.print("Enter the number of years : ");
			System.out.flush();
			tempString = in.readLine();
			numberOfYears = Integer.parseInt(tempString);
			float p = amount * interest * numberOfYears;
			System.out.println("Interest is : "+p);
		}
		catch(Exception e){

		}
	}
}
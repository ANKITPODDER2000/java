import Package.Error;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int a , b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of a and b : ");
		try{
			a = s.nextInt();
			b = s.nextInt();
			int result = Error.Divide(a,b);
			if(result==-1)
				throw new ArithmeticException("/ by 0");
			System.out.printf("%d / %d = %d" , a,b,result);
	    }
	    catch(Exception e){
	    	//System.out.println("You had to enter a integer value but you had entered a value other than Integer");
	    	System.out.println(e);
	    }
	}
}
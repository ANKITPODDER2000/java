package Package;
public class Error{
	public static int Divide(int a , int b){
		try{
			int result = a / b;
			return result;
		}
		catch(Exception e){
			//System.out.println(e);
			return -1;
		}
	}
}
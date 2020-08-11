public class Scope1{
	public static void main(String[] args) {
		//System.out.println("Hello!");
		{
			int a = 10;
			System.out.println("Value of a : "+a);
		}
		//a = 20; //Error since below line would produce an error since variable  a is out of scope
		//System.out.println("Value of a : "+a); //Raise an error
	}
}
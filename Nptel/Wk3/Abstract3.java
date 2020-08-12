abstract class SuperClass{
	SuperClass(){
		System.out.println("Constructor of A is Called.");
	}
	void fun()
	{
		System.out.println("SuperClass fun() is invoked.");
	}

}
class SubClass extends SuperClass{
	SubClass(){
		super();
		System.out.println("Constructor of b is Called.");
	}

	void fun(){
		super.fun();
		System.out.println("Subclass fun() is invoked.");
	}
}
public class Abstract3{
	public static void main(String[] args) {
		//SuperClass sup1 = new SuperClass(); //SuperClass is abstract; cannot be instantiated
		SuperClass sup1 = new SubClass();
		sup1.fun();
		System.out.println("\n==================================\n");
		SubClass sub1 = new SubClass();
		sub1.fun();
	}
}
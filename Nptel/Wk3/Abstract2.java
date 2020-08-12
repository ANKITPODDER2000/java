abstract class A{
	A(){
		System.out.println("Constructor of A is Called.");
	}
	abstract void fun();

}
class B extends A{
	B(){
		super();
		System.out.println("Constructor of b is Called.");
	}

	void fun(){
		System.out.println("fun() is invoked.");
	}
}
public class Abstract2{
	public static void main(String[] args) {
		B b = new B();
		b.fun();
	}
}
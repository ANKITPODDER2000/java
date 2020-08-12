abstract class A{
	//abstract void fun();
	abstract void fun(String s);
}

class B extends A{
	void fun(String msg){
		System.out.println("fun() is invoked by "+msg +" .");
	}
}

public class Abstract1{
	public static void main(String[] args) {
		B b = new B();
		b.fun("b.fun");

		//A a = new A(); // A is abstract; cannot be instantiated
		A a = new B(); //Casting
		a.fun("a.fun");
	}
}
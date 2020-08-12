abstract class A1{
	void fun(){
		System.out.println("Hi from A1 !");
	}
}

class sub extends A1{
	sub(){
		System.out.println("Hi from constructor of sub!");
		super.fun();
	}
	/*
	void fun(){
		System.out.println("Hi from sub !");
	}
	*/
}

public class final3{
	public static void main(String[] args) {
		/*
			A1 a1 = new A1();
			a1.fun();
		*/
		sub s = new sub();
		//sub.fun(); //non-static method fun() cannot be referenced from a static context
	}
}
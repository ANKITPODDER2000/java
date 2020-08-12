final class A1{
	void fun(){
		System.out.println("Hi from A1 !");
	}
}

class sub extends A1{//cannot inherit from final A1
	void fun(){
		System.out.println("Hi from sub!");
	}
}

public class final2{
	public static void main(String[] args) {
		/*
			A1 a1 = new A1();
			a1.fun();
		*/
		sub s = new sub();
	}
}
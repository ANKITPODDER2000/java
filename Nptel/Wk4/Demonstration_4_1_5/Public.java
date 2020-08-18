class A{
	public void fun(){
		System.out.println("fun() is invoked!");
	}
}

public class Public{
	public static void main(String[] args) {
		A a = new A();
		a.fun();
	}
}
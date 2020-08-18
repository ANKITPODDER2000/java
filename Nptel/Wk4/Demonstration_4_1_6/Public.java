class A{
	private int a = 20;
	public void fun(){
		System.out.println("fun() is invoked!");
	}
}
public class Public{
	public static void main(String[] args) {
		A a1 = new A();
		//System.out.println("Value of a is : "+a1.a);//We can't access any private member outside of class
		a1.fun();
	}
}
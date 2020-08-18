class A{
	int a;
	private A(int a){
		this.a = a; // We can't create any instance of this class because private is accessable by the class only
	}
	public void fun(){
		System.out.println("fun() is invoked!");
	}
}
public class Private{
	public static void main(String[] args) {
		A a1 = new A(Integer.parseInt(args[0]));
		//System.out.println("Value of a is : "+a1.a);//We can't access any private member outside of class
		a1.fun();
	}
}
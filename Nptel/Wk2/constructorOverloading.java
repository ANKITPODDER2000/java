class A{
	int a;
	A(){
		this(1);
		System.out.println("1st method, val of a := " + this.a);
	}
	A(int a){
		this.a = a;
		System.out.println("2nd method");
	}
}
public class constructorOverloading{
	public static void main(String[] args) {
		A a = new A();
	}
}
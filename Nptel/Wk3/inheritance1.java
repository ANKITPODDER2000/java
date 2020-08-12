class A{
	int i , j;
	void showij(){
		System.out.println("i := "+i+" j := "+j);
	}
}

class B extends A{
	int k;
	void show(){
		System.out.println("K := "+k);
	}
	void sum(){
		System.out.println("Sum is := " + (i + j + k) );
	}
}
public class inheritance1{
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		a1.j = 20;
		a1.showij();
		B b1 = new B();
		b1.i = 1;
		b1.j = 2;
		b1.k = 3;
		b1.showij();
		b1.show();
	}
}
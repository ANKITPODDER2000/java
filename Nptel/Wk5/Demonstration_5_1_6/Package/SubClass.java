package Package;

public class SubClass extends SuperClass implements Inh1 , Inh2{
	public void method1(){
		System.out.println("method1() is invoked!");
	}

	public void method2(){
		System.out.println("method2() is invoked!");
	}

	public void method3(){
		System.out.println("method3() is invoked!");
	}

	public void details(){
		System.out.println("a := " + a);
		System.out.println("b := " + b);
		System.out.println("c := " + super.c);
	}
}
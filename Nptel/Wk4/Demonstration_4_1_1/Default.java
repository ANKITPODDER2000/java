class A{
	void fun(){
		System.out.println("fun() is invoked!");
	}
}

class Default{
	public static void main(String[] args) {
		A a = new A();
		a.fun();
	}
}
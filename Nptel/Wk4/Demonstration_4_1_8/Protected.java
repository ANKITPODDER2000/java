class A{
	protected int rollNo;
	protected A(int rollNo){
		this.rollNo = rollNo; 
	}
	protected void fun(){
		System.out.println("fun() is invoked!");
	}
	protected void roll(){
		System.out.println("Roll no : "+this.rollNo);
	}
}
public class Protected{
	public static void main(String[] args) {
		A a1 = new A(Integer.parseInt(args[0]));
		a1.fun();
		a1.roll();
	}
}
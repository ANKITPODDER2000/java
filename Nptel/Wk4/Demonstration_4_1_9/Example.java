class superClass{
	// private int x,y; can't access private member outside of class
	protected int x,y;
	superClass(int x,int y){
		this.x = x;
		this.y = y;
	}
}
class subClass extends superClass{
	subClass(int x,int y){
		super(x,y);
	}
	void mul(){
		System.out.printf("%d * %d : %d",super.x,super.y,super.x * super.y);
	}
}
public class Example{
	public static void main(String[] args) {
		subClass a1 = new subClass(Integer.parseInt(args[0]) , Integer.parseInt(args[1]));
		a1.mul();
	}
}
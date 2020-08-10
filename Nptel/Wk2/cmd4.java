class calc{
	int x,y,sum;
	calc(int x , int y){
		this.x = x;
		this.y = y;
	}
	public int sum(){
		return this.x + this.y;
	}
}

public class cmd4{
	public static void main(String[] args) {
		calc c1 = new calc(Integer.parseInt(args[0]) , Integer.parseInt(args[1]));
		System.out.println("Sum is := " + c1.sum());
	}
}
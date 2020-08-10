import java.lang.*;
class calculator{
	int x ;
	double y;
	calculator(int x){
		this.x = x;
	}
	public void sqrt(){
		y = Math.sqrt(x); // Math.sqrt() method returns double so we need to explicitly convert it.
	}
}
public class cmd2{
	public static void main(String []args) {
		calculator c1 = new calculator(Integer.parseInt(args[0]));
		c1.sqrt();
		System.out.printf("Sqrt of %d is : %f",c1.x,c1.y);
	}
}
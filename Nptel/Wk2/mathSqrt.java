import java.lang.*;
class calculator{
	int x;
	int y;
	public void sqrt(){
		y = (int)Math.sqrt(x); // Math.sqrt() method returns double so we need to explicitly convert it.
	}
}
public class mathSqrt{
	public static void main(String[] args) {
		calculator c1 = new calculator();
		c1.x = 16;
		c1.sqrt();
		System.out.printf("Sqrt of %d is : %d",c1.x,c1.y);
	}
}
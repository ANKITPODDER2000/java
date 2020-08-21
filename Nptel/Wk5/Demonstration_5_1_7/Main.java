import Package.*;

public class Main{
	public static void decision(Implements i , int val){
		switch(val){
			case 1:
				System.out.println("Return value of a := " + i.a);
				break;
			case 2:
				System.out.println("Return value of b := " + i.b);
				break;
			case 3:
				System.out.println("Return value of c := " + i.c);
				break;
		}
	}
	public static void main(String[] args) {
		Implements i = new Implements();
		
		decision(i , i.ask());
		decision(i , i.ask());
		decision(i , i.ask());
	}
}
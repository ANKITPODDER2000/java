public class Scope2Solution{
	public static void main(String[] args) {
		int x ; 
		System.out.print("Values are : ");
		for(x = 0 ; x <= 10 ; x++){
			System.out.printf("%d ",x);
		}
		System.out.printf("\nValue of x , outside of for loop : %d ",x);
	}
}
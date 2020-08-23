public class Main{
	public static void main(String[] args) {
		String []myString = {"Hi there!" , "I am Ap!" , "Good bye !"};
		int i = 0;
		while(i<5){
			try{
				System.out.println("When i = "+i+" , myString[i] = "+myString[i++]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index starts from 0 , think about it !");
				break;
			}
		}
	}
}
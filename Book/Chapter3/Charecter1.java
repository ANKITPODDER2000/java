public class Charecter1{
	public static void main(String[] args) {
		char ch1 , ch2;
		ch1 = 'A';
		ch2 = 65;
		System.out.print("ch1 : "+ ch1 +" & ch2 : "+ch2+"\n");
		ch1 ++;
		for(int i = 0 ; i < 5 ; i++)
			ch2++;
		System.out.print("ch1 : "+ ch1 +" & ch2 : "+ch2);
	}
}
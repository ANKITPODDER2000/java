import java.io.*;
public class Main{
	public static void main(String[] args) {
		byte []cities = {'I' , 'n','d','i','a',',','\n','C','h','i','n','a'};
		try{
			FileOutputStream fos = new FileOutputStream("cities.txt");
			fos.write(cities);
			fos.close();
		}
		catch(Exception ioe){
			System.out.println(ioe);
		}
	}
}
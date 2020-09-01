import java.io.*;
public class Main{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("doc1.dat");
			int b;
			while((b = fis.read()) != -1)
				System.out.print((char)b);
			fis.close();
		}
		catch(Exception ioe){
			System.out.println(ioe);
			System.exit(-1);
		}
	}
}
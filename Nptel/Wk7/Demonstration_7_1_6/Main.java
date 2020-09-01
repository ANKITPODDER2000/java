import java.io.*;
public class Main{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("file1.txt");
			FileOutputStream fos = new FileOutputStream("file2.txt");
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
				System.out.print((char)b);
			}
		}
		catch(Exception ioe){}
	}
}
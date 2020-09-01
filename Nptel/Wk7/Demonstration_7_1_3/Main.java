import java.io.*;
public class Main{
	public static void main(String[] args) {
		try{
			FileInputStream fin = new FileInputStream(args[0]);
			int size = fin.available();
			System.out.println("Total size : "+ size +" bytes.");
			for(int i = 0 ; i < size / 4; i++)
			{
				int temp = fin.read();
				System.out.println(temp + " " + (char)temp );
			}
			System.out.println("Remaining size : "+ fin.available() +" bytes.");
			byte []b = new byte[size / 4];
			if(fin.read(b) != b.length)
				System.out.println("Error to transfer!");
			else{
				String temp = new String(b , 0 , 0 , b.length);
				System.out.println(temp);
				fin.skip(size / 4);
				System.out.println("Remaining size : "+ fin.available() +" bytes.");
			}
		}
		catch(Exception ioe){
			System.out.println(ioe);
		}
	}
}
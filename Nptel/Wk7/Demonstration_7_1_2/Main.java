import java.io.*;

public class Main{
	
	public static void getPaths(File f) throws IOException{
		System.out.println("Name : "+f.getName());
		System.out.println("Path : "+f.getPath());
		System.out.println("Absolute Path : "+f.getAbsolutePath());
		System.out.println("Parent : "+f.getParent());
	}

	public static void getInfo(File f) throws IOException{
		if(f.exists()){
			System.out.println("Can read : " + f.canRead());
			System.out.println("Can write : " + f.canWrite());
			System.out.println("Lastmodified : " + f.lastModified());
			System.out.println("Length : " + f.length());
		}
		else{
			System.out.println("File not found");
		}
	}

	public static void main(String[] args) throws IOException{
		File f = null;
		if(args.length > 0){
			for(int i = 0 ; i < args.length ; i++){
				f = new File(args[i]);
				System.out.println("====================Details of "+args[i]+"==================================");
				getPaths(f);
				getInfo(f);
			}
		}
		else{
			System.out.println("Enter the file names in command line.");
		}
	}
}
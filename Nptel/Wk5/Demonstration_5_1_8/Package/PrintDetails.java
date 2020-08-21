package Package;

public class PrintDetails{
	public static void print(String msg , double area , double circumstances){
		System.out.printf("%s\n========================\nArea := %.3f\nCircumstances := %.3f\n\n"
			,msg,area,circumstances);
	}
}
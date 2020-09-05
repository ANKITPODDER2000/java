import java.io.*;
public class Main{
	public static void main(String[] args) {
		try{
			FileInputStream fil1 = new FileInputStream("doc1.txt");
            FileInputStream fil2 = new FileInputStream("doc2.txt");
            SequenceInputStream sq = new SequenceInputStream(fil1 , fil2);
            BufferedInputStream bis = new BufferedInputStream(sq);
            BufferedOutputStream bos = new BufferedOutputStream(System.out);
            int ch;
            while((ch = bis.read())!=-1){
                bos.write((char)ch);
            }
            bos.close();
            bis.close();
            fil1.close();
            fil2.close();
			int b;
		}
		catch(Exception ioe){}
	}
}
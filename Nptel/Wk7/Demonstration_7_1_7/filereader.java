import java.io.*;
class filereader{
    public static void main(String[] args) {
        FileWriter fout = null;
        FileReader fin = null;
        try{
            fin = new FileReader("doc1.txt");
            fout = new FileWriter("doc2.txt");
            int ch;
            while((ch = fin.read()) != -1){
                fout.write(ch);
                System.out.print((char)ch);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try {
                fin.close();
                fout.close();
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }
}
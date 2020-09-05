import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        File fl = new File("doc.txt");
        FileOutputStream fin = new FileOutputStream(fl);
        DataOutputStream tar = new DataOutputStream(fin);
        tar.write(65);
        tar.writeInt(65);
        tar.writeDouble(65.5);
        tar.writeBoolean(true);
        tar.writeChar('c');
        tar.close();
        System.out.println("Writing Done!");
        FileInputStream fos = new FileInputStream(fl);
        DataInputStream dos = new DataInputStream(fos);
        System.out.println(dos.read());
        System.out.println(dos.readInt());
        System.out.println(dos.readDouble());
        System.out.println(dos.readBoolean());
        System.out.println(dos.readChar());
    }
}
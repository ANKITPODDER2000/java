import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        RandomAccessFile tar = new RandomAccessFile("doc.txt" , "rw");
        tar.write((char)65);
        tar.writeInt(65);
        tar.writeDouble(65.5);
        tar.writeBoolean(true);
        tar.writeChar('c');
        System.out.println("Writing Done!");
        tar.seek(0);
        System.out.println(tar.read());
        System.out.println(tar.readInt());
        System.out.println(tar.readDouble());
        System.out.println(tar.readBoolean());
        System.out.println(tar.readChar());
        tar.write(65);
        tar.seek(tar.length() - 1);
        System.out.println(tar.read());
        tar.seek(0);
        tar.write(5);
        tar.seek(0);
        System.out.println(tar.read());
    }
}
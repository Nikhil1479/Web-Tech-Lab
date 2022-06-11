import java.io.*;

public class ques2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("raf.txt", "rw");
        System.out.println("Writing to file char, int, double using RAF");
        file.writeChar(23);
        file.writeInt(45);
        file.writeDouble(56.7);
        file.seek(0);
        System.out.println("Reading from file char, int, double using RAF");
        System.out.println("Char : " + file.readChar() + "\nInteger : "
                +file.readInt()+"\nDouble : "+file.readDouble());
        file.close();
    }
}
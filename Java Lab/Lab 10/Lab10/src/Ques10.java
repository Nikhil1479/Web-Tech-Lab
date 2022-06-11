import java.io.*;

public class Ques10 {
    public static void main(String[] args) {
        FileReverse obj = new FileReverse();
        obj.reverse();
    }
}
class FileReverse {
    File f, f2;
    String str;

    FileReverse() {
        f = new File("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/input.txt");
    }
    void reverse() {
        try {
            RandomAccessFile file = new RandomAccessFile(f, "r");
            long n = f.length() - 1;
            int i = 0;
            while (n >= 0) {
                if (n == -1)
                    break;
                else {
                    file.seek(n);
                    i = file.read();
                    n = n - 1;
                    System.out.print((char) i);
                }
            }
            file.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
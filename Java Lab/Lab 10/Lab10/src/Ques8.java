import java.io.*;

public class Ques8 {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/input.txt");
        FileOutputStream out = new FileOutputStream("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/output.txt");
        int c;
        System.out.println("Reading and Writing from and to file");
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("\n");
        c = 0;
        System.out.println("Reading and Writing from and to file");
        FileReader inc = new FileReader("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/inputc.txt");
        FileWriter outc = new FileWriter("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/outputc.txt");
        while ((c = inc.read()) != -1) {
            outc.write(c);
            System.out.print((char) c);
        }
        inc.close();
        outc.close();
    }
}
import java.io.*;

public class ques1 {
    public static void main(String[] args) throws IOException{
        int c;
        File f=new File("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/inputc.txt");

        System.out.println("File exists : "+f.exists());
        System.out.println("Can read from file : "+f.canRead());
        System.out.println("Can write to file : "+f.canWrite());
        System.out.println("Absolute Path : " + f.getAbsolutePath());
        System.out.println("Reading and Writing to file using char stream");

        FileReader inc = new FileReader(f);
        FileWriter outc = new FileWriter("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/outputc.txt");

        while ((c = inc.read()) != -1) {
            outc.write(c);
            System.out.print((char) c);
        }
        inc.close();
        outc.close();
    }
}
import java.io.*;
import java.util.*;
public class Ques9 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Enter details of Student :\nRoll, Name, Subject Name, Marks : ");
        int roll = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        String subname = sc.nextLine();
        int marks = sc.nextInt();
        sc.close();
        FileWriter fout=new FileWriter("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/student.txt");
        FileInputStream fin = new FileInputStream("E:/4th Sem/Web Tech Lab/Java Lab/Lab 10/student.txt");
        System.out.println("Writing to file");
        fout.write("Roll : " + roll + "\nName : " + name + "\nSubject Name : " + subname + "\nMarks : " + marks);
        fout.close();
        System.out.println("Reading and Printing details from file");
        while ((c = fin.read ()) != -1) {
            System.out.print((char) c);
        }
        fin.close();
    }
}
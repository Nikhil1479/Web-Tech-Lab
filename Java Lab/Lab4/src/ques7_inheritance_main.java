import java.util.Scanner;

public class ques7_inheritance_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle1 crcl = new Circle1();
        System.out.print("Enter Radius: ");
        crcl.r = sc.nextInt();
        System.out.print("Area of Circle is: ");
        crcl.circlearea();
        System.out.println("Enter Length and Breadth of Rectangle: ");
        Rectangle rec = new Rectangle();
        rec.a = sc.nextInt();
        rec.b = sc.nextInt();
        System.out.print("Area of Rectangle is: ");
        rec.recarea();
        sc.close();
    }
}
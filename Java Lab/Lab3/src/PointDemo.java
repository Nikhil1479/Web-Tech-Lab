import java.util.Scanner;

public class PointDemo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Point pnt = new Point();

        System.out.println("Enter the value x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the value y1: ");
        int y1 = sc.nextInt();

        System.out.println("Enter the value x2: ");
        int x2 = sc.nextInt();

        System.out.println("Enter the value y2 : ");
        int y2 = sc.nextInt();

        Point pnt1 = new Point (x1,y1);
        Point pnt2 = new Point (x2,y2);
        pnt1.show();
        pnt2.show();
        pnt.findDistance();
        pnt1.findDistance(x2,y2);
        pnt1.findDistance(pnt2);
    }
}
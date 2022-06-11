import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        int rad;
        circle cir = new circle();
        rad = sc.nextInt();
        cir.setDim(rad);
        cir.findArea(rad);
        cir.perimeter(rad);

    }
}

import java.util.Scanner;

public class EquationDemo {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Coefficients a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Equation eq = new Equation();

        eq.setCoefficient(a, b, c);
        eq.findRoots();
    }
}

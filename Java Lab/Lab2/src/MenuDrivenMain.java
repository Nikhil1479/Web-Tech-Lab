import java.util.Scanner;

public class MenuDrivenMain {
    public static void main(String[] args) {
        int myNum1, myNum2, choice, result;

        MenuDriven menu = new MenuDriven();
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Enter 2 Numbers");
            myNum1 = sc.nextInt();
            myNum2 = sc.nextInt();

            System.out.println("====Menu====");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Division");
            System.out.println("4. Subtraction");
            System.out.println("5. Exit");

            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    result = menu.Addition(myNum1, myNum2);
                    System.out.println(myNum1 + " + " + myNum2 + ": " + result);
                    break;

                case 2:
                    result = menu.Multiplication(myNum1, myNum2);
                    System.out.println(myNum1 + " * " + myNum2 + ": " + result);
                    break;

                case 3:
                    result = menu.Division(myNum1, myNum2);
                    System.out.println(myNum1 + " / " + myNum2 + ": " + result);
                    break;
                case 4:
                    result = menu.Substraction(myNum1, myNum2);
                    System.out.println(myNum1 + " - " + myNum2 + ": " + result);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(true);
    }
}
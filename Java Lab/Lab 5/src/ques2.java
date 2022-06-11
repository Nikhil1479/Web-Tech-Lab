import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person a[] = new Person[5];
        for (int i = 0; i < 2; i++) {
            a[i] = new Person();
            sc.nextLine();
            System.out.println("Enter Your Name: ");
            a[i].name = sc.nextLine();
            System.out.print("Enter Your Aadhar Number: ");
            a[i].aadhar_no = sc.nextInt();
            System.out.print("Enter Your Account No.: ");
            a[i].acc_no = sc.nextInt();
            System.out.print("Enter Your Bank Balance: ");
            a[i].balance = sc.nextInt();
        }
        System.out.println("Name \t Aadhar No. \t Account No. \t Account Bal ");
        pLines(40);
        for (int i = 0; i < 2; i++) {

            a[i].disp();
        }
    }

    public static void pLines(int lines)
    {
        for(int i = 0; i < lines; i++)
        {
            System.out.print("-");
        }
        System.out.println("");
    }
}

    class Account {
        int acc_no;
        double balance;

        void disp() {
            System.out.println("Account No: " + acc_no);
            System.out.println("Balance: " + balance);
        }
    }

    class Person extends Account {
        String name;
        int aadhar_no;

        Person() {
        }

        void disp() {
            System.out.println(name + " \t " + aadhar_no + " \t\t " + acc_no + " \t\t " + balance);
        }
    }
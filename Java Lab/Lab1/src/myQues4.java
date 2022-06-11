import java.util.Scanner;

public class myQues4 {
    public static void main(String[] args)
    {
        int myEven = 0, myOdd= 0, evenCount = 0, oddCount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of n: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter "+ n +" Numbers");
        for(int i = 0; i < n; i++)
        {
            numbers[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++)
        {
            if (numbers[j] % 2 == 0)
            {
                myEven += numbers[j];
                evenCount++;
            }
            else
            {
                myOdd += numbers[j];
                oddCount++;
            }
        }
        System.out.println("Total Even Number: "+ evenCount);
        System.out.println("Total Odd Number: "+ oddCount);
        System.out.println("Even Sum: "+myEven);
        System.out.println("Odd Sum: "+myOdd);

    }
}

import java.util.Scanner;

public class Array2D {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter rows : ");
        int r=sc.nextInt();
        System.out.println("Enter columns : ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Input Elements in Array: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D array in matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
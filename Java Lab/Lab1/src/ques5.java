import java.util.Scanner;
public class ques5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the roll: ");
        int roll=sc.nextInt();
        int[] marks =new int[5];
        int cgpa=0;
        System.out.println("Enter the marks: ");
        for (int i=0;i<5;i++)
        {
            marks[i]=sc.nextInt();
            cgpa=cgpa+marks[i];
        }
        cgpa=cgpa/5;
        if(cgpa>=90)
        {
            System.out.println("Grade O CGPA= "+cgpa);
        }
        else if(cgpa>=80 && cgpa<90)
        {
            System.out.println("Grade E CGPA= "+cgpa);
        }
        else if(cgpa>=70 && cgpa<80)
        {
            System.out.println("Grade A CGPA= "+cgpa);
        }
        else if(cgpa>=60 && cgpa<70)
        {
            System.out.println("Grade B CGPA= "+cgpa);
        }
        else if(cgpa>=50 && cgpa<60)
        {
            System.out.println("Grade C CGPA= "+cgpa);
        }
        else if(cgpa>=40 && cgpa<50)
        {
            System.out.println("Grade D CGPA= "+cgpa);
        }
        else
        {
            System.out.println("Grade Fail CGPA= "+cgpa);
        }
    }
}
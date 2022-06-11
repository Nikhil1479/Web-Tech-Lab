interface Inter1
{
    void disp();
}
class shape
{
    void display()
    {
        System.out.println("The display function of shape class ");
    }
}
public class ques6 extends shape implements Inter1
{
    public void disp()
    {
        System.out.println("The display function of interface ");
    }
    public static void main(String[] args)
    {
        ques6 obj=new ques6();
        obj.disp();
        obj.display();
    }
}
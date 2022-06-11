interface Inter_1
{
    void disp();
}
class student1 implements Inter_1
{
    public void disp()
    {
        System.out.println("interface method");
    }
    void nonIfaceMethod()
    {
        System.out.println("non-interface method");
    }
}
public class ques4
{
    public static void main(String[] args)
    {
        student1 obj=new student1();
        System.out.println("\nFrom student obj :");
        obj.disp();
        obj.nonIfaceMethod();
        Inter_1 ref;
        ref=obj;
        System.out.println("\nFrom interface reference :");
        ref.disp();
        //ref.nonIfaceMethod();    //line which shows the error asked in the question
    }
}
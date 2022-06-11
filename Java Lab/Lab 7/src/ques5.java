interface A
{
    void math1();
    void math2();
}
interface B extends A
{
    void math3();
}
class student2 implements B
{
    //comment from here to label for error asked in question
    public void math1()
    {
        System.out.println("math1 ");
    }
    public void math2()
    {
        System.out.println("math2 ");
    }
    //label
    public void math3()
    {
        System.out.println("math3");
    }
}
public class ques5
{
    public static void main(String[] args)
    {
        student2 obj=new student2();
        obj.math1();
        obj.math2();
        obj.math3();
    }
}
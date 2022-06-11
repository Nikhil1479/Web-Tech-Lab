class ques2
{
    static int count=0;
    public void increment()
    {
        count++;
    }
    public static void main(String args[])
    {
        ques2 obj1=new ques2();
        ques2 obj2=new ques2();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
    }
}
public class ques4_Constructor_Overloading {
    int z;
    void ques5 ()
    {
        z = 0;
    }
    void ques5 ( int x)
    {
        z = z + x;
    }
    void ques5 ( int x, int y)
    {
        System.out.println(z);
        System.out.println(z +"-"+x+"-" +y);
    }
    public static void main(String[] args) {
        ques4_Constructor_Overloading obj = new ques4_Constructor_Overloading();
        obj.ques5();
        obj.ques5(5);
        obj.ques5(8, 2);
    }
}

public class ques1 {
    int price;
    String name;
    static String category = "Fruits";
    ques1(int Fprice, String Fname)
    {
        price=Fprice;
        name=Fname;
    }

    void  display() {
        System.out.println(price + "\t" + name + "\t" + category);

    }
}
class staticTest
{
    public static void main(String[] args)
    {
        ques1 obj1 = new ques1(100,"Orange");
        ques1 obj2 = new ques1(200,"Apple");
        obj1.display();
        obj2.display();
    }
}

public class static_block {
    static String name="Rohan";

    static{
        System.out.println("Static block is intiliazied ");
    }
    static void changeName(){
        name="Nikhil";
    }
    void showName(){
        System.out.println(name);
    }
}
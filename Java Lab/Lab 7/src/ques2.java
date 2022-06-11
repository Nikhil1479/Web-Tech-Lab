interface motor {
    int capacity = 30;

    void run();

    void consume();
}

class washing_machine implements motor {
    public void run() {
        System.out.println("run Method");
    }

    public void consume() {
        System.out.println("consume Method");
    }

}
public class ques2 {
    public static void main(String[] args) {
        motor ob = new washing_machine();
        System.out.println("Value of capacity : " + ob.capacity);
        ob.run();
        ob.consume();
    }
}
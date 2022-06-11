class First {
    void print() {
        System.out.println("First Start Class");
    }
}

class Derived extends First {
    void print() {
        System.out.println("Dynamic Method Dispatch");
    }
}
public class ques1 {
    public static void main(String[] args) {
        First fir;
        fir = new Derived();
        fir.print();
    }
}
class A {
    int P() {
        return 0;
    }
}

class B extends A {
    public int P() {
        return 5;
    }
}

class C extends A {
    protected int P() {
        return 6;
    }
}

public class ques4 {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        System.out.println("P using friendly: " + obj1.P());
        System.out.println("P using public: " + obj2.P());
        System.out.println("P using protected: " + obj3.P());
        System.out.println("private access modifier cannot be accessed");
    }
}
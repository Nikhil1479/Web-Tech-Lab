abstract class student {
    double rollno = 1523, regno = 6453;

    abstract void course();
}

class kiitian extends student {

    void course() {
        System.out.println("Roll No.:" + rollno);
        System.out.println("Reg No.:" + regno);
    }
}

public class ques8 {
    public static void main(String[] args) {
        student a = new kiitian();
        a.course();
    }
}

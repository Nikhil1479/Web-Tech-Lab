public class MyNumberDemo {
    public static void main(String[] args) {
        MyNumber mynum = new MyNumber();
        mynum.setValue(6);
        System.out.println(mynum.FindFactorial());
        System.out.println(mynum.isEven());
        System.out.println("Sum of digit is: "+mynum.findSumofDigits());
    }
}

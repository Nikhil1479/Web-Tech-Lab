import java.util.Scanner;

public class NegativeNumberDemo {
    static void processInput(int x )throws NegativeNumberException{

        if(x<0){
            throw new NegativeNumberException();

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x =s.nextInt();
        try{
            processInput(x);

        }catch(NegativeNumberException e){
            System.out.println(e);
        }
        s.close();
    }
}

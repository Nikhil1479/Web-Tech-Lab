public class ques4 {
    public static void main(String[] args)
    {
        int myEven = 0, myOdd = 0, evenCount = 0, oddCount = 0;
        for (int i = 0; i< args.length;i++)
        {
            int n = Integer.parseInt(args[i]);
            if(n%2 == 0) {
                myEven = myEven + n;
                evenCount++;
            }
            else {
                myOdd = myOdd + n;
                oddCount++;
            }
        }

        System.out.println("ODD Number Sum: "+myOdd);
        System.out.println("Even Number Sum: "+myEven);
        System.out.println("Grand Sum: "+(myOdd+myEven));
        System.out.println("Even Count" +evenCount);
        System.out.println("Odd Count" +oddCount);
    }
}

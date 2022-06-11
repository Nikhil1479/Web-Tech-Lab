public class MyNumber {
    int myNum;

    void setValue(int a)
    {
        myNum = a;
    }

    boolean isEven()
    {
        return myNum % 2 == 0;
    }

    long FindFactorial()
    {
        long fact = 1, i;
        for(i = myNum; i > 0 ;--i)
        {
            fact = fact * i;
        }
        return fact;
    }

    int findSumofDigits()
    {
        int eachDigit;
        int sum = 0;
        while(myNum >0 )
        {
            eachDigit = myNum % 10;
            sum = sum + eachDigit;
            myNum = myNum / 10;
        }
        return sum;

    }
}
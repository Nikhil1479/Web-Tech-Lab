package Marketing;

public class Demo
{
    public static void main (String args[])
    {
        sales obj=new sales();
        double te=obj.earnings(10000);
        double ta=obj.tallowance(te);
        double totalearn=te+ta;
        System.out.println("Total Earnings : "+totalearn);
    }
}
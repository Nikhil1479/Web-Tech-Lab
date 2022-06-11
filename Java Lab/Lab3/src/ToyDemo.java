import java.util.Scanner;

public class ToyDemo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int total=0;
        System.out.println("Total No of Toys : ");
        int n=sc.nextInt();
        Toy[] obj=new Toy[10];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            System.out.println("Info of toy "+(i+1)+": ");
            System.out.println("Name= ");
            String name=sc.nextLine();
            System.out.println("ID : ");
            int id=sc.nextInt();
            System.out.println("Quantity : ");
            int quantity=sc.nextInt();
            System.out.println("Price : ");
            int price=sc.nextInt();
            obj[i]=new Toy (id,quantity,price,name);
        }
        System.out.println("ToyID\tToyName\tToyQuantity\tToyPrice");
        for(int i=0;i<n;i++)
        {
            System.out.println(obj[i].toyid+"\t"+obj[i].toyname+"\t"+obj[i].toyquantity+"\t\t\t"+obj[i].toyprice);
            total=total+(obj[i].toyquantity*obj[i].toyprice);
        }
        System.out.println("Total Price: Rs. "+total);
    }
}
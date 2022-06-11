public class Point {
    int x,y;
    Point()
    {
        x=10;
        y=20;
    }
    Point(int a,int b)
    {
        x=a;
        y=b;
    }
    Point(Point o)
    {
        x=o.x;
        y=o.y;
    }
    void findDistance()
    {
        double dist = Math.sqrt(Math.pow(x,2)+Math.pow(x,2));
        System.out.println("Distance: "+dist);
    }
    void findDistance(int x1,int y1)
    {
        double dist = Math.sqrt(Math.pow((x-x1),2)+Math.pow((y-y1),2));
        System.out.println("Distance: "+dist);
    }
    void findDistance(Point o)
    {
        double dist = Math.sqrt(Math.pow((x-o.x),2)+Math.pow((y-o.y),2));
        System.out.println("Distance: "+dist);
    }
    void show()
    {
        System.out.println("Data membersx = "+x+"\ny = "+y);
    }
}

package ques5;

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Shape shape;

        Circle crcl = new Circle();

        shape = crcl;

        shape.setValues(5);

        System.out.println("Area of ques5.Circle : " + shape.getArea());

        Square sq = new Square();

        shape = sq;

        shape.setValues(5);

        System.out.println("Area of ques5.Square : " + shape.getArea());

        Triangle tri = new Triangle();
        shape=tri;

        shape.setValues(5);
        System.out.println("Area of ques5.Triangle : " + shape.getArea());
    }
}
package ques5;

public class Triangle extends Shape {
    public double getArea()
    {
        return Math.sqrt(3)*0.25 * getRadius() * getRadius();
    }
}

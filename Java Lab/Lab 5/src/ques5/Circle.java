package ques5;

public class Circle extends Shape
{
    public double getArea()
    {
        return Math.PI * (getRadius() * getRadius());
    }
}
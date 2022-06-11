package ques5;

public abstract class Shape
{
    private double radius;

    public void setValues(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

        public abstract double getArea();
}
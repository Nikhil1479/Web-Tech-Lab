public class circle {
//    int rad;
    float area, dim, perimeter;

    void setDim(float rad)
    {
        dim = 2 * rad;
        System.out.println("Diameter: "+dim);
    }
    void findArea(int rad)
    {
        area = (float)(3.14 * rad * rad);
        System.out.println("Area: "+area);
    }
    void perimeter(int rad)
    {
        perimeter = (float)(2* 3.14 * rad);
        System.out.println("Perimeter: "+perimeter);
    }
}
public class Equation {
    int coeff1, coeff2, coeff3;
    void setCoefficient(int a, int b, int c)
    {
        coeff1 = a;
        coeff2 = b;
        coeff3 = c;
    }

    void findRoots()
    {
        double d = (coeff2 * coeff2) - (4 * coeff1 * coeff3);
        if(d < 0)
        {
            System.out.println("Roots are not real numbers");
        }
        else {
            double x1 = (-coeff2 + Math.sqrt(d)) / (2 * coeff1);
            double x2 = (-coeff2 - Math.sqrt(d)) / (2 * coeff1);

            System.out.println("Roots of " + coeff1 + "x²"+ "+" + coeff2 + "x" + "+" + coeff3);
            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}

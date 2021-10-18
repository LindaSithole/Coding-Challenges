
public class Task5{
    static double TriangleArea(double a, double b, double c)
    {
        double semiparameter = (a + b + c) / 2;
        double area = (int)Math.sqrt((semiparameter)*(semiparameter-a)*(semiparameter-b)*(semiparameter-c));
        return area;
    }
    public static void main(String[] args)
    {
        System.out.print("Area of the triangle: " + TriangleArea(3,4,5));
    }
}


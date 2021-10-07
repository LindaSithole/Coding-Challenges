
public class Task5{
        static double Area(double a, double b, double c)
        {
            double semiparameter = (a + b + c) / 2;
            int area = (int)Math.sqrt((semiparameter)*(semiparameter-a)*(semiparameter-b)*(semiparameter-c));
            return area;
        }
        public static void main(String[] args)
        {
            System.out.println("Area of the triangle: " + Area(3,4,5));
        }
    }

import java.util.Scanner;
public class Temperature {



    public static class Temp {

        public static void main(String[] args) {

            double a,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter  Fahrenheit temperature");
            a=sc.nextDouble();
            System.out.println("Celsius temperature is = "+celsius(a));
        }
        static double celsius(double f)
        {
            return  (f-32)*5/9;
        }

        public static void secondFunction(String arg[])
        {
            double a,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter  Celsius temperature");
            a=sc.nextDouble();
            System.out.println("Fahrenheit temperature is = "+fahrenheit(a));
        }
        static double fahrenheit(double c)
        {
            return  ((9*c)/5)+32;
        }
    }
}

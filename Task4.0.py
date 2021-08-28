package evenorod;
import java.util.Scanner;

public class EvenOrOd {

    public static void main(String[] args) {
       int num;
       Scanner scanner;
       
       scanner = new Scanner(System.in);
       System.out.println("Enter an Integer");
       num = scanner.nextInt();
       
        if (isEven(num)) {
      
            System.out.println(num + " is Even Number");
        } else {
           
            System.out.println(num + " is Odd Number");
        }
    }
    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
}

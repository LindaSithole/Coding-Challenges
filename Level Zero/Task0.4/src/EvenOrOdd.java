import java.util.Scanner;
public class EvenOrOdd {



    public static class EvenOrOd {

        public static void main(String[] args) {
            int num;
            Scanner scanner;

            scanner = new Scanner(System.in);
            System.out.println("Enter an Integer");
            num = scanner.nextInt();

            if (isEven(num)) {

                System.out.println("Even");
            } else {

                System.out.println("Odd");
            }
        }

        public static boolean isEven(int num) {
            return num % 2 == 0;
        }
    }
}
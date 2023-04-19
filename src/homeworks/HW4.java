package homeworks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
       /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        System.out.println("Please enter two numbers");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        if (number1 > 0 && number2 < 0) {
            System.out.println("True");
        } else if (number1 >= 0 && number2 >= 0) {
            System.out.println("False");
        } else if (number1 <= 0 && number2 <= 0) {
            System.out.println("False");
        }
    }
}

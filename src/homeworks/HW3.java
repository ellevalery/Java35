package homeworks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while(Math.abs(100 - number) > 10){

            System.out.println("Please enter number");
            number = scanner.nextInt();

            if (Math.abs(100 - number) < 10){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    /*Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/




}

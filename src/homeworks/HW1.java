package homeworks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Please enter your year of birth");
        int birthYear = scanner.nextInt();

        int age = 2023 - birthYear;

        System.out.println("Your name is " + name + " and you are " + age + "years old ");
        // Using scanner ask user to enter name and year of birth
        // Input:
        //      John, 2000
        // Print out:
        //      "Your name is John and you are 22 years old"


    }
}

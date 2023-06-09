package tasks;

import java.util.Scanner;

public class PrintOutNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        int input = scanner.nextInt();

        if(input >= 0) {
            for (int i = input; i >= 0; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = input; i <= 0; i++){
                System.out.print(i + " ");
            }
        }

    }


    //Write an application that asks for user an integer value (it can be positive or negative)
    // You should print out all numbers starting from the one user entered till 0 including
    // Example:
    // Input : 5    Output: 5 4 3 2 1 0
    // Input : -8   Output: -8 -7 -6 -5 -4 -3 -2 -1 0
    // Input : 0    Output: 0

}

package basics;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter random number");

        int max = scanner.nextInt();

        //Generate random number 0 - max
        int rand = (int) (Math.random() * (max+1));
        System.out.println("Generate random number = " + rand);
        System.out.println("Random number between 0 and " + max + "was generated");

        int guess;
        do{
            System.out.println("Guess the random number");
            guess = scanner.nextInt();

        } while (guess != rand);
        System.out.println("Congratulations you won!");
    }
}


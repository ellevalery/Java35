package homeworks;

import java.util.Locale;
import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, choose between rock, paper or scissors");
        String player1 = scanner.nextLine().toLowerCase();

        System.out.println("Player 2, choose between rock, paper or scissors");
        String player2 = scanner.nextLine().toLowerCase();

        System.out.println(rockPaperScissors(player1, player2));

    }

    //Method

    public static String rockPaperScissors(String player1, String player2){
        if (player1.equals(player2)) {
            return "TIE";
        } else if (player1.equals("rock") && player2.equals("scissors") || player2.equals("lizard") ||
                   player1.equals("paper") && player2.equals("rock") || player2.equals("spock") ||
                   player1.equals("scissors") && player2.equals("paper") || player2.equals("lizard") ||
                   player1.equals("lizard") && player2.equals("paper") || player2.equals("spock") ||
                   player1.equals("spock") && player2.equals("rock") || player2.equals("scissors")) {
            return "Player 1 wins";
        } else {
            return "Player 2 wins";
        }

    }
}

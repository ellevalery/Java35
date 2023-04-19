package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        /*      Alex is an owner of grocery store. Among many products he sells,
        he's mostly famous for his hand-made jam, that is being
        sold in jars of 1kg or 7kg. Alex sells only full jars
        (i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

        Will is asked by his wife Jane to buy some amount of Alex's jam.
        Will forgot to take his bag, thus he can take home no more than six jars of jam
        (three jars in each of his two hands). Jane is very serious about the
        shopping list - if she asked for specific amount of jam, she expects exactly this
        amount, no more, no less.

        Write an application that will check if Will is able to take home the
        amount of jam specified by Jane. Amount of jam should be read from user
        (positive int value). You can assume that there's always enough jam in Alex's shop.
        Your application should print true or false.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of jam in kg Jane needs");
        int kgOfJam = scanner.nextInt();

        int numOfJars = ((kgOfJam / 7) + (kgOfJam % 7));

        int positiveNumOfKg;

        if (kgOfJam <=0){
            do {
                System.out.println("Amount of kg should be positive number");
                positiveNumOfKg = scanner.nextInt();

            } while (positiveNumOfKg <= 0);
            int numOfJarsCorrected = ((positiveNumOfKg / 7) + (positiveNumOfKg % 7));
            System.out.println("Is will able to take home this amount of jam?" + (numOfJarsCorrected <= 6));

        } else {
            System.out.println("Is will able to take home this amount of jam?" + (numOfJars <= 6));
        }
    }
}

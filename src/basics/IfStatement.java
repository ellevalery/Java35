package basics;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        //IF
        //If grade > 6 print out "Good job"

        if(grade > 6){
            System.out.println("Good job");
        }

        //Print out "You can do it better" if grade is less or equal to 4

        if(grade <= 4){
            System.out.println("You can do it better!");

        }

        //IF ELSE
        //Print "You have passed the test" if grade is equal or greater than 4
        // but if it's not then print "You have failed te test"

        if (grade >=4) {
            System.out.println("You have passed the test");
        } else {
            System.out.println("You have failed the test");
        }

        //Same logic

        if(grade < 4){
            System.out.println("You have failed the test");
        } else {
            System.out.println("You have passed the test");
        }

        //Print comments about grades:
        // 1-3 "Very bad"
        // 4-5 "Okey"
        // 6 "Nice"
        // 7-10 "Very good"
        // If not in the range 1-10 ==> "Invalid input"

        if(grade >= 1 && grade <=3){
            System.out.println("Very bad");
        } else if (grade == 4 || grade == 5){
            System.out.println("Okey");
        } else if (grade == 6){
            System.out.println("Nice");
            //grade >= 7 && grade <= 10
        } else if (grade > 6 && grade < 11){
            System.out.println("Very good");
        } else {
            System.out.println("Invalid input");
        }

    }
}

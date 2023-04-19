package basics;

import java.util.Scanner;

public class NestedIf {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter score 1-100");
        float score = scanner.nextFloat();

        if(score <= 40.0f){
            System.out.println("Score is <= 40%");
        } else if (score > 40.0f && score <= 80.0f) {
            System.out.println("Score is <= 80%");
            if (score <= 60.0f){
                System.out.println("<= 60%");
            }
        } else {
            System.out.println("Score is <= 100%");
        }
    }
}

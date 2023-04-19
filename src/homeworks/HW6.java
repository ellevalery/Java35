package homeworks;

public class HW6 {
    public static void main(String[] args) {
        /*        Write an application, that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line.*/

        //Solution 1
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i);
        }

        //Solution 2
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }

        //Solution 3

        int i = 65;
        do {
            System.out.println((char) i);
            i++;
        } while (i <= 90);
        }
    }




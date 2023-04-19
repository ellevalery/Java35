package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input speed in mp/h: ");

        float speedMph = scanner.nextFloat();

        float speedKmh = speedMph * 1.60934f;

        System.out.println( speedMph + "mp/h in km/h would be equal to " + speedKmh);


        // Using scanner read speed in mp/h
        // Calculate and output speed in km/h
        // Example with input 122.7 mp/h
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651

    }
}

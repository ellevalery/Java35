package homeworks;

import java.util.Scanner;

public class CallingCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel in liters: ");
        float fuel = scanner.nextFloat();

        System.out.println("Enter fuel usage in liters/100km: ");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter number of passengers: ");
        int passengers = scanner.nextInt();

        System.out.println("Does the car have air conditioner? (true/false:): ");
        boolean airConditioner = scanner.nextBoolean();

        Car car = new Car(fuel, fuelUsage, passengers, airConditioner);

        System.out.println("Maximum distance: " + String.format("%.2f", car.maxDistance()));

    }
}

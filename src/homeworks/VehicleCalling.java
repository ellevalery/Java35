package homeworks;

import java.util.Scanner;

public class VehicleCalling {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter fuel in liters: ");
            float fuel = scanner.nextFloat();

            System.out.println("Enter fuel usage in liters/100km: ");
            float fuelUsage = scanner.nextFloat();

            System.out.println("Enter number of passengers: ");
            int passengers = scanner.nextInt();

            Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);

            System.out.println("Maximum distance: " + String.format("%.2f", vehicle.maxDistance()));
        }
    }

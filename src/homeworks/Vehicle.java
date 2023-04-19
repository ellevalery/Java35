package homeworks;

import java.util.Scanner;

public class Vehicle {
    public float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float calculateFuelUsage() {
        return fuelUsage * (1 + 0.05f * passengers);
    }

    public float maxDistance() {
        return fuel / calculateFuelUsage() * 100;
    }

    public float maxDistance(float fuel, float fuelUsage, int passengers) {
        return fuel / (fuelUsage * (1 + 0.05f * passengers)) * 100;
    }
}







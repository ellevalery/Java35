package homeworks;

public class Car extends Vehicle {
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float maxDistance() {
        float fuelUsageWithPassengers = super.calculateFuelUsage();
        if (airConditioner) {
            fuelUsageWithPassengers *= 1.1f;
        }
        return fuel / fuelUsageWithPassengers * 100;
    }
}
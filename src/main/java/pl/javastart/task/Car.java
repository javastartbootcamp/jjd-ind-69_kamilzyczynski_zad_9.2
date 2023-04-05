package pl.javastart.task;

public class Car extends Vehicle {
    private boolean isAirConditioned;

    public Car(String name, int fuelCapacity, double fuelUsage, boolean isAirConditioned) {
        super(name, fuelCapacity, fuelUsage);
        this.isAirConditioned = isAirConditioned;
    }

    public boolean isAirConditioned() {
        return isAirConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        isAirConditioned = airConditioned;
    }

    public double calculateFuelUsage() {
        double fuelUsage = baseFuelUsage;
        if (isAirConditioned) {
            return fuelUsage + 0.8;
        }
        return fuelUsage;
    }

    public double getVehicleRange() {
        return (fuelCapacity / calculateFuelUsage()) * 100;
    }

    public void printInfo() {
        System.out.printf("Nazwa pojazdu: %s\n", name);
        System.out.printf("Pojemność baku: %d\n", fuelCapacity);
        System.out.printf("Średnie spalanie na 100km: %.1f\n", calculateFuelUsage());
        System.out.printf("Pojazd klimatyzowany: %b\n", isAirConditioned);
        System.out.printf("Zasięg pojazdu: %.1f km\n", getVehicleRange());
    }
}

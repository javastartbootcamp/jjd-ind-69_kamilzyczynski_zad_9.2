package pl.javastart.task;

public class Car extends Vehicle {
    private boolean isAirConditioned;

    public Car(String name, int fuelCapacity, double fuelUsage, boolean isAirConditioned) {
        super(name, fuelCapacity, fuelUsage);
        this.isAirConditioned = isAirConditioned;
        setFuelUsage(calculateFuelUsage());
    }

    public boolean isAirConditioned() {
        return isAirConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        isAirConditioned = airConditioned;
        setFuelUsage(calculateFuelUsage());
    }

    public double calculateFuelUsage() {
        if (isAirConditioned) {
            return getFuelUsage() + 0.8;
        }
        return getFuelUsage();
    }

    public double getVehicleRange() {
        return (getFuelCapacity() / getFuelUsage()) * 100;
    }

    public void printInfo() {
        System.out.printf("Nazwa pojazdu: %s\n", getName());
        System.out.printf("Pojemność baku: %d\n", getFuelCapacity());
        System.out.printf("Średnie spalanie na 100km: %.1f\n", getFuelUsage());
        System.out.printf("Pojazd klimatyzowany: %b\n", isAirConditioned);
        System.out.printf("Zasięg pojazdu: %.1f km\n", getVehicleRange());
    }
}

package pl.javastart.task;

public class Truck extends Car {
    private int loadWeight;

    public Truck(String name, int fuelCapacity, double fuelUsage, boolean isAirConditioned, int loadWeight) {
        super(name, fuelCapacity, fuelUsage, isAirConditioned);
        this.loadWeight = loadWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateFuelUsage() {
        double fuelUsage = baseFuelUsage;
        if (isAirConditioned()) {
            fuelUsage += 1.6;
        }
        fuelUsage += (0.005 * loadWeight);
        return fuelUsage;
    }

    @Override
    public double getVehicleRange() {
        return super.getVehicleRange();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Waga ładunku w kg: %d\n", loadWeight);
    }
}

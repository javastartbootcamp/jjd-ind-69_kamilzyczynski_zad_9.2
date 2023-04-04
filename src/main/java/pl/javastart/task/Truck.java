package pl.javastart.task;

public class Truck extends Car {
    private int loadWeight;
    private boolean isLoadweightRangeChangeNeeded = true;

    public Truck(String name, int fuelCapacity, double fuelUsage, boolean isAirConditioned, int loadWeight) {
        super(name, fuelCapacity, fuelUsage, isAirConditioned);
        this.loadWeight = loadWeight;
        setFuelUsage(calculateFuelUsage());
    }

    public boolean isLoadweightRangeChangeNeeded() {
        return isLoadweightRangeChangeNeeded;
    }

    public void setLoadweightRangeChangeNeeded(boolean loadweightRangeChangeNeeded) {
        isLoadweightRangeChangeNeeded = loadweightRangeChangeNeeded;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
        setFuelUsage(calculateFuelUsage());
    }

    @Override
    public double calculateFuelUsage() {
        double fuelUsage = getFuelUsage();
        if (isAirConditionRangeChangeNeeded()) {
            if (isAirConditioned()) {
                fuelUsage += 1.6;
                setAirConditionRangeChangeNeeded(false);
            }
        }
        if (isLoadweightRangeChangeNeeded) {
            fuelUsage += (0.005 * loadWeight);
            setLoadweightRangeChangeNeeded(false);
        }
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

package pl.javastart.task;

public class Vehicle {
    protected String name;
    protected int fuelCapacity;
    protected double baseFuelUsage;

    public Vehicle(String name, int fuelCapacity, double fuelUsage) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.baseFuelUsage = fuelUsage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getBaseFuelUsage() {
        return baseFuelUsage;
    }

    public void setBaseFuelUsage(double baseFuelUsage) {
        this.baseFuelUsage = baseFuelUsage;
    }
}

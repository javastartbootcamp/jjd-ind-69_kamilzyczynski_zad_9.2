package pl.javastart.task;

public class Vehicle {
    private String name;
    private int fuelCapacity;
    private double fuelUsage;

    public Vehicle(String name, int fuelCapacity, double fuelUsage) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.fuelUsage = fuelUsage;
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

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }
}

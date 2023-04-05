package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Ferrari", 50, 10, false);
        cars[1] = new Car("Mercedes", 55, 8.5, false);
        cars[2] = new Truck("Volvo", 500, 10, false, 10_000);
        cars[3] = new Truck("Scania", 260, 15, false, 14_000);
        cars[4] = new Car("Seat", 50, 6.5, false);

        cars[0].printInfo();
        System.out.println("----------");

        cars[0].setAirConditioned(true);
        cars[0].printInfo();
        System.out.println("----------");

        cars[0].setAirConditioned(false);
        cars[0].printInfo();
        System.out.println("----------");

        cars[0].setAirConditioned(true);
        cars[0].printInfo();
        System.out.println("----------");
    }
}

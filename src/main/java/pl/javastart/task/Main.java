package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Ferrari", 45, 9, false);
        cars[1] = new Car("Mercedes", 55, 8.5, false);
        cars[2] = new Truck("Volvo", 250, 13, false, 10_000);
        cars[3] = new Truck("Scania", 260, 15, false, 14_000);
        cars[4] = new Car("Seat", 50, 6.5, false);

        for (Car car : cars) {
            car.printInfo();
            System.out.println();
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].setAirConditioned(true);
        }

        for (Car car : cars) {
            car.printInfo();
            System.out.println();
        }

    }
}

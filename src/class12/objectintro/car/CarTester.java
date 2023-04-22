package class12.objectintro.car;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Car();

        car.make = "Honda";
        System.out.println(car.make);

        car.model = "Accord SE";
        System.out.println(car.model);

        car.color = "White";
        System.out.println(car.color);

        car.mileage = 142530.256;
        System.out.println(car.mileage);

        car.year = 2012;
        System.out.println(car.year);

        car.start();
        car.move();
        car.stop();


        //  System.out.println(car.toString());

    }
}

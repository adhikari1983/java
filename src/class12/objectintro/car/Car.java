package class12.objectintro.car;

public class Car {

    String make;
    String model;
    String color;
    double mileage;
    int year;

    void start(){
        System.out.println( make + " is starting. ");
    }

    void move(){
        System.out.println("Car is moving. ");
    }

    void stop(){
        System.out.println("Car is stopped. ");
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "make='" + make + '\'' +
//                ", model='" + model + '\'' +
//                ", color='" + color + '\'' +
//                ", mileage=" + mileage +
//                ", year=" + year +
//                '}';
//    }
}

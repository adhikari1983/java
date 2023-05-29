package class24.list;

import class17.constructor.Dog;

import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {
        /*
        A framework is a pre-written code that allows developers to build applications more easily and quickly
        ArrayList => a class (Its part of the collection's framework)
                  <> These are called angle brackets/diamond operators we write the name of the class whose
                     object we are planning to store in an arrayList
         */
        /** Array list of string .
               names-> variable of
                                   main data-type -> Array
                                    sub data-type -> String
         */
        ArrayList<String> names = new ArrayList<>();
        names.add("any string");

        ArrayList<Dog> dogs = new ArrayList<>();
        //Dog dog = new Dog();
        dogs.add(new Dog());  //creating the object of dog class and storing it in arraylist.

        ArrayList<Car> carList = new ArrayList<>();
        //creating the objects of car class and storing it in carList.
        Car  car1 = new Car("Tesla", "Dual turbo");
        Car  car2 = new Car("Honda", "Accord");
        Car  car3 = new Car("Toyota", "Camry");
        Car  car4 = new Car("Kia", "Ultimate");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        for(Car car: carList){
            car.printInfo();
        }

    }
}

class Car{
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void printInfo(){
        System.out.println(make +" "+ model);
    }
}
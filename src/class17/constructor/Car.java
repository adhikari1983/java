package class17.constructor;

public class Car {

    String make;
    String model;
    int engineCC;
    String color;

 /*   Car(String carMake, String carModel, int carEngineCC, String carColor) {
        make=carMake;
        model=carModel;
        engineCC=carEngineCC;
        color=carColor;
    }
*/
    Car(String make, String model, int engineCC, String color) {
        this.make = make;         //without this it is not distinguished whether that
        this.model = model;       //   "make" is referring to -> instance variable
        this.engineCC = engineCC; //          or referring to -> argument value via parameter
        this.color = color;       // => "this" keyword is used explicitly specify, the instance variable
    } //this. -> eliminates confusion between class's attributes(instance variables) & parameters(arguments value) in the same class

    void printInfo() {
        System.out.println(make + " " + model + " " + engineCC + " " + color);
    }

    public static void main(String[] args) {
        Car car = new Car("Honda", "Accord", 1800, "White");
        car.printInfo();
    }
}

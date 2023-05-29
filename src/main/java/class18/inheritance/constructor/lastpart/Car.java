package class18.inheritance.constructor.lastpart;

public class Car {
    String make;
    String model;
    String color;
    int year;
    int engineCC;

    //1st
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //2nd
    public Car(String make, String model, String color, int year) {
        /*
        this.make = make;             do not repeat for these attributes inside this cnstr again
        this.model = model;           use  ->  this() from already existing cnstr e.g. 1st L11 here
        this.color = color;           => this() is -> method calling from from already existing cnstr e.g. 1st L11
         */
        // this(make, model, color); => this should be the first line in a constructor otherwise we will get error
        this(make, model, color);
        this.year = year;
    }

    public Car(String make, String model, String color, int year, int engineCC) {
        this(make, model, color, year);
        /*
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
         */
        this.engineCC = engineCC;

    }
}

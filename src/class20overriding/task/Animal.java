package class20overriding.task;
/*
    Create 3 animal classes(Dog,Cat,Horse) create 3 methods in each class. create
    3 fields and constructors as well in each class. Create the object of all 3 classes
    and call 2 methods from each class. Yuo must use inheritance to avoid code duplication
 */
public class Animal {
    String name;
    String color;
    String breed;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }

    void run() {
        System.out.println("Animal is running.");
    }

    void info() {
        System.out.println(name + " " + color + " " + breed);
    }

}

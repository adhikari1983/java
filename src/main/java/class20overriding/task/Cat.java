package class20overriding.task;

public class Cat extends Animal {

    double height;

    public Cat() {
    }

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    public Cat(String name, String color, String breed, double height) {
        super(name, color, breed);
        this.height = height;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping.");
    }

    void run() {
        System.out.println(this.name + " is running.");
    }

    void info() {
        System.out.println(name + " " + color + " " + breed + " " + height);
    }
}

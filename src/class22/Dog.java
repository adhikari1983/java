package class22;

abstract class Animal {
    private String name;
    private String color;
    private String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

}

class Cat extends Animal {

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("meow  meow..................");
    }

    @Override
    void eat() {
        System.out.println("Cat eats cat-food.");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep 10-12 hrs.");
    }
}

public class Dog extends Animal {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("woff  woff..................");
    }

    @Override
    void eat() {
        System.out.println("Dogs eat dog-food.");
    }

    @Override
    void sleep() {
        System.out.println("Dog sleeps 10 hrs.");
    }

}


class Horse extends Animal {

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("horse horse............");
    }

    @Override
    void eat() {
        System.out.println("Horses eat horse-food.");
    }

    @Override
    void sleep() {
        System.out.println("Horses sleep 8 hrs.");
    }
}

class AnimalTester {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Jack", "Black", "German"),
                new Cat("Kali", "White", "Persian"),
                new Horse("Marcus", "Brown", "American")
        };


        for (Animal animal : animals) {
            animal.printInfo();
            animal.eat();
            animal.speak();
            animal.sleep();
            System.out.println();
        }
    }
}
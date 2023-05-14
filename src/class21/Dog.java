package class21;

class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

    void speak() {
        System.out.println("Animal is speaking..................");
    }

    void sleep() {
        System.out.println("Animal is sleeping......................");
    }

    void eat() {
        System.out.println("Animal is eating..............");
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

    void run(){
        System.out.println("Dog runs fast.");
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
        Dog dog = new Dog("Jack", "Black", "German");
        dog.printInfo();

        //parent class variable can store the objects of the child class
        Animal dog1 = new Dog("Jack", "Black", "German");
        dog1.printInfo();

        Animal[] animals = {new Dog("Jack", "Black", "German"),
                new Cat("Kali", "White", "Persian")};

        for (int i = 0; i < animals.length; i++) {
            animals[i].printInfo();
        }

        for (Animal animal : animals) {
            animal.printInfo();
        }
    }
}
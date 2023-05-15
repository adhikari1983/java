package class19overloading.cnstr.vip.revise;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack","White", "German",10,40,50);
        Cat cat = new Cat("Kali","Black","Asian", 5, 15);
        Horse horse = new Horse("Bravo","White","American",10,200);

        dog.printInfo();
        cat.printInfo();
        horse.printInfo();
    }
}

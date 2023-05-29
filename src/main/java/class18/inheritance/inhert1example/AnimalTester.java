package class18.inheritance.inhert1example;

public class AnimalTester {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.eat();
        System.out.println(horse.color = "Black");

        Cat cat = new Cat();
        cat.name = "Kali";
        cat.sleep(); // inherited -> Animal class
        cat.speak(); // original -> Cat class
    }
}

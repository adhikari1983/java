package class21polymorphism;

public class E1Polymorphism {

    public static void main(String[] args) {
        Dog dog = new Dog("Bravo","White", "American");
        Cat cat = new Cat("Kali","Black","Asian");
        Horse horse = new Horse("Bravo", "Brown", "American");

        dog.speak();
        dog.eat();
        dog.sleep();
        System.out.println();

        cat.speak();
        cat.eat();
        cat.sleep();
        System.out.println();

        horse.eat();
        horse.speak();
        horse.sleep();

        // or loop it -> a better way
        /*Animal[] animals = new Animal[3];

        animals[0] = new Dog("Bravo","White", "American");
        animals[1] = new Cat("Kali","Black","Asian");
        animals[2] = new Horse("Bravo", "Brown", "American");*/

        Animal[] animals ={
                new Dog("Bravo","White", "American"),
                new Cat("Kali","Black","Asian"),
                new Horse("Bravo", "Brown", "American")
        };

        for (Animal animal: animals){
            animal.speak();
            animal.eat();
            animal.sleep();
        }

        Animal animal =  new Dog("Bravo","White", "American");
        //WWe must type cast the animal back to a dog to call the run method
        //as the run() method only exits in the Dog class
        Dog dog1 = (Dog) animal; //cast it to dog -> then only run() avail in ->Dog class<- only would be accessible.
        dog1.run();

        //direct way w/o using the variable
        ((Dog) animal).run();
    }
}

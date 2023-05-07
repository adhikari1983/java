package class17.constructor;

public class Dog {
    String name;
    String color;
    String breed;
    int age;


    public Dog(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age);
    }

    public static void main(String[] args) {
        /*   Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        dog1.name = "Dog1";
        dog2.name = "Dog2";
        dog3.name = "Dog3";
        dog4.name = "Dog4";
        dog5.name = "Dog5";

        dog1.breed = "Breed1";
        dog2.breed = "Breed2";
        dog3.breed = "Breed3";
        dog4.breed = "Breed4";
        dog5.breed = "Breed5";

        dog1.color = "Brown";
        dog2.color = "Green";
        dog3.color = "White";
        dog4.color = "Black";
        dog5.color = "Grey";

        dog1.age = 5;
        dog2.age = 7;
        dog3.age = 6;
        dog4.age = 8;
        dog5.age = 9;

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo()*/
        // create 4 more object & print info with all instance attributes
        // that's why we need constructor

        /*
            below code will create the object of the Dog class
            new Dog("jack","black","persian",12)
            new Dog()
        */

        Dog dog1 = new Dog("Jack", "Black", "American", 6);
        Dog dog2 = new Dog("shaggy", "white", "Huskey", 8);
        Dog dog3 = new Dog("Fluffy", "Black", "British", 7);
        Dog dog4 = new Dog("Pop", "Brown", "Asian", 6);
        Dog dog5 = new Dog("Henry", "Grey", "German", 6);

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();

    }
}

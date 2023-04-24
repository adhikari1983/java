package class12.objectintro.string.dog;

public class DogTester {
    public static void main(String[] args) {
        //In Java, an object is an instance of a class.
        // It is a basic unit of the OOPs paradigm
        //Class is generic / Object is specific

        Dog actualDog1 = new Dog();
        actualDog1.name = "Mat";
        actualDog1.age = 9;
        actualDog1.breed = "American";
        actualDog1.color = "white";
        actualDog1.weight = 10.5;

        //boolean fat = actualDog1.isFat;

        actualDog1.bark();
        actualDog1.eat();
        actualDog1.sleep();

    }
}

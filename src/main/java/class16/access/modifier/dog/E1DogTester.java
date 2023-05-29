package class16.access.modifier.dog;


public class E1DogTester {
    public static void main(String[] args) {
        E1Dog dog1 = new E1Dog();
        dog1.breed = "German";
        dog1.color = "Black";
        dog1.name = "Jack";

        E1Dog dog2 = new E1Dog();
        dog2.breed = "Persian";
        dog2.color = "White";
        dog2.name = "Sam";

        dog1.printInfo();
        dog2.printInfo();

        E1Dog.age =20;
        E1Dog.printInfo2();
        dog1.age = 30; // bad practice

        //E1Dog.printInfo()
        E1Dog.printInfo2();  // independent of object of class , that's why there is no object ref in static method
                              // like           dog2.printInfo();         from E1Dog class's object dog2
    }

}

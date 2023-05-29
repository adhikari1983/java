package class18.inheritance.constructor.lastpart;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    //1st
    public Dog(String name, String color, String breed, int age, double weight) {
        //assigning the parameter(input as arguments from user) to the instance variable explicitly with this keyword
     /* this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
     */
        // calling the constructor from the class which takes -> name, color, breed, age <-  as parameter
        this(name, color, breed, age);
        this.weight = weight;

    }
    //2nd
    public Dog(String name, String color, String breed, int age) {
       /* this.name = name;
        this.color = color;
        this.breed = breed;*/
        this(name, color, breed); // compacting the constructor by re-using 3rd constructor
        this.age = age;           // constructor is calling constructor
    }

    //3rd
    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    /*
    So 2nd cnstr parameter is already defined in the 1st one than always reuse it with this keyword
    e.g. this(name, color, breed);

    if piece of code is already present in 1st constructor than you shouldn't be re-writing it again
     */
}

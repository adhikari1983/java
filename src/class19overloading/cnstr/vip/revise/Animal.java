package class19overloading.cnstr.vip.revise;

public class Animal {
    // create 3 classes like Dog Cat Horse define 5 properties in each class
    // and one printInfo method that will print the values of these variables.
    // create constructors as well in each child class to initialize those
    // properties create one object of each class and call the printInfo method
    private String name;
    private String color;
    private String breed;
    private int age;
    private double weight;

    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age + " " + weight);
    }
}

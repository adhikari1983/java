package class19overloading.cnstr.vip.revise;

public class Cat extends Animal{

    public Cat(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }

    @Override
    void printInfo() {
        super.printInfo();
    }
}

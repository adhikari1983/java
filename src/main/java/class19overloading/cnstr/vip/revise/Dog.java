package class19overloading.cnstr.vip.revise;

public class Dog extends Animal {
    double price;

    public Dog(String name, String color, String breed, int age, double weight, double price) {
        super(name, color, breed, age, weight);
        this.price = price;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(price);
    }


}

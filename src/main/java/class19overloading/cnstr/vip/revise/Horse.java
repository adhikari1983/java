package class19overloading.cnstr.vip.revise;

public class Horse extends  Animal{

    public Horse(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }

    @Override
    void printInfo() {
        super.printInfo();
    }
}

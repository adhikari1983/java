package class20overriding.task;

public class Dog extends Animal {

    double weight;

    public Dog() {
    }

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    public Dog(String name, String color, String breed, double weight) {
        super(name, color, breed);
        this.weight = weight;
    }

    @Override          //it is a feature of JAVA language (not an IDE component/feature)
    void eat() {
        System.out.println(this.name + " is eating.");
    }

    @Override                    // extra check to follow all the rule of overriding
    void sleep() {
        System.out.println(this.name + " is sleeping 10.6 hrs a day.");
    }

    //@Override                  after commenting   @Override
    void sleep(int number) { // change parameter -> it will be diff method -> and this can be possible
        System.out.println(this.name + " is sleeping 10.6 hrs a day.");
    }


    @Override                  // checks the parameter -> it's an annotation
    void run() {
        System.out.println(this.name + " is running.");
    }

    void info() {
        System.out.println(name + " " + color + " " + breed + " " + weight);
    }
}

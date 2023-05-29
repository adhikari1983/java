package class20overriding.task;

class Horse extends Animal {
    boolean isProfessional;

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    public Horse(String name, String color, String breed, boolean isProfessional) {
        super(name, color, breed);
        this.isProfessional = isProfessional;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping.");
    }

    void run() {
        System.out.println(this.name + " is running.");
    }

    void info() {
        System.out.println(name + " " + color + " " + breed + " " + isProfessional);
    }
}
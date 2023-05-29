package class17.constructor;

public class Cat{
    String name;

    Cat(String name) {
        this.name = name;
        System.out.println("Constructor is called -> with 1/name argument");
    }

    Cat() {
        System.out.println("Constructor is called -> 0 argument");
    }


    Cat(int age) {
        System.out.println("Constructor is called -> with 1/age argument");
    }

    Cat(double weight) {
        System.out.println("Constructor is called -> with 1/weight argument");
    }
    /*  -> because this constructor already exist.
    Cat(double weight) {
        System.out.println("Constructor is called -> with 1/weight argument");
    }
     */
    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat(5.0);

        cat.printInfo();
    }
}
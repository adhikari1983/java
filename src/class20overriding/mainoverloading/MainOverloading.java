package class20overriding.mainoverloading;

public class MainOverloading {
    public static void main(String[] args) {
        main();
        main(5);
    }

    public static void main() {
        System.out.println("No parameter main method");
    }

    public static void main(int number) {
        System.out.println("Parameterized main method");
    }
}

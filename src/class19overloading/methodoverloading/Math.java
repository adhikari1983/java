package class19overloading.methodoverloading;

public class Math {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a,double b) {
        System.out.println(a + b);
    }

    static void add(double a, int b) {
        System.out.println(a + b);
    }

    static void add(double a, double b) {
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        add(1,2);
        add(10,10.5);
        add(10.5,10);
        add(10.5,10.5);
    }
}

package class13a.method.math;

public class Math {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    void divide(double num1, double num2) {
        System.out.println(num1 / num2);
    }

    public static void main(String[] args) {
        //creating the object of math class calling math
        Math math = new Math();

        //calling the methods and passing values
        math.add(1, 2);
        math.subtraction(3, 2);
        math.multiply(2, 5);
        math.divide(3, 2);
    }
}

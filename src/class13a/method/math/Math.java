package class13a.method.math;

public class Math {
   public static int add(int num1, int num2) {
       int sum =  num1 + num2;
       return sum;
    }

    public static int subtraction(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    public static int multiply(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    public static double divide(double num1, double num2) {
        double div = num1 / num2;
        return div;
    }

    public static void main(String[] args) {
        //creating the object of math class calling math
        //Math math = new Math();

        //calling the methods and passing values
        //math.add(1, 2);
        //math.subtraction(3, 2);
        //math.multiply(2, 5);
        //math.divide(3, 2);

        //after making methods static, we have to print in main class -> sout like here below
        System.out.println(add(1,2));;
        System.out.println( subtraction(5,2));;
        System.out.println(multiply(2,3));;
        System.out.println(divide(5,2));;

    }
}

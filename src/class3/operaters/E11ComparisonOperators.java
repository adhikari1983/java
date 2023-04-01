package class3.operaters;

public class E11ComparisonOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 > num2); //false
        System.out.println(num1 < num2); //true

        boolean result = num1 > num2;
        System.out.println(result);
        System.out.println(num1 == num2); //false
        System.out.println(num1 != num2); //true
        System.out.println(num1 >= num2); //false     greater than(>) or equal to (=)  ->  >=
        System.out.println(num1 <= num2); //true      less than   (<) or equal to (=)  ->  <=
    }
}

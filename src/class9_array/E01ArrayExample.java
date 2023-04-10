package class9_array;

import java.util.Arrays;

public class E01ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {30, 40, 50, 90, 70 };

        // When we try to access an element using an index which does not exist
        // ArrayIndexOutOfBoundsException
        // System.out.println(numbers[20]);
        System.out.println(numbers[1]);


        for (int i = 0; i < numbers.length; i++) {   // regular for lop
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n---------------");

        for (int number: numbers) {                 // enhanced for loop
            System.out.print(number + " ");
        }
        System.out.println("\n-----------------");
                                                    // lambda expression
        Arrays.stream(numbers).forEach(number -> System.out.print(number + " " ));

        // to find the size of an array
        // numbers.length gives us the total count of elements in an array
        System.out.println("\n" + numbers.length);
    }
}

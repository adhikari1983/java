package zzselfpractice1.loops;

import java.util.Arrays;

public class ForLoopsType {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello World");
        }
        System.out.println("******************************");
        String[] message = {"Hello World"};
        for (String value : message) {
            for (int i = 0; i < 2; i++) {
                System.out.println(value);
            }
        }

        int[] array = {1, 2, 3, 4, 5};

        for(int numbers: array){
            System.out.println(numbers);
        }

        Arrays.stream(array).forEach(result -> System.out.print(result + " "));
    }
}

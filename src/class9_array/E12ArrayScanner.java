package class9_array;

import java.util.Scanner;

public class E12ArrayScanner {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number : ");
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

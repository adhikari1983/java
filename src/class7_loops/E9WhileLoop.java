package class7_loops;

import java.util.Scanner;

public class E9WhileLoop {
    public static void main(String[] args) {
        //ask the user for a number than print all the numbers from 1 to that number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();  //10

        int counter = 1;
        while (counter <= number) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}

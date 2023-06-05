package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E8Finally {
    /**
      The finally block is useful for cleaning up resources such as files or network connections,
     that should be closed no matter what happens (whether there is an exception or not) in the
     try block. It ensures that the block of code inside it is executed no matter what exceptions
     occur.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch. Please enter an integer.");
        } finally {
            // Close the scanner to release system resources
            scanner.close();
        }
    }
}

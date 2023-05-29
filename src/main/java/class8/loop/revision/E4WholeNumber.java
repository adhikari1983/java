package class8.loop.revision;

import java.util.Scanner;

public class E4WholeNumber {
    public static void main(String[] args) {
        //ask user to enter numbers if user enters any number,
        // other than -1 "Try again" and keep asking the user for a number
        //the moment user enters the number -1 the loop should stop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int count = scanner.nextInt();
        while (count != -1) {
            System.out.println("Hello World");
            count = scanner.nextInt();
        }
    }
}

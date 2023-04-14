package class8.loop.revision;

import java.util.Scanner;

public class E2WholeNumber {
    public static void main(String[] args) {
        //to print all whole numbers point to ending point
        //ask the user starting and ending number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting point : ");
        int start = scanner.nextInt();
        System.out.println("Please enter the ending point : ");
        int end = scanner.nextInt();
        // start = 15;
        // end = 30;
        int number = start;
        while (number <= end) {
            System.out.print(number + " ");
            number++;
        }
    }
}

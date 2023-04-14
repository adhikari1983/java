package class8.loop.revision;

import java.util.Scanner;

public class E3WholeNumber {
    public static void main(String[] args) {
        //print all whole numbers, ask the user starting and ending number
        //and step up the number by user's choice as well
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting point : ");
        int start = scanner.nextInt();
        System.out.println("Please enter the ending point : ");
        int end = scanner.nextInt();
        int step = scanner.nextInt();


        int counter = start;
        while (counter <= end) {
            System.out.print(counter + " ");
            counter += step;
        }
    }
}

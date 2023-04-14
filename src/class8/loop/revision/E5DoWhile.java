package class8.loop.revision;

import java.util.Scanner;

public class E5DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int count = scanner.nextInt();

        do {
            System.out.println("Try Again");
            count = scanner.nextInt();
        } while (count != -1);

    }
}

package selfpractice1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter your full name please.");
        String name = scanInput.nextLine();
        System.out.println("Enter your age now.");
        int age = scanInput.nextInt();
        System.out.println("What is your opinion about this Syntax Bootcamp ? ");
        String opinion = scanInput.next();
        opinion += scanInput.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(opinion);

    }
}

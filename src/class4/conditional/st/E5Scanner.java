package class4.conditional.st;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please. ");
        String name = scanner.next();
        if (name.equals("Jack")) {
            System.out.println("Windows user");
        } else if (name.equals("Mack")) {
            System.out.println("Desktop user");
        } else if (name.equals("Rack")) {
            System.out.println("Mobile user");
        } else if (name.equals("Tom")) {
            System.out.println("Mac user");
        }
    }
}

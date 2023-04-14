package class6.switchs.logical;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of day .");
        int day = scanner.nextInt();
        //int day = 2;

        String result = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            default -> "Invalid";
        };
        System.out.println(result);
    }
}

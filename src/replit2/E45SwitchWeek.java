package replit2;

import java.util.Scanner;

public class E45SwitchWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1-7 to find the day : ");
        int number = scanner.nextInt();

        String day = " ";
        switch (number) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid Input";
                break;
        }
        System.out.println(day);
    }
}

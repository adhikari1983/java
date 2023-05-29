package zzselfpractice1.misc;
import java.util.Scanner;

public class MonthsByNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of the month");
        int numberOfMonth = scan.nextInt();

        switch (numberOfMonth) {
            case 1:
                System.out.println("This is the month of January.");
                break;
            case 2:
                System.out.println("This is the month of February. ");
                break;
            case 3:
                System.out.println("This is the month of March. ");
                break;
            case 4:
                System.out.println("This is the month of April. ");
                break;
            case 5:
                System.out.println("This is the month of May. ");
                break;
            case 6:
                System.out.println("This is the month of June. ");
                break;
            case 7:
                System.out.println("This is the month of July. ");
                break;
            case 8:
                System.out.println("This is the month of August. ");
                break;
            case 9:
                System.out.println("This is the month of September. ");
                break;
            case 10:
                System.out.println("This is the month of October. ");
                break;
            case 11:
                System.out.println("This is the month of November");
                break;
            case 12:
                System.out.println("This is the month of December. ");
                break;
            default:
                System.out.println("Invalid input. ");
        }
    }
}

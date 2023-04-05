package replit2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.print(num1 + " " + num2 + " " + num3);

        int largestNum;
        if (num1 > num2) {
            largestNum = num1;
        } else {
            largestNum = num2;
            if (num3 > largestNum) {
                largestNum = num3;
            }
        }
        System.out.println("The largest number is " + largestNum);
    }
}

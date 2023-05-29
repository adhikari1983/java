package zzselfpractice1.armstrong.number;

import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether \nit is Armstrong number or not : ");
        int numberToCheck = scanner.nextInt();  //153

        int temp = numberToCheck;
        int sum = 0;

        while(temp > 0){
            int lastDigit = temp % 10;
            sum +=Math.pow(lastDigit,3);
            temp /= 10;
        }
        if(sum == numberToCheck){
            System.out.println(sum + " is an Armstrong number.");
        }
        else{
            System.out.println(sum + " is not an Armstrong number.");
        }
    }
}

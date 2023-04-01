/*
An Armstrong number, also known as a narcissistic number, is a number that is equal to
the sum of its own digits raised to the power of the number of digits.
For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
package selfpractice1.armstrong.number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether \nit is Armstrong number or not : ");
        int numberToCheck = scanner.nextInt();  //153

        int temp = numberToCheck;
        int sum = 0;
        while (temp > 0){                                          //3rd      2nd                1st      before start
            int lastDigit = temp % 10;                             //1          5               3        153

            sum += Math.pow(lastDigit,3);                          //1*1*1      5*5*5            3*3*3
            temp /= 10;                                            //            1                 15

        }
        if(sum == numberToCheck){
            System.out.println(numberToCheck + " is Armstrong number. ");
        }
        else{
            System.out.println(numberToCheck + " is not Armstrong number. ");
        }
    }
}

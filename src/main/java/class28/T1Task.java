/*
    How would handle InputMismatchException?
    Input Mismatch Exception when user enters mismatch value
    then programmer expected
 */
package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T1Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        try {
            int inPut = scanner.nextInt();
            System.out.println(inPut);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch while taking input from scanner. Please enter an integer.");
        }
    }
}

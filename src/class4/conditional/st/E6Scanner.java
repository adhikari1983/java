package class4.conditional.st;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you salary amount. ");
        int salary = scanner.nextInt();
        if(salary > 100000){
            System.out.println("Pretty decent job for current inflation ratio.");
        }else{
            System.out.println("Find better job period.");
        }

    }
}

package replit2;

import java.util.Scanner;

public class E39ReplitGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark = scanner.nextInt();

        char grade = ' ';
        if (mark >= 1 && mark <= 25) {
            grade = 'F';
        } else if (mark >= 26 && mark <= 45) {
            grade = 'E';
        } else if (mark >= 46 && mark <= 50) {
            grade = 'D';
        } else if (mark >= 51 && mark <= 60) {
            grade = 'C';
        } else if (mark >= 61 && mark <= 80) {
            grade = 'B';
        } else if (mark > 80 && mark <= 100) {
            grade = 'A';
        } else {
            System.out.println("Please enter valid mark");
            return;
        }

        System.out.println("Your grade is " + grade);
    }
}

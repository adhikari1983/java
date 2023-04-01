package class4_conditional_st;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender");
        char findCharacter = scanner.next().charAt(0);

        System.out.println("your gender first character  is "  + findCharacter );
    }
}

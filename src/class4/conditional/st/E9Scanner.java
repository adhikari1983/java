package class4.conditional.st;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String sentence = scanner.next();    to take only one word at a time.
        String sentence = scanner.nextLine(); //to take one than one word -> takes complete line


        System.out.println(sentence );
    }
}

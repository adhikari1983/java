/*
Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
and make the comparisons:

- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"
 */
package replit2;

import java.util.Scanner;

public class E37Replit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean b1 = scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean b2 = scanner.nextBoolean();

        String drink = " ";
        if (b1 && !b2) {
            drink = "water";
        } else if (b1 && b2) {
            drink = "coffee";
        } else if (!b1 && b2) {
            drink = "tea";
        } else {
            drink = "nothing";
        }
        System.out.println("Looks like you need to drink " + drink);
    }
}

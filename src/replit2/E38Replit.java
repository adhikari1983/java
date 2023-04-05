/*
Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
and make the comparisons:

- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"
 */
package replit2;

import java.util.Scanner;

public class E38Replit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean answer = scanner.nextBoolean();

        String subject = "";
        if (answer) {
            subject = "Java";
        } else {
            subject = "manual testing";
        }
        System.out.println("Today you will be learning " + subject);

    }
}

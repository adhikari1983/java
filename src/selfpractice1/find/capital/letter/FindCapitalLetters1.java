package selfpractice1.find.capital.letter;

import java.util.Scanner;

public class FindCapitalLetters1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence . ");  // The Name Of The Programmer is NITESH .
        String sentence = scanner.nextLine();

        System.out.println(sentence);
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char charToCheck = sentence.charAt(i);        // 97 -122 -> a-z
            if (charToCheck >= 65 && charToCheck <= 90) {  // 65 - 90 -> A-Z
                upperCase++;
            } else { //if (charToCheck >= 97 && charToCheck <= 122){
                if (charToCheck != ' ') {
                    lowerCase++;
                }
            }
        }
        System.out.println("Uppercase letters count is : " + upperCase);
        System.out.println("Lowercase letters count is : " + lowerCase);
    }
}

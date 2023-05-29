package zzselfpractice1.find.capital.letter;

public class FindCapitalLetters2 {
    public static void main(String[] args) {
        // A - Z  -> (65 - 90)  // a - z  -> (97 - 122)
        String sentence = "The Name Of The Programmer is NITESH .";

        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < sentence.length() ; i++) {
            char charToCheck = sentence.charAt(i);
            if(Character.isUpperCase(charToCheck)){
                upperCase++;
            }
            else if(Character.isLowerCase(charToCheck)){
                lowerCase++;
            }
        }

        System.out.println("Uppercase letters count is : " + upperCase);
        System.out.println("Lowercase letters count is : " + lowerCase);
    }
}

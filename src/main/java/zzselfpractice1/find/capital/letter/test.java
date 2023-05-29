package zzselfpractice1.find.capital.letter;

public class test {
    public static void main(String[] args) {

        String sentence = "Welcome To AutomatioN";

        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < sentence.length() ; i++) {
            char charToCheck = sentence.charAt(i);
            if(charToCheck >= 65 && charToCheck <= 90){
                upperCase++;
            }
            else {
                if(charToCheck != ' '){
                    lowerCase++;}
            }
        }

        System.out.println("Uppercase letters count is : " + upperCase);
        System.out.println("Lowercase letters count is : " + lowerCase);
    }
}

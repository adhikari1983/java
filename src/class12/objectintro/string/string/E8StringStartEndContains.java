package class12.objectintro.string.string;

import java.util.Locale;

public class E8StringStartEndContains {

    public static void main(String[] args) {
        String sentence = "Java is very very easy";

        System.out.println(sentence.startsWith("Java"));
        System.out.println(sentence.contains("Java"));
        System.out.println(sentence.endsWith("easy"));

        //method channing & it is possible in String class
        //method channing is calling multiple methods on the same line
        sentence = sentence.trim().toLowerCase();
        System.out.println(sentence.startsWith("java") +  " -> "+" checking with small letter java ");


    }
}

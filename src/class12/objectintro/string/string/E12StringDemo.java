package class12.objectintro.string.string;

public class E12StringDemo {
    public static void main(String[] args) {
        String sentence = "It is raining today";

        //starts from space at index 5
        System.out.println(sentence.substring(5));
        //starts from 'r' at index 6
        System.out.println(sentence.substring(6));
        //starts from index 6 - index 13 exclusive (index 13 -1)
        System.out.println(sentence.substring(6, 13));

        //last 5 letters
        System.out.println(sentence.substring(sentence.length() - 5));
    }
}

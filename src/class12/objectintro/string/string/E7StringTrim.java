package class12.objectintro.string.string;

public class E7StringTrim {
    public static void main(String[] args) {

        String sentence = "                     Java is fun to learn.          ";

        // but it doesn't trim the space between the word coz that space actually count as string index[]

        System.out.println("before trimming.........................");
        System.out.println(sentence);
        System.out.println("after trimming..........................");
        System.out.println(sentence.trim());
    }
}

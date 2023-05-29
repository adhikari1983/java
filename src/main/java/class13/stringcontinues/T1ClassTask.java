package class13.stringcontinues;

public class T1ClassTask {
    //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
    public static void main(String[] args) {
        String str = "Today is Sunday. We have Java class! We like Java?";

        System.out.println(str.replace(" ", ""));

        //replaceAll
        System.out.println(str.replaceAll("[ ]", ""));
    }
}

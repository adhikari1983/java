package class13.stringcontinues;

public class E4StringSplit {
    public static void main(String[] args) {
        //String str = "Today is Sunday. We have Java class. We like Java.";
        String str = "Today is Sunday. We have Java class! We like Java?";

        //String[] split = str.split("[.]");
        String[] split = str.split("[.!?]");

        //before we iterate the elements of the split array, we can also this
        System.out.println(split.length);
        System.out.println(split[0]);
        System.out.println(split[2]);
        //to remove the space in the beginning
        System.out.println(split[2].trim());

        for (String result : split) {
            System.out.print(result + " ");
        }
    }
}

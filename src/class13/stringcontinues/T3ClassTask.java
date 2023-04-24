package class13.stringcontinues;

public class T3ClassTask {
    public static void main(String[] args) {
        /*
        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?
         */

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";

        String[] splitArray = a.split("[?]");

        System.out.println(splitArray.length);
        for (String s : splitArray) {
            System.out.println(s);
        }
    }
}

package class13.stringcontinues;

public class E6StringBuilderContinue {
    public static void main(String[] args) {
        // Can't mute the String
        String str = "Wife";
        str.toLowerCase();
        System.out.println(str);

        //Can mute the StringBuilder
        StringBuilder str2 = new StringBuilder("Husband");
        str2.reverse();
        System.out.println(str2);

    }
}

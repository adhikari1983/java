package class13.stringcontinues;

public class E5StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Java");
        System.out.println(str.reverse());

        String str1 = "Computer";
        StringBuilder str2 = new StringBuilder(str1);
        StringBuilder str3 = str2.reverse();
        System.out.println(str3);

        //same thing as L11
        System.out.println("............");
        System.out.println(str3.toString());
    }
}

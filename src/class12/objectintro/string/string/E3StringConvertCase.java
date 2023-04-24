package class12.objectintro.string.string;

import java.util.Locale;

public class E3StringConvertCase {
    public static void main(String[] args) {

        String name = "kiran";
        String name1 = "KIRAN";

        String upperCase = name.toUpperCase();
        System.out.println("Uppercase= " + upperCase);

        String lowerCase = name.toLowerCase();
        System.out.println("LowerCase = " + lowerCase);

    }
}

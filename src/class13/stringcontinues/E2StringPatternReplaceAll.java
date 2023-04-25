package class13.stringcontinues;

public class E2StringPatternReplaceAll {
    public static void main(String[] args) {
        String str = "njkaSDFDFD12349!@#$%";
        System.out.println(str.replaceAll("[a-z]", "*"));
        // range needs to fall in between [m-u]
        System.out.println(str.replaceAll("[m-u]", "*"));


        System.out.println(str.replaceAll("[A-Z]", "#"));
        // range needs to fall in between [G-P]
        System.out.println(str.replaceAll("[G-P]", "#"));

        System.out.println(str.replaceAll("[0-9]", "%"));

        System.out.println(str.replaceAll("[a-z0-9]", "%"));

        System.out.println(str.replaceAll("[a-zA-Z0-9]", "%"));

        char c = 'A';
        char b = 'a';
        int casted1 = (int)c;
        System.out.println("casted1 = " + casted1);
         int casted = (int)b;
        System.out.println("casted = " + casted);
        c++;
        System.out.println(c);
        System.out.println("____________");
        for (int i = 0; i <25; i++) {
            System.out.print(c++ + " ");

        }

    }
}

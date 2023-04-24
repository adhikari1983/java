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
        c++;
        System.out.println(c);
        for (int i = 0; i <10; i++) {
            System.out.print(c++ + " ");

        }

    }
}

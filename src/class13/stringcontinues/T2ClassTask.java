package class13.stringcontinues;

public class T2ClassTask {
    /*
    Create a String that should be combination of letters, numbers and special characters.
     Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
     */
    public static void main(String[] args) {
        String str = "njkaSDFDFD12349!@#$%";

        System.out.println(str.length());

        // Removing  -> Alphanumeric(abd AZ 284) characters
        //System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        //System.out.println(str.replaceAll("[^a-zA-Z0-9]", "").length());

        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}

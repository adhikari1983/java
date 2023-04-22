package class12.objectintro.string;

public class E6StringEquals {

    public static void main(String[] args) {
        String firstName = "KIRAN";

        System.out.println(firstName.equals("Kripa"));
        System.out.println(!firstName.equals("Kripa"));
        System.out.println(firstName.equals("KIRAN"));
        System.out.println(firstName.equalsIgnoreCase("kiran"));

    }

}

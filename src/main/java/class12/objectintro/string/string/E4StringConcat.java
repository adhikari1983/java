package class12.objectintro.string.string;

public class E4StringConcat {
    public static void main(String[] args) {
        String firstName = "Kiran";
        String lastName = "Adhikari";
        String middleName = null;

        System.out.println(firstName + " " + lastName); // Most widely used approach -> easy and convenient way

        String concat = firstName.concat(lastName);     // Rarely see this way -> lot of complication
        System.out.println("concatenated name = " + concat);


        String concat2 = firstName.concat(middleName);
        System.out.println("concat2 = " + concat2);//Exception in thread "main" java.lang.NullPointerException
    }
}

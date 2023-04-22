package class12.objectintro.string;

public class E1StringClassIntro {
    public static void main(String[] args) {
        // to reuse the attributes & behaviours, 1st create the object of the class
        // mostly used class in Java - programming
        String string1 = new String("Kiran");

        String string = "Kripa Adhikari"; //most widely used one

        System.out.println(string.length()); // there are 5-letters in Kripa

        if(string.length() > 5 ){
            System.out.println("Only 5 characters are allowed");
        }
    }
}

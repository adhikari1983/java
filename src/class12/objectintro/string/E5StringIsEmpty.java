package class12.objectintro.string;

public class E5StringIsEmpty {
    public static void main(String[] args) {
        String name = " "; // 2 -ways to find out   a-> check length   or  b-> use isEmpty(); method

        System.out.println(name.isEmpty()); // checks only chars , numbers but won't check the spaces

        System.out.println(name.isBlank()); // it checks the spaces as well
        // isBlank() is more accurate though
    }
}

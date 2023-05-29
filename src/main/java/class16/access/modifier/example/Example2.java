package class16.access.modifier.example;

public class Example2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public static String reverseString(String word){

        String reversed =" ";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }


    public static void main(String[] args) {
        System.out.println(Example2.reverseString("practice"));
    }
}

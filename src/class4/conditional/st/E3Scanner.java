package class4.conditional.st;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        /* Scanner   => is a Class( which knows how to take input from the keyboard)
           scan      => is a variable of type scan( non-primitive data type)
           new       => is special keyword which create the Object of the Class
           Scanner again with()
           System.in => means we want to use the Scanner class for taking the user input */
        //whenever we need to take the input from the user (via keyword) we need this code
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name. ");
        //calling the next() method to take the String input from the user
        String name = scan.next();
        System.out.println("You are studying hard " + name);

    }
}

package class12.objectintro.string.string;

import java.util.Scanner;

/*
    Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
    Password should be minimum 8 characters, if less → message=”Password is too short”.
    Password cannot contain username if so, → message=”Password cannot contain username”.
    Password should match confirmed password, if not  → message=“Passwords do not match”.
    -> Only after all requirements met → message “Your username and password has been created”
*/
public class E9StringClassTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username ");
        String scanName = scanner.nextLine();
        System.out.println("Enter password");
        String scanPass = scanner.nextLine();

        //password to confirm
        String confirmPassword = "pass1234";
/*
    I could have use only the if blocks but that is not efficient coz it has to check condition
    1 by 1, execution takes long time. -> only on if blocks
    Let's say even it does match  1 or 2 or 3 (out of 4 condition) and doesn't match 4th if block still
    the else at the end will print out even if other conditions are not met. -> if blocks
*/
        if (scanName.isBlank() || scanPass.isBlank()) {
            System.out.println("Username or Password cannot be empty");
        } else if (scanPass.length() < 8) {
            System.out.println("Password is too short ");
        } else if (scanPass.contains(scanName)) {
            System.out.println("Password cannot contain username");
        } else if (!scanPass.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}

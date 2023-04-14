package class4.conditional.st;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please. ");
        String name = scanner.next();
        if(name.equals("Jack")){
            System.out.println("Window user");
        }else {
            System.out.println("Mac user");
        }
    }
}

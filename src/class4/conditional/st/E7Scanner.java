package class4.conditional.st;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you are Hungry enter true/false ");
        boolean reply = scanner.nextBoolean();

        if(reply){
            System.out.println("Let's order Pizza.");
        }else{
            System.out.println("Let's practice Java");
        }

    }
}

package class5.nestedif;

import java.util.Scanner;

public class E2if {
    public static void main(String[] args) {
        //Below code helps us to get any type of the data from the console.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Is it time for break true/false");
        boolean isBreak = userInput.nextBoolean();
        if(isBreak){
            System.out.println("Lets have a break.");
        }
    }
}

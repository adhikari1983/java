package class7.loops;

import java.util.Scanner;

public class E11ForLoop {
    public static void main(String[] args) {
        //print all the even numbers from 2 to 10
        for (int i = 2; i <= 10; i+=2) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

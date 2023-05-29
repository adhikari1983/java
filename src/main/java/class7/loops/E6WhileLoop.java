package class7.loops;

public class E6WhileLoop {
    public static void main(String[] args) {

        int counter = 1;       // 1 2 4 5 7 8 10 11 13   ->  multiple of 3
        while (counter <= 20) {
            if(counter %3 != 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}
/*
A multiple of 3 is any number that can be evenly divided by 3 without leaving a remainder. I
n other words, if a number is a multiple of 3, it can be expressed as 3 times some other whole number.

For example:

6 is a multiple of 3 because 6 divided by 3 equals 2 with no remainder: 6 = 3 x 2
21 is a multiple of 3 because 21 divided by 3 equals 7 with no remainder: 21 = 3 x 7
48 is a multiple of 3 because 48 divided by 3 equals 16 with no remainder: 48 = 3 x 16
On the other hand, some numbers are not multiples of 3. For example, 8 is not a multiple of 3
because 8 divided by 3 equals 2 with a remainder of 2.
 */

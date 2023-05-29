package class12.objectintro.string.string;

import java.lang.reflect.Array;

public class E11StringIndex {
    public static void main(String[] args) {
        String sentence = "Today is Saturday";

        System.out.println(sentence.indexOf('i'));
        // if there is more than one same letter than it gives the -> "Very first one"

        System.out.println(sentence.indexOf('a'));

        //start searching from index 4
        System.out.println(sentence.indexOf('a', 4));
        System.out.println();

        //print the index number of a
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                System.out.print(i + " ");
                //System.out.print(sentence.charAt(i) +" ");
            }
        }
        System.out.println("\n...................");
        //To find the positions of all occurrences of the letter 'a' in the given string -> with while loop
        String given = "I love Java classes at Syntax";
        int index = given.indexOf('a');                           // Find the first occurrence of 'a'
        while (index >= 0) {                                      // Keep looping until no more 'a' is found
            System.out.println("Found 'a' at position " + index);
            index = given.indexOf('a', index + 1);    // Find the next occurrence of 'a'
        }

        String string = "I love Java classes at Syntax it's fun to learn.";
        /* i represent index value like -> int  indexValue (in while loop)
        //    initialization;       condition;   increment;  (instead, like -> i++, i--, i+=2, i-=2 operator
                                                                               i = string.indexOf('a', indexValue + 1) */
        for (int i = string.indexOf('a'); i >= 0; i = string.indexOf('a', i + 1)) {
            System.out.println("Found at position " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < numbers.length; i += 2) { // forOddNumber -> coz 0th index is starting of the odd number
            System.out.print(numbers[i] + " ");      // forEvenNumber -> coz 1st index is starting of the even number
        }
    }
}

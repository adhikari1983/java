/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
package class24;

import java.util.ArrayList;

public class T1ArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Kumar");
        names.add("Harold");
        names.add("Biden");
        names.add("Kiran");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Kiran"));
        System.out.println(names.size());

        for (String name : names) {
            System.out.print( name + " ");
        }
    }
}

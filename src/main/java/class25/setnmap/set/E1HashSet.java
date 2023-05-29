package class25.setnmap.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class E1HashSet {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // allow duplicates
        // names.get(int index) -> method available
        names.add("Kiran");
        names.add("Kiran");
        names.add("Kiran");
        System.out.println(names);

        /** can't use index forLoop, while Loop, do while loop  -> but can for enhanced for loop*/
        Set<String> uniqueColor = new java.util.HashSet<>();
        // 1. HashSet doesn't allow duplicate
        uniqueColor.add("Yellow");
        uniqueColor.add("Yellow");
        uniqueColor.add("Yellow");
        // 2. HashSet doesn't maintain the insertion order
        uniqueColor.add("green");
        uniqueColor.add("red");
        //output -> [red, green, Yellow]
        // 3. names.get(int index) -> method available

        System.out.println(uniqueColor);

        for (String color : uniqueColor) {
            System.out.println(color);
        }
    }
}

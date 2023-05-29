package class25.setnmap.set;

import java.util.LinkedHashSet;

public class E2LinkedHashSet {
    public static void main(String[] args) {
        //still no duplicate, but it will maintain the order -> retains the insertion order
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println(fruits);
    }
}

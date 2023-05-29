package class25.setnmap.set;

import java.util.TreeSet;

public class E3TreeSet {
    public static void main(String[] args) {
        //still no duplicate, but it will maintain the order -> retains the insertion order
        //          BUT THIS TIME ITS SORTS OUT ACCORDINGLY => follows ASCII table
       TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Banana");


        System.out.println(fruits);
    }
}

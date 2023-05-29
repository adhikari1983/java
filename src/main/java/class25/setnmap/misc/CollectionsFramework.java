package class25.setnmap.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionsFramework {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Banana");

        //conversion of form to another
        //list -> set
        HashSet<String> hashSet = new HashSet<>(fruits);
        System.out.println(hashSet);

        //
        LinkedList<String> linkedList = new LinkedList<>(hashSet);
        System.out.println(linkedList);

    }
}

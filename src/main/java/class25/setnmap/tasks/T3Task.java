package class25.setnmap.tasks;

import java.util.LinkedHashSet;

/*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
 */
public class T3Task {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Springfield");
        cities.add("Annandale");
        cities.add("New York");
        cities.add("Mumbai");
        cities.add("Mclean");
        cities.add("Tokyo");
        cities.add("Agra");

        System.out.println(cities);
        System.out.println("After removing any city that starts with “A” ");
       cities.removeIf(x -> x.startsWith("A"));
        System.out.println(cities);
    }
}

package class25.setnmap.tasks;

import java.util.TreeSet;

public class T2Task {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Nepal");
        countries.add("Nepal");
        countries.add("USA");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Spain");
        countries.add("Spain");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("India");
        countries.add("Peru");
        countries.add("Austria");
        countries.add("Vietnam");

        System.out.println(countries);
        for (String country : countries) {
            System.out.print(country + " ");
        }
    }
}

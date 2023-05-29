/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop
Print all values from a country map using for each loop
 */
package class26;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class T2Task {
    public static void main(String[] args) {
        TreeMap<String, String> countryList = new TreeMap<>();

        countryList.put("USA", "Washington DC");
        countryList.put("Nepal", "Kathmandu");
        countryList.put("China", "Beijing");
        countryList.put("Japan", "Tokyo");
        countryList.put("Austria", "Vienna");
        countryList.put("England", "London");

        //entrySet
        // Set<Map.Entry<String, String>> entrySet = countryList.entrySet();
        var entrySet = countryList.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // var approach is better -> when data gets long & complicated = Map.Entry<String, String>
        // try to use var like this always
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        Set<String> strings = countryList.keySet();
        for (String string : strings) {
            System.out.print(string + " ");
        }

        Collection<String> values = countryList.values();
        for (String value : values) {
            System.out.print(value + " ");
        }
    }
}

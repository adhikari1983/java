package class25.setnmap.map;

import java.util.Set;
import java.util.TreeMap;

public class E9TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> fruits = new TreeMap<>();

        fruits.put("Apple", 1.99);
        fruits.put("Mango", 2.99);
        fruits.put("Grapes", 4.99);
        fruits.put("Strawberries", 5.99);
        fruits.put("Banana", 0.99);
        fruits.put("Orange", 3.68);

        Set<String> keys = fruits.keySet();
       /* for (String key : keys) {
            System.out.println(key);
        }*/
        System.out.println(keys);

        //Collection<Double> values = fruits.values();
        // to resolve this type of complexity we use -> var keyword => better approach
        var values = fruits.values();
        /*for (Double value : values) {
            System.out.println(value);
        }*/
        System.out.println(values);

    }
}

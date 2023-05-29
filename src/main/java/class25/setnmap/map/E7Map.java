package class25.setnmap.map;

import java.util.HashMap;

public class E7Map {
    public static void main(String[] args) {

        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("Apple", 1.99);
        // grocery.put("Apple", 1); e.g. Wrapper class Double does support widening / narrowing concept
        grocery.put("Tomato", 0.99);
        grocery.put("Orange", 1.99);
        grocery.put("Eggs", 2.99);
        grocery.put("Yogurt", 3.99);
        //if we insert the data with the same key again it will overwrite
        grocery.put("Apple", 4.99);    // L14 overwrites the L9 ->  grocery.put("Apple", 1.99);

        System.out.println(grocery);
        System.out.println(grocery.size()); // now it is 5
        System.out.println(grocery.containsKey("Banana"));
        System.out.println(grocery.containsKey("Eggs"));
        System.out.println(grocery.containsValue(3.5));
        System.out.println(grocery.isEmpty());

    }
}

package class26;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
        Map<String, Double> drinks = new HashMap<>();

        drinks.put("Coke", 2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Mango Juice", 2.0);
        drinks.put("Coffee", 2.0);
        drinks.put("Tea", 2.0);

        //with keys
        drinks.keySet().removeIf(x ->x.contains("i"));
        //with values
        drinks.values().removeIf(x ->x>3);



    }
}

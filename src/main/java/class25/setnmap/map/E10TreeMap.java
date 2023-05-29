package class25.setnmap.map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E10TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> fruits = new TreeMap<>();

        fruits.put("Apple", 1.99);
        fruits.put("Mango", 2.99);
        fruits.put("Grapes", 5.99);
        fruits.put("Strawberry", 5.99);
        fruits.put("Banana", 0.99);
        fruits.put("Orange", 3.68);

        Set<String> keys = fruits.keySet();
        keys.removeIf(x -> x.contains("S"));
        System.out.println(fruits);

        Collection<Double> values = fruits.values();
        values.removeIf(v -> v > 4.99);
        System.out.println(fruits);

        XSSFWorkbook xssfWorkbook;

    }
}

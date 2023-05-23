package class24;

import java.util.ArrayList;

public class E6Iterator {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("rice");
        grocery.add("beans");
        grocery.add("pasta");
        grocery.add("sauce");
        grocery.add("candy");


       // grocery.removeIf((String groceryItem)-> groceryItem.contains("e"));
        grocery.removeIf( x -> x.contains("e"));

       /* Iterator<String> iterator = grocery.iterator();
        while (iterator.hasNext()) {
            String groceryItem = iterator.next(); // If we are removing elements, we should always use Iterator.
            if (groceryItem.contains("e")) {
                iterator.remove();
            }
        }*/


    }
}

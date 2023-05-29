/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
package class26;

import java.util.HashMap;

public class T3Task {

    public static void main(String[] args) {
        HashMap<Integer, String> items = new HashMap<>();
        items.put(7664847, "Printer");
        items.put(7879885, "Fax");
        items.put(7454847, "Pen");
        items.put(7656847, "Textbook");
        items.put(6364847, "Tape");

     var entrySet = items.entrySet();
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(items.keySet());
        System.out.println(items.values());

    }
}

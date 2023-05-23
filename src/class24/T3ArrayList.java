package class24;

import java.util.ArrayList;

public class T3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coke");
        drinks.add("pepsi");
        drinks.add("fanta");
        drinks.add("sprite");
        drinks.add("gingerAle");
        drinks.add("milk");
        drinks.add("cccccc");

        for (int i = 0; i < drinks.size(); i++) {
            String s = drinks.get(i);
            if (s.contains("e") || s.contains("a")) {
                drinks.set(i, "water");
            }
        }

        /*drinks.replaceAll(s -> {
            if (s.contains("e") || s.contains("a")) {
                return "water";
            } else {
                return s;
            }
        });*/

        drinks.replaceAll(s -> (s.contains("e") || s.contains("a")) ? "water":s);
        System.out.println(drinks);
    }
}

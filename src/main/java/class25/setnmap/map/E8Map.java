package class25.setnmap.map;

import java.util.LinkedHashMap;

public class E8Map {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> ranks = new LinkedHashMap<>();

        ranks.put(1,"Ram");
        ranks.put(2,"Rita");
        ranks.put(3,"Kripa");
        ranks.put(4,"Sita");
        ranks.put(5,"Kiran");
        ranks.put(6,"Hari");
        System.out.println(ranks);

        ranks.remove(2);
        System.out.println(ranks);

        ranks.replace(6, "Krishna");
        System.out.println(ranks);


    }
}

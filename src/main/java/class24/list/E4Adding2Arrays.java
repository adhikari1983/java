package class24.list;

import java.util.ArrayList;

public class E4Adding2Arrays {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("honda");
        car.add("fiat");
        car.add("ford");

        ArrayList<String> food = new ArrayList<>();
        food.add("rice");
        food.add("veggi");
        food.add("beans");

        ArrayList<String> misc = new ArrayList<>();
        misc.addAll(car); // adds the whole array
        misc.addAll(food);

        System.out.println(misc);
        misc.removeAll(car);
        System.out.println("After removing car list : " + misc);

    }
}

package class24.list;

import java.util.ArrayList;

public class E5Adding2Arrays {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("rice");
        grocery.add("beans");
        grocery.add("pasta");
        grocery.add("sauce");
        grocery.add("candy");

        //getting some methods
        grocery.isEmpty();
        grocery.contains("beans");
        grocery.size();

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");

        System.out.println(grocery);
       // grocery.remove("rice");            one way to do it
        //grocery.remove("candy");
        System.out.println(grocery);

        //                                   OR remove all at once
        fruit.removeAll(fruit);
        System.out.println(fruit);



    }
}

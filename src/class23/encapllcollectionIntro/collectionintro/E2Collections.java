package class23.encapllcollectionIntro.collectionintro;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Son");
        names.add("Kiran");
        names.add("Son");
        names.add("Kiran");
        names.add("Vlad");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Vlad"));
        System.out.println(names.size());


        names.remove(0);     // based on index   -> method overriding
        names.remove("Kiran"); //  based on object  -> method overriding

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        names.clear();
        System.out.println(names);
    }
}

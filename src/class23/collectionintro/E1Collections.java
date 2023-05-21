package class23.collectionintro;

import java.util.ArrayList;

public class E1Collections {
    public static void main(String[] args) {
        String name = "Kripa";
        String name1 = "Kian";

        String [] names = {"Kiran", "Parbati"};

        int size = 2 ;
        String[] names2 = new String[size];
        names2[0] = "Son";

        ArrayList<String> arrayList1 = new ArrayList<>(50);// but can be fixed , but still expands after 50 though
        ArrayList<String> arrayList = new ArrayList<>();              // we can put approx-size as well
        arrayList.add("Son");
        arrayList.add("Kiran");                          // 1. no fixed size, expands & contracts accordingly
        String s = arrayList.get(0);                     // has to write custom logic in array e.g. forLoop
        System.out.println("s = " + s);
        System.out.println(arrayList);                  //  2. There are already lots of methods to manipulate the data

    }
}

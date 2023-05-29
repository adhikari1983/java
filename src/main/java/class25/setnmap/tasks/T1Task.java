package class25.setnmap.tasks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class T1Task {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        //removing the duplicate
       LinkedHashSet<String> updatedList = new LinkedHashSet<>(aList);
        System.out.println(updatedList);
    }
}

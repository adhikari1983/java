/*
Create a map of a building. Store floor number and it is associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
package class26;

import java.util.LinkedHashMap;

public class T1Task {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>  companyList = new LinkedHashMap<>();
        companyList.put(1,"Google");
        companyList.put(2,"Syntax");     //won't take duplicates
        companyList.put(3,"Microsoft");  // for editing task use ->   LinkedHashMap
        companyList.put(3,"Microsoft");  //removeIf() -> goes one by one element
        companyList.put(4, "Amazon");    // remove()  -> is specific goes by index
        companyList.put(5, "Apple");
        companyList.put(5, "Apple");
        companyList.put(6,"Samsung");
        companyList.put(7, "Best buy");

        System.out.println(companyList.size());
        companyList.replace(4, "Geico");    // replace == update
        companyList.remove(7);
        System.out.println(companyList);

    }
}

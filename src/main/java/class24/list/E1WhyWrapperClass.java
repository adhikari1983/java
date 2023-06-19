package class24.list;

import java.util.ArrayList;

public class E1WhyWrapperClass {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
    /** So, by default invisibly there is a GODFATHER CLASS "OBJECT" in <Object>, that why it adds anything
              behind the scene it looks like
          ArrayList arrayList = new ArrayList();
          ArrayList<Object> arrayList = new ArrayList<Object>();  -> just for concept, very bad as implementation
    */
        arrayList1.add(1);
        arrayList1.add("adc");
        arrayList1.add(2.56);

        /** WHY WRAPPER CLASS ?
          So, makes it generic by using the wrapper class.
         1. Because primitive data type is not supported inside <> & it doesn't work with Collection.
         ArrayList<int> arrayList = new ArrayList<int>();   -> not supported with primitive data type
         Collection only supports class -> primitive class.
         e.g. like String class we write ... it creating object
         Integer integer = new Integer(10); -> this is not the efficient way to create it, that's why they deprecated
         this feature , so we simply write
         Integer integer = 10;
         2. Wrapper class has lots of methods available
         */

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        Integer integer=10;
        String str = "abc";
        Double double1 = 10.5;
        Boolean boolean1 = true;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(integer*double1);

    }
}

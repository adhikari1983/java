package class24;

import java.util.ArrayList;

public class E3BoxingUnboxing {
    public static void main(String[] args) {
        //converting the primitive type into Wrapper type(Object)  -> Boxing
        Integer integer = new Integer(10);

        // converts the primitive to a Wrapper type is called -> Auto-boxing
        Integer integer1 = 10;

        //changing back to primitive type from wrapper class is called -> Unboxing.
        int num = integer1.intValue();

        //Auto - unboxing
        int num1 = 10;
        System.out.println(num);

        int num2 = 10;
        int num3 = 20;
        ArrayList<Integer> numbers = new ArrayList<>();
        //data is being converted automatically from int to integer (auto boxing)
        numbers.add(num2); /** Automatically behind the scene int -> Interger , coz of the BOXING & UNBOXING feature seamlessly*/
        numbers.add(num3);                                 // get converted into

        //data is being converted automatically from int to integer (auto boxing)
        int numbers3 = numbers.get(0);


    }
}

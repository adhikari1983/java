package class24.list;

import java.util.ArrayList;

public class E3BoxingUnboxing {
    public static void main(String[] args) {
        //converting the primitive type into Wrapper type(Object)  -> Boxing
       // Integer integer = new Integer(10);

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


        //in the operation like below -> viiiip
        Double totalPurchase = 0.0;
        Double price = 21.99;
        Integer quantity = 10;

        // coverts Integer(quantity) -> Double(price) doing Auto-Boxing
        // How ?
        // on the right side it declared a subtotal variable to store the double, and that is enough
        // to store Integer value as well after the multiplication operation
        /**  & it is only possible in such operation only otherwise, it has to be  convert like  this
         Integer num1 = 10;
         Double num2 = num1.doubleValue();
         */
        Double subtotal = price * quantity.doubleValue(); // here is the concept
        totalPurchase += subtotal;

        //Integer totalPurchase1 = 0;
        //Integer subtotal1 = price*quantity.doubleValue(); -> not possible, java doesn't allow
    }
}

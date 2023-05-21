package class23.sellable;

public interface SellAble {
   /** private access modifier not allowed
    * protected access modifier not allowed */
   // private int PRICE = 100;
   //protected int PRICE = 100;
    int PRICE = 100;


    // final void sell();     -> final not allowed as methods, coz they are abstract by default
    // static void sell();    -> not allowed as static can't be overridden.
    // private void sell();   -> not allowed, coz no one will be able to provide implementation
    // protected void sell(); -> not allowed, coz not inheriting

    void sell();

    static void sell1(){     // -> static methods are allowed , coz we don't override the static method

    }

    default void sell2(){

    }
}

class Tester1{
    public static void main(String[] args) {
        SellAble.sell1();
    }
}
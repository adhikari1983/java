package class18.inheritance.supe.keyword;

public class Furniture {              //Java preference for variable
    String color = "Black";           // 1) local
}                                     // 2) instance variable of the same/child class
                                      // 3) instance variable of the parent class
                                      // if we want to modify this default preference. We can use "this" & "super" keyword.

class Chair extends Furniture {
    String color = "White"; // if this L-10 is removed java prefers to go for PARENT class instance variable in L-4

    void printColor() {
        String color = "Blue"; // if this L-13 is removed from this printColor() method -> still java prefers to go for
        System.out.println(color); // CHILD class(in this case here inside the same class -> Chair) instance variable in L-10
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

class FurnitureTester{
    public static void main(String[] args) {
        Chair chair = new Chair();

        //before adding this to line 12 in printColor()          => System.out.println(color);
        chair.printColor(); // prints  String color = "Blue";    -> its local inside the method
                            // Java always prefer the local first.

        //after making                                       => System.out.println(this.color);
        chair.printColor(); // gets blue color from child class


        //after making                                       => System.out.println(super.color);
        chair.printColor(); // gets black color from super class
    }
}
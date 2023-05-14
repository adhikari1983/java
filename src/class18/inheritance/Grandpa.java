package class18.inheritance;

public class Grandpa {
    double money = 150;

}

class Father extends  Grandpa{
   double money = 100;           // firstly, behind the exactly same properties are copied from grandpa class
}

class Child extends Father{
    void printMoney(){             // firstly, behind the exactly same properties are copied from grandpa class

        // L 9 in Father class is not present then
        System.out.println(money);// with -> (money); -> will access the parent on very first level class of multi-level

        // L 9 in Father class is present then
        System.out.println(super.money); // with -> (super.money); will -> access immediate parent class

    }
}

class Tester{
    public static void main(String[] args) {
      Child child = new Child();

      child.printMoney();
    }
}
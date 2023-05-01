package class15.method.variables;

public class E3Variables {
    static int age;         // instance variable w/o initialization
    String color = "Black"; // instance variable -> initialization

    public static void main(String[] args) {
        double weight = 30;  // local variable -> mandatory to initialize to use it
        if(100 > 20){
            int sum = 120;  // local to if-condition
        }
       // System.out.println(sum);  => w/o initialization still local, it has to initialize first to use it
    }
    String name;         // instance variables
    static  String year; // instance variables
}

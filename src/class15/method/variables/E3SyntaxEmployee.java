package class15.method.variables;

public class E3SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */
        int empID;       // use String for more realistic
        int salary;      // use double for more realistic
        final static String CEO = "Sumair";

    public static void main(String[] args) {
        E3SyntaxEmployee obj1 = new E3SyntaxEmployee();
        System.out.println(obj1.empID = 101);
        System.out.println(obj1.salary = 1_000_000);
        System.out.println(obj1.CEO);             // not the preferred way -> still works but the convention is below
        System.out.println(E3SyntaxEmployee.CEO);   //  always access static variable with the class name.(99.99%)


        E3SyntaxEmployee obj2 = new E3SyntaxEmployee();
        System.out.println(obj2.empID = 201);
        System.out.println(obj2.salary = 2_000_000);
        System.out.println(E3SyntaxEmployee.CEO);

    }
}

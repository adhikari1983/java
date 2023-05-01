package class15.method.variables;

public class E4AllVariables {
    String name;        // instance
    static int age = 20;   // instance
    final static double noOfMonth = 12;

    void print() {
        int age = 10;   // local  -> here static value gets change
        System.out.println(age);
        System.out.println(name);
    }

    static void printInfo() {
        System.out.println(age);
        //System.out.println(name); // can't access name coz name is instance variable

    }

    public static void main(String[] args) {
        E4AllVariables obj = new E4AllVariables();
        obj.print();

        // accessed "noOfMonth" from { This class }  with the class name "E4AllVariables"
        System.out.println(E4AllVariables.noOfMonth); // static

        //accessed "PI" from { Java library class }  with the class name "MATH"
        System.out.println(Math.PI); // static
    }
}

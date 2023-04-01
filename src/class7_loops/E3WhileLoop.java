package class7_loops;

public class E3WhileLoop {
    public static void main(String[] args) {

        int i = 1;           // (i <5 || i == 5)
        while (i <= 5) {     // unless the Java's regular rule code executing from top - bottom, left - right
            System.out.println("Hello world.");  // it loops around the code w/condition
            i++;                                 // and increments by one
        }                                        //it goes backs to loop evaluate the condition before is line }
    }
}

package class3.operaters;

public class E7StringConcat {
    public static void main(String[] args) {
        System.out.println("Java" + 10 + 10);

        //java performs it executes line by line from top to bottom
        //left to right follow the "default" datatype from the beginning one and keep that
        //however this can be different if we parenthesis , or we are doing pure math calculations
        //for example multiplication has precedence over addition and subtraction(BODMAS) rule.
        System.out.println( 10 + 10 + "Java" );
        System.out.println( 10 + 10 + "Java" + 10 + 10);
    }
}

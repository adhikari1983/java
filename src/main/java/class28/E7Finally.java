/*
    How would handle InputMismatchException?
    Input Mismatch Exception when user enters mismatch value
    then programmer expected
 */
package class28;

public class E7Finally {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(10/0); // -> execution should stop from here
            System.out.println("3");
        }catch (Exception e) {
            System.out.println("4");
             System.out.println(10 / 0);
        }finally{
            // System.out.println(10 / 0);              -> but you can't put exception in finally block
            System.out.println("Will always executed"); //-> no matter what happens Will always executed

        }
        System.out.println("5");
    }
}

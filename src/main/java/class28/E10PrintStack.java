package class28;

public class E10PrintStack {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){                      // way to get the message on console

                                                               /** entire message tracing all stacks*/
             e.printStackTrace();                                // java.lang.ArithmeticException: / by zero
                                                                 // at class28.E10PrintStack.main(E10PrintStack.java:6)

                                                               /** customized the message(or from throw constructor */
        // System.out.println("Please don't divide by zero");    // "Please don't divide by zero"


                                                               /** type only */
        // System.out.println(e);                                  // java.lang.RuntimeException

                                                               /** exception description Either from library
                                                                   or custom written */
         //System.out.println(e.getMessage());                   //from library ->  / by zero
                                                                 //custom written -> Please don't divide by zero
        }
        System.out.println("print 1");
    }
}

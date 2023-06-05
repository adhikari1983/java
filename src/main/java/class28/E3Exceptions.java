package class28;

public class E3Exceptions {
    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");

        try {
           // System.out.println("name".charAt(10));
            //int[] arr = new int[-5];
            System.out.println(10/0);
            //based on the types of error that we are expecting to happen, it
            // will match the catch block accordingly
            // if you don't know the name of the error, then put (Exception e)
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Plan B");
        }catch (NegativeArraySizeException e){
            System.out.println("Plan C");
        }catch(ArithmeticException e){
            System.out.println("Plan D");
        }

        System.out.println("line 5");
        System.out.println("line 6");
    }
}

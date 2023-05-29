package class14.methodcontinue;

public class E6Methods {


    boolean isEven(int num){
        boolean isNumEven = false;
        if(num%2 == 0){
           isNumEven = true;
        }
        return isNumEven;                    // maintaining only one exit point using boolean flag
        //return  number%2 == 0          // whole block of the code into one line to check even/odd
    }


    public static void main(String[] args) {
        E6Methods obj = new E6Methods();
        boolean result = obj.isEven(4);
        System.out.println("result = " + result);
    }
}

package class14.methodcontinue;

public class E7Methods {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void chekNumber(int a, int b){          // -> 1st way
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        //System.out.println(Math.max(a, b));  -> 2nd way can be written in one line.
        //int max = a > b ? a : b;             -> 3rd way use ternary operator L13
        //System.out.println(max);
    }

    public static void main(String[] args) {
        E7Methods obj = new E7Methods();

        obj.chekNumber(5,6);
    }
}

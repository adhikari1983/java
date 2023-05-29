package class15.method.variables;

public class E2Method {

    //  create a method call it method1.
    //  in the body it should print hello world
    void method1() {
        System.out.println("Hello World");
    }

    // create a method that takes an array as input. It adds all the numbers
    // from the array and returns the sum. name of the method should be sumArr
    // sumArr({10,10,10}) => 30
    // sumArr({10,10,40}) => 60
    int sumArr(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return  sum;
    }

    void printNumber(){
        //sum is a local variable we can't access it in this method
        //System.out.println(sum);
    }


    public static void main(String[] args) {
        E2Method obj = new E2Method();
        obj.method1();

        int[] number = {1, 1, 1, 1, 1};

        int result = obj.sumArr(number);
        System.out.println("result = " + result);

        //obj.sumArr(new int[]{1, 1, 1, 1, 1});  one line -> shortcut
    }
}

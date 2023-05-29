package class16.access.modifier.example;

public class Example {
    /*
     Create a method that will accept an array as parameters and will return a
     sum of all elements from that array.
     Method should be visibly only within same package and accessible by
     the creating an instance of the class.
     */

    int arraySum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}

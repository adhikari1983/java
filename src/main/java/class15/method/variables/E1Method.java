package class15.method.variables;

public class E1Method {
    // create a method that takes a number as input call it size.
    // In the method body  create an array of that size.
    // Fill the array with some numbers lets say 10
    // and returns the array on method call & name the method createArray.
    // createArray(5) => {10,10,10,10,10}
    // createArray(3) => {10,10,10}

    int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = 10;
        }

        for (int i : array) {                             // to print array
            System.out.print(i + " ");
        }
        // System.out.println(Arrays.toString(array));   // or to print array we can use -> java.util.Arrays
        return array;
    }

    public static void main(String[] args) {

        E1Method obj = new E1Method();
        obj.createArray(5);

    }

}

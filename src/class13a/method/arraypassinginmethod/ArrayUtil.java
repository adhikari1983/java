package class13a.method.arraypassinginmethod;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 89};
        int number = 100;

        boolean isPresent = false;               // checked 1st -time
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println("Number is present.");
        } else {
            System.out.println("Number is not present.");
        }

        int[] arr1 = {10, 20, 45, 89, 60, 100, 50};
        int number1 = 100;
        boolean isPresent1 = false;              // checked 2nd -time  -> repeated the same block of code
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] == number1) {
                isPresent1 = true;
            }
        }
        if (isPresent1) {
            System.out.println("Number is present.");
        } else {
            System.out.println("Number is not present.");
        }

        int[] arr3 = {10, 20, 45, 89, 60, 50, 22, 35};
        int number3 = 100;
        boolean isPresent3 = false;                // checked 3rd -time  -> repeated the same block of code
        for (int j = 0; j < arr3.length; j++) {
            if (arr3[j] == number3) {
                isPresent3 = true;
            }
        }
        if (isPresent3) {
            System.out.println("Number is present.");
        } else {
            System.out.println("Number is not present.");
        }

        //Using the method to the number in the arr2
        int[] arr2 = {10, 20, 45, 89, 60, 70,  100};
        int number2 = 100;
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.searchArray(arr2, number2);

    }
/*
   The searchArray method in the ArrayUtil class is a reusable method that takes an array and a number as input
   parameters, and checks whether the number is present in the array. It returns a boolean value indicating whether
   the number is present or not.
   By creating this method, we can avoid writing the same code repeatedly in different parts of your program
   whenever you need to check if a number is present in an array. Instead, you can call this method with the
   appropriate input parameters, and it will return the result.
   Additionally, if you need to make changes to the logic of checking for the presence of a number in an array,
   you only need to make the changes in one place, i.e., the searchArray method, rather than changing it everywhere
   in your program. This can help reduce the chance of errors and make your code easier to maintain.
 */ // about searchArray method
/*
Efficient: By using a reusable method, we can avoid writing the same code multiple times in different parts of
your program. This can help make our code more efficient, as we are not duplicating code unnecessarily.

Modular: Creating reusable methods can help make your code more modular. This means that your code is divided into
smaller, self-contained components, each with a specific purpose. This can help make your code easier to understand
and maintain.

Readable: By using descriptive method names and separating functionality into smaller methods, our code can become
more readable and easier to understand. This can be especially helpful for other developers who may need to work on
your code in the future.

Maintainable: Creating reusable methods can help make our code easier to maintain. If you need to make changes to the
logic of a particular functionality, we only need to make the changes in one place, i.e., the method itself, rather
than making changes throughout your entire codebase.

Reusable: By creating a reusable method, we can use it in different parts of your program or even in other programs.
This can save our time and effort when working on similar projects in the future.
 */ //  benefits of creating a method -> in general
    void searchArray(int[] arr, int number) {   // Not repeating the blocks of code -> method created -> only 1-time
        boolean isPresent = false;             // So then it can be re-used  again & again
        for (int j = 0; j < arr.length; j++) {  // makes program efficient , better
            if (arr[j] == number) {
                isPresent = true;
                break;               //break this time because we don't know the size of array
            }
        }
        if (isPresent) {
            System.out.println("Number is present.");
        } else {
            System.out.println("Number is not present.");
        }
    }
}

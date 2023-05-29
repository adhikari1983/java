package class14.methodcontinue;

public class E2ArrayManipulator {
       /*
    create a method that will take an int array call it sumArr
    and return the sum of all the elements from that array
    create the object of the class and call the method.
     */

    int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
        }
        return sum;
    }
       /*
    return type        => int
    name of the method => sumArr
    parameters         => (int [] arr)
    body               => {
                           go through all the elements of the
                           array add them and return the results
                           }
     */

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};

        E2ArrayManipulator obj = new E2ArrayManipulator();
        int result = obj.sumOfArray(numbers);

        System.out.println("Given array of numbers :");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Sum of the all elements of numbers array = " +result);
    }
}

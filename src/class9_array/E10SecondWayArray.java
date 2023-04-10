package class9_array;

public class E10SecondWayArray {
    public static void main(String[] args) {
        // first way
        int[] evenNumber = {50, 60, 70, 80, 90}; // just put in between 2-curly brackets

        // second way
        // new int[5]=> create an array of int with size 5
        // so far it's an empty array, of oddNumbers which holds 5 memory location |0|1|2|3||4|5|
        int[] oddNumbers = new int[5]; // create an object of  ->  new int[5];

        oddNumbers[0] = 51;
        oddNumbers[1] = 61;
        oddNumbers[2] = 71;
        // oddNumbers[3] = 81;  by default  oddNumbers[3] -> stays empty
        // oddNumbers[4] = 91;

        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }

        System.out.println();
        int[] evenNumbers = new int[5];
        int sum = 50;
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = sum;
            sum += 10;
            System.out.print(evenNumbers[i] + " ");
        }
    }
}

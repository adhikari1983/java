package class9_array;

public class E3Array {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 60, 45, 100, 58, 74, 89};

        // print the numbers on odd indexes
        for (int i = 0; i < numbers.length; i++) {
            if(i%2 != 0 ){
                System.out.print(numbers[i] + " ");
            }
        }

        //even more precise
        System.out.println();
        for (int j = 1; j < numbers.length ; j+=2) {
            System.out.print(numbers[j] + " ");
        }
    }
}

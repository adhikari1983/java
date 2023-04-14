package class10_2Darrays;

public class E42DArrays {
    public static void main(String[] args) {
        //whenever we repeat the code we should replace with a loop

        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };

        for (int j = 0; j < matrix.length ; j++) {
            //L15 -> getting the complete oneD array from 2D array
            int[] array1 = matrix[j];
            for (int i = 0; i <array1.length; i++) {
                //going over all the elements from the oneD array
                System.out.print(array1[i] + " ");
            }
            System.out.println();
        }

    }
}

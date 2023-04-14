package class10_2Darrays;

public class E32DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };

       int[] array1 = matrix[0];
        for (int i = 0; i <array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        array1 = matrix[1];
        for (int i = 0; i <array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        array1 = matrix[2];
        for (int i = 0; i <array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}

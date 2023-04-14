package class10_2Darrays;

public class E52DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40, 50},
                {20, 50, 65, 20 },
                {102, 54, 60},
                {20, 55}
        };

        for (int i = 0; i < matrix.length; i++) {
           // int[] array = matrix[i];  L13 -> this line of code can be kept / but no redundancy
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

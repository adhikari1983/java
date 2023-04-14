package class10_2Darrays;

public class E12DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };

        System.out.println(matrix[1][1]); //50     matrix[row][column]
        System.out.println(matrix[1][2]); //65
        System.out.println(matrix[0][0]); //10
    }
}

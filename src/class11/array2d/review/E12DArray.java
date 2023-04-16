package class11.array2d.review;

public class E12DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        int sum = 0;
        for (int[] ints : arr) {
            //  int sum = 0;         -> we can also put sum here
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.println(sum);
            sum = 0;                // -> it is very imp and mand. step to reset the sum = 0
        }
    }
}

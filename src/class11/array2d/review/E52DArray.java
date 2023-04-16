package class11.array2d.review;

public class E52DArray {
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        int count = 0;
        for (boolean[] booleans : arr2D) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                   // if (aBoolean == true) {
                    count++;
                }
            }
        }
        System.out.println("count = " + count);
    }
}

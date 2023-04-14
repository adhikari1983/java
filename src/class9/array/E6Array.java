package class9.array;

public class E6Array {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        // reverse the array
        for (int i = 6; i >= 0 ; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // reverse the array
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = chars.length-1; i >= 0 ; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}

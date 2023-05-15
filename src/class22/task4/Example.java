package class22.task4;

public class Example {

    //count the repetition of elements in the array
    static void countRepetition(int[] arr, int num) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countRepetition(new int[]{1,2,3,4,1,1 }, 1);
    }
}

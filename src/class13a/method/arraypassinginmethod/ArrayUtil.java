package class13a.method.arraypassinginmethod;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 89};
        int number = 100;

        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println("Number is present.");
        } else {
            System.out.println("Number is not present.");
        }

        int[] arr1 = {10, 20, 45, 89, 100};
        int number1 = 100;
        boolean isPresent1 = false;
        for (int j = 0; j < arr1.length; j++) {
            if (arr[j] == number1) {
                isPresent1 = true;
            }
        }
        if (isPresent1) {
            System.out.println("Number is present.");
        } else {
            System.out.println("Number is not present.");
        }

        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.searchArray(arr, number);

    }

    void searchArray(int[] arr, int number) {
        boolean isPresent1 = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == number) {
                isPresent1 = true;
                break;               //break this time because we don't know the size of array
            }
        }
        if (isPresent1) {
            System.out.println("Number is present.");
        } else {
            System.out.println("Number is not present.");
        }
    }
}

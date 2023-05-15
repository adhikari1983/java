package class22.task2;

public class Example {

    //Create a method that will find a number from an array.
    static void findNumber(int[] arr, int index){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == index) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {


     findNumber(new int[]{1,2,3,4},2);
    }


}

package class9_array;

public class E11Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int num=50;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=num;
            num=num+10;
            System.out.println(numbers[i]);
        }

//        for (int number : numbers) {
//            System.out.println(number);
//        }
    }
}

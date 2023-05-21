package class22.abstractfinal.task3;

public class Example {

    static void avgOfArray(double[] arr){
        System.out.println(arr.length);
      double  sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println(sum/ arr.length);
    }


    public static void main(String[] args) {
        avgOfArray(new double[]{1, 2, 3, 4});
    }
}

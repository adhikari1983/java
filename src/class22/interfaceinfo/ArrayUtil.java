package class22.interfaceinfo;

public interface ArrayUtil {

    public boolean searchArr(int [] array,int number);

    double getAvg(double[] arr);

    int add(int num1,int num2);
}

class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] array, int number) {
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAvg(double[] arr) {
        int sum = 0;
        for(double element: arr){
            sum += element;
        }
        return sum;
    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
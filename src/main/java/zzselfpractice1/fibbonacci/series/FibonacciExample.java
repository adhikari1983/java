package zzselfpractice1.fibbonacci.series;

public class FibonacciExample {
    public static void main(String[] args) {
        int n = 10; // The number of Fibonacci numbers to generate
        int prev1 = 0; // The first two Fibonacci numbers are 0 and 1
        int prev2 = 1;
        int curr = 0;

//        System.out.print(prev1);            //0 1 1 2 3 5 8 13 21 34
//        System.out.println(prev1 + prev2);  //0 1 1 2 3 5 8 13 21 34 89
        System.out.print(prev1 + " " + prev2);
        for (int i = 3; i <= n; i++) {        // 0 1 1 2 3 5 8 13 21 55 -> i < n
            curr = prev1 + prev2;             // 0 1 1 2 3 5 8 13 21 34 -> right
            System.out.print(" " + curr);
            prev1 = prev2;
            prev2 = curr;
        }
        //System.out.print(curr + " ");
    }
}

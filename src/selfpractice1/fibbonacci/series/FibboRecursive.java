package selfpractice1.fibbonacci.series;

public class FibboRecursive {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0 ; i < num; i++) {
            System.out.print(fibb(i) + " ");                   //f(0) = 0;
        }                                                      //f(1) = 1
    }                                                          //f(2) = f(2-1) + f(2-2) = f(1) + f(0) = 1 + 0 = 1
                                                               //f(3) = f(3-1) + f(3-2) = f(2) + f(1) = 1 + 1 = 2
    //f(n) = f(n-1) + f(n-2) where f(0)= 0 and f(1) =1         //0 1 1 2 3 5 8 13 21 34
    public  static int fibb(int n){
        if(n <= 1 ) {
            return n;
        }
        return fibb(n - 1) + fibb(n - 2);
    }
}

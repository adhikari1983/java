package zzselfpractice1.fibbonacci.series;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int noToFindFibbonacci = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;
        int currentNumber = 0;
                                                           // 1  2  3  4  5  6  7  8   9   10
        for (int i = 1; i <= noToFindFibbonacci; i++) {     // 0  1  1  2  3  5  8  13  21  34
            if(i == 1){
                currentNumber = firstNumber;
            }
            else if(i == 2){
                currentNumber = firstNumber + secondNumber;
            }
            else{
                currentNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = currentNumber;
            }
            System.out.print(currentNumber + " " );
        }

    }
}

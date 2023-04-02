package class8_loop_revision;

public class E10StarExample {
    public static void main(String[] args) {
         //one way
        for (int K = 1; K < 5; K++) {      // to repeat the line
            int j = 2;
            while (j <= 10) {              // and print the numbers
                System.out.print(j + " ");
                j += 2;
            }
            System.out.println();
        }

        System.out.println();
        //second way
        int counter = 0;
        while (counter < 4) {
            for (int k = 2; k <= 10; k += 2) {
                System.out.print(k + " ");
            }
            System.out.println();
            counter++;
        }
    }
}

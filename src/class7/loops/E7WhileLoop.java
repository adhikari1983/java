package class7.loops;

public class E7WhileLoop {
    public static void main(String[] args) {

        int counter = 20;            // print even numbers fromm 20 - 100
        while (counter <= 100) {
            if (counter % 2 == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        System.out.println();

        counter = 10;    // print numbers fromm 100 -1
        while (counter > 0) {
            System.out.print(counter + " ");
            counter--;
        }
        System.out.println();

        counter = 1;     //print numbers fromm 1 - 100
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}

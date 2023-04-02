package class8_loop_revision;

public class E11NestedForLoop {
    public static void main(String[] args) {
        for (int i = 2; i < 5; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         using nested for loop
         */

        for (int a = 0; a <3; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print(a+b + " ");
            }
            System.out.println();
        }
    }
}

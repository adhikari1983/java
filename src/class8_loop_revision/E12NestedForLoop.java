package class8_loop_revision;

public class E12NestedForLoop {
    public static void main(String[] args) {
        /*
        1 1
        2 2
        1 3
        2 1
        2 2
        2 3
         */

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j <4 ; j++) {
                //System.out.println(j + " " + i );
                System.out.println(i + " " + j );
            }
        }


    }
}

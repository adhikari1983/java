package class8.loop.revision;

public class E9NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {         // repeating for loop multiple times
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n__________");
        for (int j = 0; j < 3; j++) {    //nesting multiple for loop in the single one
            for (int i = 0; i < 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

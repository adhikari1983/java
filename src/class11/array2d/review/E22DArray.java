package class11.array2d.review;

public class E22DArray {
    public static void main(String[] args) {
        String[][] names = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };

        for (String[] name : names) {
            for (String s : name) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

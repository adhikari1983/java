package class8.loop.revision;

public class E7BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i > 5){     //only works on "if" statement and "switch" case
                break;     //will terminate the loop after 5 iteration,   till -> (i > 5)
            }
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i < 50; i++) {
            sum = sum + i;             // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
            System.out.print(i + " "); // 300 will be sum of the number from
            if (sum >=300){
                break;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}

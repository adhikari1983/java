package class4_conditional_st;

public class E01NestedIfStatement {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Inside 10 > 5");
            if (20 > 3) {
                System.out.println("Inside 20 > 3 ");
                if (3 > 5) {
                    System.out.println("Inside 3 > 5 ");
                }
            }
        }
    }
}

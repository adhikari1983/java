package class7.loops;

public class E8WhileLoop {
    public static void main(String[] args) {
        //add all the number from 1 to 10
        int i = 1;
        int sum = 0;
        while ( i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}

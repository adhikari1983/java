package class8_loop_revision;

public class E6ForLoopForEven {
    public static void main(String[] args) {
        //write a loop to add all the even numbers from 1 to 30.
        int sum = 0;
        for (int i = 2; i <= 30; i += 2) {
            if (i % 2 == 0) {
                sum += i; // sum = sum + i;
            }
        }
        System.out.println("The sum of even numbers from 1 to 30 is: " + sum);
    }
}

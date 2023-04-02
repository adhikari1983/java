package class8_loop_revision;

public class E8BreakExample {
    public static void main(String[] args) {
        /* create a boolean variable summer store true in it then write a loop that runs as long as it is summer
           create
         */
        boolean summer = true;
        int temperature = 105;

        while (summer) {
            if (temperature < 100) {
                System.out.println("Its good i enjoy Summer");
            }else {
                System.out.println("Its very hot");
            }
            break;
        }
        temperature ++; // or we can do      temperature +=2; /   temperature +=3; /    temperature +=(any number here);
    }
}

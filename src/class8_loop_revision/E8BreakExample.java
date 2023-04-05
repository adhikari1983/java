/*   Create a  boolean variable summer store true in it,  then write a loop
     that runs as long as it is summer. Create a temp variable store 85 and
     inside the loop check the temp if it is less than 100 print "Its good I enjoy summer",
     as soon as temperature exceeds 100 print "It's very hot " and break the loop with
     break keyword. */
package class8_loop_revision;

public class E8BreakExample {
    public static void main(String[] args) {
        boolean summer = true;
        int temperature = 85;

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

package class12.objectintro.string.string;

public class E11StringIndex {
    public static void main(String[] args) {
        String sentence = "Today is Saturday";

        System.out.println(sentence.indexOf('i'));
        // if there is more than one same letter than it gives the -> "Very first one"
        System.out.println(sentence.indexOf('a'));

        //start searching from index 4
        System.out.println(sentence.indexOf('a', 4));
        System.out.println();

        //print the index number of a
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                System.out.print(i + " ");                  // i might be confusing coz i tried L19 way
                //System.out.print(sentence.charAt(i) +" ");
            }
        }
    }
}

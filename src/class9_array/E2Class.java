package class9_array;

public class E2Class {
    public static void main(String[] args) {
         /*  create an array of Strings stores 5 names in that array
        print all the names from that array with the help of a for loop
        try printing with the help of a while loop as well
         */

        String[] names = {"Ram", "Hari", "Jack", "Mack", "Tom"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();

        int counter = 0;
        while(counter < names.length){
            System.out.print(names[counter] + " ");
            counter++;
        }

    }
}

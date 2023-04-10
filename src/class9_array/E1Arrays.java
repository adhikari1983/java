package class9_array;

public class E1Arrays {

    public static void main(String[] args){
        String name1 = "Nitesh" , name2 = "Parbati",  name3 = "Kripa", name4 = "Son";
        /*
        String => data type
            [] => this is a part of the syntax for Array
         names => a variable name of the array
             = => assignment operator
            {} => one way to create the array
         */
        String[] names = {"Ram", "Shyam", "Hari"};
        //all the elements that we are store in an array are assigned
        // numbers these numbers they start from 0, and they are called indexes
        System.out.println(names[0]);
        System.out.println(names[2]);

        for (String name: names) {
            System.out.print(name + " ");
        }
    }
}

package class12.objectintro.string.string;

public class E10StringCharAt {
    public static void main(String[] args) {
        String name = "KIRANR";

        System.out.println(name.charAt(4));

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        //counting how many times the letter R has appeared
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            // can't do like this name.charAt(i).equal coz 'R' is primitive data type , name.charAt(i).equal only for non-primitive data type e.g. in the String case
            if(name.charAt(i) == 'R'){
                count++;
            }
        }
        System.out.println(count);
    }
}

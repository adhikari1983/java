package class18.inheritance.constructor.lastpart;

public class E1ManipulateConstructor {

    public static void main(String[] args) {
        String str = new String("Java");
        char[] chars = {'J', 'a' , 'v', 'a'};

        String str1 = new String(chars);

        //extract java and convert it to upper case
        char[] chars2 = {'t', 'h', 'e', 'J', 'a' , 'v', 'a'};

       // it takes3 elements it doesnt go by the index number??
        //start at offset 3, and take 4 characters
        /*
        the offset parameter specifies the starting position of the substring in the chars2 array, and it is zero-based.
        So, offset = 3 means that the substring starts at the fourth element in the chars2 array, which is 'J'.
        The length parameter specifies the number of characters to include in the substring, which is 4 in this case.
        Therefore, the resulting str2 String object will contain the substring "Java".
         */
        String str2 = new String(chars2, 3, 4);
        System.out.println(str2.toUpperCase());

    }
}

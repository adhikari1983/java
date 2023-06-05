package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {

        //checked exception
        try {
            FileInputStream fis = new FileInputStream("F:\\sdetJavaBatch16\\Files\\Employees1.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("Exception : " + e.getMessage());
        }

        // unchecked exception
        System.out.println(10/0);

    }
}

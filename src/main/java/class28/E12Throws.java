package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E12Throws {
    public static void main(String[] args) {
        String filePath = "\\Files\\TestExcelFile1.xlsx";
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * throws -> gives hint that, this method will throw an exception
     * basically it just provides the information
     */
    static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
/**
   Is it like we declare new throw Exception for unchecked and throws for checked exception ?
 Yes, that's correct.

 In Java, there are two types of exceptions: checked exceptions and unchecked exceptions.

 Checked Exceptions: Checked exceptions are the exceptions that must be declared in a method's signature using
 the throws keyword. These exceptions occur at compile-time, and the compiler enforces handling or declaring them.
 Examples of checked exceptions include => IOException, SQLException, etc.

 Unchecked Exceptions: Unchecked exceptions, also known as runtime exceptions, do not need to be declared in a
 method's signature using throws.These exceptions occur at runtime and are not enforced by the compiler.
 Unchecked exceptions ["can be thrown anywhere in the code without being explicitly declared"] like
 in the method signature.
 Examples of unchecked exceptions include => NullPointerException, ArrayIndexOutOfBoundsException, etc.

 */
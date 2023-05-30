package zzselfpractice1.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IntReadingFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            System.out.println("File is opening...........");
            fis = new FileInputStream("F:\\sdetJavaBatch16\\Files\\Config.properties");
            System.out.println("file opened & starting the file reading");

            int intReading = fis.read();

            while(intReading !=-1){
                System.out.print((char) intReading);
                intReading = fis.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("\nException " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                System.out.println("File closed.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

package zzselfpractice1.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWritingFile {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fos = null;

        try {
            fin = new FileInputStream("F:\\sdetJavaBatch16\\Files\\Config.properties");
            fos = new FileOutputStream("F:\\sdetJavaBatch16\\Files\\test.txt");


            byte data = (byte) fin.read();            //OR   byte = data;

            while (data != -1) {                      //      while ((data = fin.read()) != -1) {
                fos.write(data);                      //            fos.write(data);    -> increment happens within
                data = (byte) fin.read();             //           }
            }
            System.out.println("File copied");


        } catch (FileNotFoundException e) {
            System.out.println("Exception : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            try {
                if (fin != null)
                    fin.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Exception: " + e.getMessage());
            }

        }

    }
}

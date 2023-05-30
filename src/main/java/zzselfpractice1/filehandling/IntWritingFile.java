package zzselfpractice1.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IntWritingFile {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fos = null;

        try {
            fin = new FileInputStream("F:\\sdetJavaBatch16\\Files\\Config.properties");
            fos = new FileOutputStream("F:\\sdetJavaBatch16\\Files\\test.txt");


            int data = fin.read();             //OR   int = data;

            while (data != -1) {                //      while ((data = fin.read()) != -1) {
                fos.write(data);             //            fos.write(data);
                data = fin.read();           //           }
            }
            System.out.println("File copied");


        } catch (FileNotFoundException e) {
            System.out.println("Exception : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            try {
                fin.close();
                fos.close();
            } catch (Exception e) {
                System.out.println("Exception : " + e.getMessage());
            }

        }

    }
}

package zzselfpractice1.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteReadingFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;

        //file is opening...........
        fis = new FileInputStream("F:\\sdetJavaBatch16\\Files\\Config.properties");
        //file opened...............

        //reading the file in byte
        byte byteReading = (byte) fis.read();
        //  int intReading = fis.read();

        while (byteReading != -1) {
            System.out.print((char) byteReading);
            byteReading = (byte) fis.read();
        }
            try {
                fis.close();
                System.out.println("File closed.");
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}

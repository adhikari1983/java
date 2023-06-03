package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        String path1 = "F:\\sdetJavaBatch16\\Files\\Config.properties";

        //path to grab file from hardDrive(hdd)
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        System.out.println(path);

        // Brings the data from the file in the form of raw bytes
        FileInputStream fis = new FileInputStream(path);

        // converts the data in the form of key value pairs, so then we can access its properties
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("userName"));
       // System.out.println(properties.containsKey("userName"));

    }
}

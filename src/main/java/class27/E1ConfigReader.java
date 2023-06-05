package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //absolute path is not an ideal way to do it
        String path1 = "F:\\sdetJavaBatch16\\Files\\Config.properties";
        /**
           TO READ THE FILE.
        1. Get the location of the file
        2. Either navigate to that file or bring that file into the memory
        3. Then use the file reader
            e.g. by Properties class by java or XSSFWorkbook class by apache
         */

        //path to grab file from hardDrive(hdd)
        //System.getProperty("user.dir") => it gives you the path till your project
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        System.out.println(path);

        // Brings the data from the file in the form of raw bytes in the memory(ram)
        FileInputStream fis = new FileInputStream(path);

        // converts the data in the form of key value pairs, so then we can access its properties
        Properties properties = new Properties();
        properties.load(fis);

        //accessing the element from file
        System.out.println(properties.getProperty("userName"));
        // System.out.println(properties.containsKey("userName"));

    }
}

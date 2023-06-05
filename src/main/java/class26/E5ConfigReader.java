package class26;

import utils.ConfigReader;

import java.io.IOException;

public class E5ConfigReader {

    public static void main(String[] args) throws IOException {
        // using user defined util classes
        // utils/Constants.java:9 -> to access constant value from
        //  utils/ConfigReader.java:6  -> to access customized methods from

        //  Properties properties = new Properties();

           /** preferred way first create the customized methods
             in ->  utils/ConfigReader.java:11
             and use it again and again*/
        //B. reading the properties from Config.properties files
        //another way => A. is here -> class26/E4ConfigFiles.java:11
        System.out.println(ConfigReader.getProperty("userName"));
        System.out.println(ConfigReader.getProperty("userPassword"));
        System.out.println(ConfigReader.getProperty("URL"));
    }
}

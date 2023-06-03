package class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {
        //System.getProperty("user.dir") gives the path of the current project
        //e.g. System.currentTimeMillis();
        System.out.println(System.getProperty("user.dir"));

        //we can also use Absolute path as well ->F:\sdetJavaBatch16\Files\Config.properties
        // but to synchronized with other tester after pushing it on github
        // it won't work to collaborate with other team member
        // the base of path is defined according to generic System.getProperty("user.dir")
        // & append the path from project, which is same for all team member
        //So, L19 is generic for all team member.
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        System.out.println(path);

        //passing the path to make stream of -> fileInputStream to load in properties further on
        FileInputStream fileInputStream = new FileInputStream(path);

        //This "Properties" -> special class which knows how this file works
        // it's like the software tool to read the files
        Properties properties = new Properties();
        properties.load(fileInputStream);

        //A. reading the properties from Config.properties files
        //another way => B. is here -> class26/E5ConfigReader.java:6
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));
    }
}

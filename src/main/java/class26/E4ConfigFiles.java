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
        // but to synchronized with other team members after pushing the project on GitHub
        // it won't work to collaborate with other team members
        // the base of path is defined according to generic root by System.getProperty("user.dir")
        // & append the path from project, which will return the same path for all team member
        //So, L19 -> is generic path for all team member
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        System.out.println(path);

        //passing the path to make stream of -> fileInputStream to load by Properties class further on
        FileInputStream fileInputStream = new FileInputStream(path);

        //This "Properties" -> special class which knows how this file works
        // it's like the software tool to read the files
        Properties properties = new Properties();
        properties.load(fileInputStream);

        //A. reading the properties from Config.properties files
        //another way => B. is here -> class26/E5ConfigReader.java:6
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("userPassword"));
        System.out.println(properties.getProperty("URL"));
    }
}

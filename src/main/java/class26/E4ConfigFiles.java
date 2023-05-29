package class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {
        //System.getProperty("user.dir") gives the path of the current project
        //e.g. System.currentTimeMillis();
        System.out.println(System.getProperty("user.dir"));

        //we can use Absolute path as well ->F:\sdetJavaBatch16\Files\Config.properties
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        System.out.println(path);

        //passing the path to make stream of -> fileInputStream to load in properties further on
        FileInputStream fileInputStream = new FileInputStream(path);

        //This "Properties" -> special class which knows how this file works
        // like the software tool to read the files
        Properties properties = new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("userName"));
    }
}

package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {

       //instance of the webDriver
        WebDriver driver = new ChromeDriver();

        // driver.get to navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //maximize the screen
        driver.manage().window().maximize();

        //username through textBox
        String userName1 = getProperty("userName");
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys(userName1);

        //password through textBox
        String password = getProperty("userPassword");
        WebElement userPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        userPassword.sendKeys(password);

        //logIn btn
        WebElement logInBtn = driver.findElement(By.xpath("//input[contains(@id, 'btn')]"));
        logInBtn.click();
    }

    /**
     this method name ->  getProperty(String key) &  properties.getProperty(key) are not same
                  DON'T GET CONFUSE ON THOSE TWO, BUT HAS TO NAME AS SAME THOUGH.
     */
   //explanation@dEnd -> accessProperty(String key) Why it has to same name ->getProperty(String key)  {

    public static String getProperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream(Constants.CONFIG_READER_PATH);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
}
/**
 ME:
 this method name ->  getProperty(String key) &  properties.getProperty(key) are not same
 is it true ?

 ChatGPT:
 No, that statement is not true. The method name getProperty(String key) in the E2ConfigReader class and the
 properties.getProperty(key) statement inside the method are referring to the same concept.
 In the E2ConfigReader class, the getProperty(String key) method is defined to retrieve a property value from
 the properties file. It takes a key as a parameter, which is used to identify the specific property value to
 be retrieved.
 Inside the getProperty method, the properties.getProperty(key) statement is used to fetch the value associated
 with the provided key from the Properties object. The getProperty method of the Properties class retrieves the
 property value corresponding to the given key.
 So, both the method name getProperty(String key) and the properties.getProperty(key) statement are used for the
 same purpose, which is to retrieve a property value from the properties file using a key.

 ME:
 concept is same I get it , but method name has to be same ?

 ChatGPT:
 Yes, in Java, the method name has to be the same as the method signature when you define a method. The method
 signature includes the method name and the parameters (their types and order).
 In the case of the getProperty method, its signature is getProperty(String key), which means the method name is
 getProperty, and it takes a single parameter of type String with the name key.
 When you call the method using getProperty("userName") or getProperty("password"), you are passing the respective
 keys as arguments to the method.
 So, the method name has to be the same as declared in the method signature to ensure that the method is correctly
 called and executed.*/
 /*
          public static String accessProperty(String key) throws IOException {
            FileInputStream fis = new FileInputStream(Constants.CONFIG_READER_PATH);
            Properties properties = new Properties();
            properties.load(fis);
            return properties.getProperty(key);
 }
 */
/**
 ME:
 but it works like this with diff name too , how ?

 ChatGPT:
 In Java, the name of the method itself is not directly tied to its functionality or how it behaves. The name
 of the method is used to identify and invoke the method when it is called.
 In your example, you have a method named accessProperty(String key), which has the same implementation as the
 getProperty(String key) method you mentioned earlier. As long as the method signature (including the return type,
 name, and parameters) remains the same, the method can be called and used interchangeably with the desired
 functionality.
 The reason it works with a different method name is that the code inside the method remains the same, including
 loading the properties file, fetching the desired property value, and returning it. So, the method is still
 performing the intended task regardless of the name you choose to give it.

 However, it is generally good practice to use meaningful and descriptive names for your methods to improve code
 readability and maintainability. Naming methods appropriately helps other developers understand the purpose and
 behavior of the method without needing to dive into the implementation details.
  */
package class28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E9Finally {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //saves the resources by  stopping opening the browser multiple time
        //otherwise it will occupy a lot of ram & soon crashes
       try {
           driver.get("https://google.com");
           driver.findElement(By.xpath("dsffkacngjofj"));
       }finally {
           driver.close();
       }

    }
}

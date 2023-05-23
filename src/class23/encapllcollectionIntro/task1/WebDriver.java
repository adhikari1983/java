/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */

package class23.encapllcollectionIntro.task1;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open ChromeDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close ChromeDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("max Chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("find Chrome element");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open FireFoxDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close FireFoxDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("max FireFox window");
    }

    @Override
    public void findElement() {
        System.out.println("find FireFox element");
    }
}
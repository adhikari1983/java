package class22.abstractfinal.seleniumex;

public abstract class WebDriver {
    abstract void openBrowser();

    abstract void loadUrl(String url);

    abstract void performTesting();

    abstract void closeBrowser();
}

class ChromeDriver extends  WebDriver {

    @Override
    void openBrowser() {
        System.out.println("Opening Google chrome.");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("Loading website on Google chrome." + url);
    }

    @Override
    void performTesting() {
        System.out.println("Testing the webpage on Google chrome.");
    }

    @Override
    void closeBrowser() {

    }
}
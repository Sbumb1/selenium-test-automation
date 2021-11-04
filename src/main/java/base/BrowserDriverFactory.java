package base;

import constants.URLs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserDriverFactory {

    public WebDriver createDriver(String browser,WebDriver driver){

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("msedge")){
            System.setProperty("webdriver.edge.driver", "C:\\Program Files\\selenium\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to(URLs.getMainpageUrl());

        return driver;
    }
}

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    public BaseTest(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod(alwaysRun = true)
    public void goToEmagMainPage(){
        BrowserDriverFactory browserDriverFactory = new BrowserDriverFactory();
        browserDriverFactory.createDriver("chrome" ,this.driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        System.out.println("Close browser");
        driver.close();
    }
}

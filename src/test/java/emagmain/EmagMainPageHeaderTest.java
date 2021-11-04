package emagmain;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.EmagMainPageHeader;

public class EmagMainPageHeaderTest extends BaseTest {

    WebDriver driver;
    BaseTest baseTest;

    public EmagMainPageHeaderTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void beforeTest(){
        BaseTest baseTest = new BaseTest(driver);
        baseTest.goToEmagMainPage();
    }

    @Test
    public void searchForProduct(){
         EmagMainPageHeader mainPage = new EmagMainPageHeader(driver);
         mainPage.searchForProduct();
         baseTest = new BaseTest(driver);
         baseTest.closeBrowser();
    }
}

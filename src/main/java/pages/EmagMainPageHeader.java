package pages;

import base.BasePage;
import constants.Inputs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmagMainPageHeader extends BasePage {

    WebDriver webDriver;


    @FindBy(how = How.CSS,using = "input#searchboxTrigger")
    WebElement searchField;

    @FindBy(how = How.CSS, using = ".searchbox-submit-button .em-search")
    WebElement searchButton;

    public EmagMainPageHeader(WebDriver driver){
        super(driver);
        this.webDriver = driver;
        PageFactory.initElements(webDriver ,this);
    }

    @Step("searchForProduct")
    public void searchForProduct(){
//        this.searchField.sendKeys(Inputs.getProductName());
//        this.searchButton.click();

        BasePage.typeSomething(Inputs.getProductName() ,this.searchField);
        BasePage.click(this.searchButton);
    }
}

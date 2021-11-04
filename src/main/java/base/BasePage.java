package base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openUrl(String url){
        driver.get(url);
    }

    protected static void click(WebElement element){
        if(element.isDisplayed()){
            element.click();
        }else {
            throw new NoSuchElementException("Element was not found");
        }
    }

    protected static void typeSomething(String text , WebElement element){
        if(element.isDisplayed()){
            element.sendKeys(text);
        }else {
            throw new NoSuchElementException("Element was not found");
        }
    }

    protected static boolean visibleElement(WebElement element){
        if(element.isDisplayed()){
            return element.isDisplayed();
        }else {
            throw new NoSuchElementException("Element was not found");
        }
    }
}

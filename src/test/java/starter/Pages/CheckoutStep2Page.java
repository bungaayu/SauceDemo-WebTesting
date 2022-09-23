package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class CheckoutStep2Page extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By finishButton = By.id("finish");

    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
}

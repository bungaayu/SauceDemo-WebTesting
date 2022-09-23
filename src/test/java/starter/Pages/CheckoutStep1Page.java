package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class CheckoutStep1Page extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By fieldFirstName = By.id("first-name");
    private final By fieldLastName = By.id("last-name");
    private final By fieldPostalCode = By.id("postal-code");
    private final By continueButton = By.id("continue");
    public void inputFirstName(String firstname){
        driver.findElement(fieldFirstName).sendKeys(firstname);
    }
    public void inputLastName(String lastname){
        driver.findElement(fieldLastName).sendKeys(lastname);
    }
    public void inputPostalCode(String postalcode){
        driver.findElement(fieldPostalCode).sendKeys(postalcode);
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
}

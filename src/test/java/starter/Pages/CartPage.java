package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class CartPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By checkoutButton = By.cssSelector("#checkout");
    private final By removeButton = By.id("remove-sauce-labs-fleece-jacket");
    private final By continueShopping = By.id("continue-shopping");

    public void ClickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void ClickRemoveButton(){
        driver.findElement(removeButton).click();
    }
    public void ClickContinueShopping(){
        driver.findElement(continueShopping).click();
    }
}

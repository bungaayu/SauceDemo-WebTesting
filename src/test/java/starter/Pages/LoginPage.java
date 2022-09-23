package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject{
    @Managed
    WebDriver driver = getDriver(); //connect ke web browser kita

    //By adalah tipe data
    private final By fieldUsername = By.id("user-name");
    private final By fieldPassword = By.id("password");
    private final By loginButton = By.id("login-button");
    //private By logincredentials = By.id("login_credentials");

    public void InputUsername(String username){
        driver.findElement(fieldUsername).sendKeys(username);
    }
    public void InputPassword(String password){
        driver.findElement(fieldPassword).sendKeys(password);
    }
    public void ClickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
}

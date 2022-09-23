package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://www.saucedemo.com/")
public class InventoryPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By addButton = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    private final By removeButton = By.cssSelector("#remove-sauce-labs-fleece-jacket");
    private final By cartButton = By.cssSelector("#shopping_cart_container > a");
    private final By sortingDropdown = By.className("product_sort_container");
    private final By sortingActive = By.className("active_option");

    public void ClickAddButton(){
        driver.findElement(addButton).click();
    }
    public boolean isRemoveDisplayed(){
        return driver.findElement(removeButton).isDisplayed();
    }
    public void ClickCartButton(){
        driver.findElement(cartButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void selectSortBy(String sortBy){
        Select dropdown = new Select(driver.findElement(sortingDropdown));
        dropdown.selectByVisibleText(sortBy);
    }
    public String getSortingActive(){
        return driver.findElement(sortingActive).getAttribute("innerHTML");
    }
}




//    private final By cartIcon = By.cssSelector("#shopping_cart_container > a"); //tombol cart
//    private final By headerTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span"); //judul "PRODUCTS"

//    public boolean isCartVisible(){ //cek apakah cartIcon ada
//        return driver.findElement(cartIcon).isDisplayed();
//    }
//    public String getHeaderTitle(){ //cek apakah tulisan PRODUCTS sudah sesuai
//        return driver.findElement(headerTitle).getText();
//    }
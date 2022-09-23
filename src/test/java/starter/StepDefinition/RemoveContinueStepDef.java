package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;

import static org.junit.Assert.*;

public class RemoveContinueStepDef {
    InventoryPage inventoryPage;
    CartPage cartPage;
    LoginPage loginPage;
    @When("I click Cart icon then i redirected to cart page")
    public void IClickCartIconThenIRedirectedToCartPage(){
        inventoryPage.ClickCartButton();
        assertEquals("https://www.saucedemo.com/cart.html", inventoryPage.getUrl());
    }
    @And("I click button remove")
    public void IClickButtonRemove(){
        cartPage.ClickRemoveButton();

    }
    @And("I click Continue Shopping button")
    public void IClickContinueShoppingButton(){
        cartPage.ClickContinueShopping();
        assertEquals("https://www.saucedemo.com/inventory.html",loginPage.getUrl());
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

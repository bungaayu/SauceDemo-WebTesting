package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;

import static org.junit.Assert.*;

public class TestFiturStepDef {
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    @When("I click sorting by {string}")
    public void IClickSortingBy(String sortBy){
        inventoryPage.selectSortBy(sortBy);
    }
    @Then("item should be sorted by {string}")
    public void ItemShouldBeSortedBy(String sortBy) {
        assertEquals(sortBy, inventoryPage.getSortingActive());
    }
    @When("I click Cart icon and I redirected to cart page")
    public void IClickCartIconAndIRedirectedToCartPage(){
        inventoryPage.ClickCartButton();
        inventoryPage.getUrl();
    }
    @And("I click remove button")
    public void IClickRemoveButton(){
        cartPage.ClickRemoveButton();
    }
    @And("I click continue shopping")
    public void IClickContinueShopping(){
        cartPage.ClickContinueShopping();
        assertEquals("https://www.saucedemo.com/inventory.html",loginPage.getUrl());
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }

}

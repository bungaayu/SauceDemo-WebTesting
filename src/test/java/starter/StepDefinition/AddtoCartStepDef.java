package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;

public class AddtoCartStepDef {
    InventoryPage inventoryPage;

    @When("I click add to cart button on products")
    public void IClickAdd(){
        inventoryPage.ClickAddButton();
    }
    @Then("the product should be added to cart")
    public void TheProductShouldBeAddedtoCart(){
        assertTrue(inventoryPage.isRemoveDisplayed());
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }
    @And("I already add products to cart")
    public void IAlreadyAddProductsToCart(){
        inventoryPage.ClickAddButton();

    }
}

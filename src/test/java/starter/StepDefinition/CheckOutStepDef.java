package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.CheckoutStep1Page;
import starter.Pages.CheckoutStep2Page;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;

public class CheckOutStepDef {
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutStep1Page checkoutStep1Page;
    CheckoutStep2Page checkoutStep2Page;
    @When("I click Cart icon")
    public void IClickCartIcon(){
        inventoryPage.ClickCartButton();
    }
    @Then("I redirected to cart page")
    public void IRedirectedToCartPage(){
        assertEquals("https://www.saucedemo.com/cart.html", inventoryPage.getUrl());
    }
    @When("I click checkout button")
    public void IClickCheckoutButton(){
        cartPage.ClickCheckoutButton();
    }
    @Then("I redirected to checkout step one page")
    public void IRedirectedtoCheckoutStepOnePage(){
        assertEquals("https://www.saucedemo.com/checkout-step-one.html", cartPage.getUrl());
    }
    @When("I input first name {string}")
    public void IInputFirstName(String firstname){
        checkoutStep1Page.inputFirstName(firstname);
    }
    @And("I input last name {string}")
    public void IInputLastName(String lastname){
        checkoutStep1Page.inputLastName(lastname);
    }
    @And("I input postal code {string}")
    public void IInputPostalCode(String postalcode){
        checkoutStep1Page.inputPostalCode(postalcode);
    }
    @And("I click continue button")
    public void IClickContinueButton(){
        checkoutStep1Page.clickContinueButton();
    }
    @Then("I redirected to checkout step two page")
    public void IRedirectedToCheckoutStepTwoPage(){
        assertEquals("https://www.saucedemo.com/checkout-step-two.html", checkoutStep1Page.getUrl());
    }
    @When("I click finish button")
    public void IClickFinishButton(){
        checkoutStep2Page.clickFinishButton();
    }
    @Then("I redirected to checkout complete page")
    public void IRedirectedToCheckoutCompletePage(){
        assertEquals("https://www.saucedemo.com/checkout-complete.html",checkoutStep2Page.getUrl());
    }
}

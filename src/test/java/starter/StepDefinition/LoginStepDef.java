package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;

public class LoginStepDef {
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    @Given("I am already on login page")
    public void IamAlreadyOnLoginPage(){
        loginPage.open();
    }
    @When("I input username {string}")
    public void IInputUsername(String username){
        loginPage.InputUsername(username);
    }
    @And("I input password {string}")
    public void IInputPassword(String password){
        loginPage.InputPassword(password);
    }
    @And("I click login button")
    public void IClickLoginButton(){
        loginPage.ClickLoginButton();
    }
    @Then("I redirected to inventory page")
    public void IRedirectedtoInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html", loginPage.getUrl());
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }

    @Given("I already log in")
    public void IAlreadyLogIn(){
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.ClickLoginButton();
    }
    @Given("I already log in and add one item to cart") //untuk sorting
    public void IAlreadyLogInAndAddOneItemToCart(){
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.ClickLoginButton();
        inventoryPage.ClickAddButton();
        assertTrue(inventoryPage.isRemoveDisplayed());
    }
}





//    @Then("Error message {string}")
//    public void ErrorMessage(String message){
//
//    }
//        assertEquals("PRODUCTS", inventoryPage.getHeaderTitle());
//        assertTrue(inventoryPage.isCartVisible());
package starter.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;

import static org.junit.Assert.*;

public class SortingStepDef {
    InventoryPage inventoryPage;
    LoginPage loginPage;

    @When("I click sort by {string}")
    public void IClickSortBy(String sortBy){
        inventoryPage.selectSortBy(sortBy);
    }
    @Then("item should be sort by {string}")
    public void ItemShouldbeSortBy(String sortBy){
        assertEquals(sortBy, inventoryPage.getSortingActive());
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }

}

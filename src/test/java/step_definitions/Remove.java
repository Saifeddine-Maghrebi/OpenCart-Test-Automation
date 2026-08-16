package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_factory.Cart_page;
import page_factory.SearchAdd_page;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Remove {

    WebDriver driver = Hooks.driver;
    Cart_page cartPage;

    @Given("j ai ajoute des produits a mon panier")
    public void jAiAjouteDesProduitsAMonPanier() {
        // Login handled by @Before("@loggedIn")
        // Adding of products handled by @Before("@productsAdded)
        cartPage = new Cart_page(driver);
    }

    @When("je supprime le produit HTC Touch HD")
    public void jeSupprimeLeProduitHTCTouchHD() {
        cartPage.clickRemoveProdcut2();
    }

    @Then("un seul produit reste présent dans le panier")
    public void unSeulProduitRestePrésentDansLePanier() {

        assertTrue(cartPage.getCartCentent().contains("Nikon D300"));
        assertFalse(cartPage.getCartCentent().contains("HTC Touch HD"));
        System.out.println("le panier contient seulement le produit Nikon D300");
    }


}

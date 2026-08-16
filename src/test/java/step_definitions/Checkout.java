package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_factory.*;

import java.time.Duration;
import static org.junit.Assert.assertTrue;

public class Checkout {
    WebDriver driver = Hooks.driver;
    Cart_page cartPage;
    Checkout_page checkoutPage;

    @Given("j ai ajoute des produits au panier")
    public void jAiAjouteDesProduitsAuPanier() {
        // Login handled by @Before("@loggedIn")
        // Adding of products handled by @Before("@productsAdded)
        cartPage = new Cart_page(driver);
        checkoutPage = new Checkout_page(driver);
    }

    @When("je clique sur Checkout")
    public void jeCliqueSurCheckout() {
        cartPage.clickCheckout();
    }

    @Then("j accede a la page Checkout")
    public void jAccedeALaPageCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        assertTrue(
                wait.until(ExpectedConditions.urlContains("route=checkout/checkout"))
        );
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("input-payment-firstname")
                )
        );
    }

    @And("je saisis un First Name")
    public void jeSaisisUnFirstName() {
        checkoutPage.setFirstName("YOUR FIRSTNAME");
    }

    @And("je saisis un Last Name")
    public void jeSaisisUnLastName() {
        checkoutPage.setLastName("YOUR LASTNAME");
    }

    @And("je saisis une Adresse")
    public void jeSaisisUneAdresse() {
        checkoutPage.setAdress("YOUR ADRESS");
    }

    @And("je saisis une City")
    public void jeSaisisUneCity() {
        checkoutPage.setCity("YOUR CITY");
    }

    @And("je saisis un Post Code")
    public void jeSaisisUnPostCode() {
        checkoutPage.setPostCode("YOUR POSTCODE");
    }

    @And("je selecte une Country")
    public void jeSelecteUneCountry() {
        checkoutPage.setCountry("YOUR COUNTRY");

    }

    @And("je selecte une Region")
    public void jeSelecteUneRegion() {
        checkoutPage.setZone("YOUR REGION");
    }

    @And("je clique sur le premier bouton continue")
    public void jeCliqueSurLePremierBoutonContinue() {
        checkoutPage.clickContinue1();}

    @And("je clique sur le deuxieme bouton Continue")
    public void jeCliqueSurLeDeuxiemeBoutonContinue() {
        checkoutPage.clickContinue2();
    }

    @And("je clique sur le troisieme bouton Continue")
    public void jeCliqueSurLeTroisiemeBoutonContinue() {
        checkoutPage.clickContinue3();
    }

    @And("je coche les Terms & Conditions")
    public void jeCocheLesTermsConditions() {
        checkoutPage.checkTermsBox();
    }

    @And("je clique sur le quatrieme bouton Continue")
    public void jeCliqueSurLeQuatriemeBoutonContinue() {
        checkoutPage.clickContinue4();
    }

    @And("je clique sur Confirm Order")
    public void jeCliqueSurConfirmOrder() {
        checkoutPage.clickConfirm();
    }

    @Then("je suis redirige vers la page Order Confirmation")
    public void jeSuisRedirigeVersLaPageOrderConfirmation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        assertTrue(
                wait.until(
                        ExpectedConditions.urlContains("route=checkout/success")
                )
        );

    }

}

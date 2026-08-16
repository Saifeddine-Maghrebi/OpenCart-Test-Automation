package step_definitions;

import hooks.Hooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_factory.Home_page;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Logout {

    Home_page homePage;

    @Given("je suis connecte a mon compte openCart")
    public void jeSuisConnecteAMonCompteOpenCart() {
        // Login handled by @Before("@loggedIn")
    }

    @When("je clique sur My Account dans le menu")
    public void jeCliqueSurMyAccountDansLeMenu() {
        homePage = new Home_page(Hooks.driver);
        homePage.clickAccountMenu();
    }

    @And("je clique sur Logout")
    public void jeCliqueSurLogout() {
        homePage.clickLogoutMenu();
    }

    @Then("je suis deconnecte et redirigie vers la page logout")
    public void jeSuisDeconnecteEtRedirigieVersLaPageLogout() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        assertTrue(
                wait.until(ExpectedConditions.urlContains("route=account/logout"))
        );
    }

}

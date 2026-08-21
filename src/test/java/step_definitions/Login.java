package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_factory.Home_page;
import page_factory.Login_page;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Login {

    WebDriver driver;
    Login_page loginPage;
    Home_page homePage;

    @Given("je suis sur la Home Page du site OpenCart")
    public void je_suis_sur_la_home_page_du_site_open_cart() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://awesomeqa.com/ui/index.php?route=common/home");
        homePage = new Home_page(driver);
    }

    @When("je navigue vers login page")
    public void jeNavigueVersLoginPage() {
        homePage.clickAccountMenu();
        homePage.clickLoginMenu();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        assertTrue(
                wait.until(ExpectedConditions.urlContains("route=account/login"))
        );
    }

    @And("je saisis mon email")
    public void jeSaisisMonEmail() {
        loginPage = new Login_page(driver);
        loginPage.setEmail("YOUR_EMAIL");
    }

    @And("je saisis mon password")
    public void jeSaisisMonPassword() {
        loginPage.setPassword("YOUR_PASSWORD");
    }

    @And("je clique sur le login button")
    public void jeCliqueSurLeLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("je suis redirigé vers la page de mon compte")
    public void jeSuisRedirigeVersLaPageDeMonCompte() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        assertTrue(
                wait.until(ExpectedConditions.urlContains("route=account/account"))
        );
        driver.quit();
    }


}

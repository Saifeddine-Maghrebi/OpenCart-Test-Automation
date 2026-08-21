package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import page_factory.Home_page;
import page_factory.Login_page;
import page_factory.SearchAdd_page;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before(value = "@loggedIn",order = 1)
    public void setUp(){

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://awesomeqa.com/ui/index.php?route=common/home");

        Home_page homePage = new Home_page(driver);
        Login_page loginPage = new Login_page(driver);

        homePage.clickAccountMenu();
        homePage.clickLoginMenu();

        loginPage.setEmail("YOUR_EMAIL");
        loginPage.setPassword("YOUR_PASSWORD");
        loginPage.clickLoginButton();

    }


    @Before(value = "@productsAdded", order = 2)
    public void addProducts() {

        SearchAdd_page searchAddPage = new SearchAdd_page(driver);

        searchAddPage.searchProduct("Nikon D300");
        searchAddPage.clickAddProduct();

        searchAddPage.searchProduct("HTC Touch HD");
        searchAddPage.clickAddProduct();

        searchAddPage.clickShoppingCart();
    }

    @After
    public void tearDown(){

        if (driver !=null){
            driver.quit();
        }
    }
}

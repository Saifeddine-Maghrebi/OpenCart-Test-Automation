package page_factory;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Home_page {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
    WebElement myAccountMenu;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    WebElement loginMenu;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    WebElement logoutMenu;

    public Home_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickAccountMenu(){
        myAccountMenu.click();
    }

    public void clickLoginMenu(){
        loginMenu.click();
    }

    public void clickLogoutMenu(){
        logoutMenu.click();
    }

}

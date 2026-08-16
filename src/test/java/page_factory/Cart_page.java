package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cart_page {

    WebDriver driver;

    @FindBy(css = "#content > form > div > table")
    WebElement cartTable;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")
    WebElement removeProduct2;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
    WebElement checkout;

    public Cart_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getCartCentent(){
        return cartTable.getText();
    }

    public void clickRemoveProdcut2(){
        removeProduct2.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> !cartTable.getText().contains("HTC Touch HD"));
    }

    public void clickCheckout(){
        checkout.click();
    }

}

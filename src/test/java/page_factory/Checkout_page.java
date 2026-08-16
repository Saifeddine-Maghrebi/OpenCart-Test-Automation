package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkout_page {

    WebDriver driver;

    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    @FindBy(id = "input-payment-address-1")
    WebElement adress;
    @FindBy(id = "input-payment-city")
    WebElement city;
    @FindBy(id = "input-payment-postcode")
    WebElement postCode;
    @FindBy(id = "input-payment-country")
    WebElement country;
    @FindBy(id = "input-payment-zone")
    WebElement zone;

    @FindBy(id = "button-payment-address")
    WebElement continue1;
    @FindBy(id = "button-shipping-address")
    WebElement continue2;
    @FindBy(id = "button-shipping-method")
    WebElement continue3;
    @FindBy(xpath = "//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
    WebElement termsBox;
    @FindBy(id = "button-payment-method")
    WebElement continue4;
    @FindBy(id = "button-confirm")
    WebElement confirm;

    public Checkout_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setFirstName(String firstname) {
        firstName.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void setAdress(String adresse) {
        adress.sendKeys(adresse);
    }

    public void setCity(String cityname) {
        city.sendKeys(cityname);
    }

    public void setPostCode(String postcode) {
        postCode.sendKeys(postcode);
    }

    public void setCountry(String countryElement) {
        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText(countryElement);
    }

    public void setZone(String regionElement) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> {
            Select select = new Select(zone);
            return select.getOptions().size() > 1;
        });

        Select region = new Select(zone);
        region.selectByVisibleText(regionElement);
    }

    public void clickContinue1(){
        continue1.click();
    }

    public void clickContinue2(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continue2));
        continue2.click();
    }

    public void clickContinue3(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continue3));
        continue3.click();
    }

    public void checkTermsBox(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(termsBox));
        termsBox.click();
    }

    public void clickContinue4(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continue4));
        continue4.click();
    }

    public void clickConfirm(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(confirm));
        confirm.click();
    }


}

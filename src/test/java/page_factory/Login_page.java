package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    WebDriver driver;
    @FindBy(id = "input-email")
    WebElement e_mail;
    @FindBy(id="input-password")
    WebElement passWord;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    WebElement loginButton;

    public Login_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setEmail(String email) {
        e_mail.sendKeys(email);
    }

    public void setPassword(String password) {
        passWord.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}

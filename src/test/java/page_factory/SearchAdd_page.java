package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAdd_page {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")
    WebElement addProduct;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a")
    WebElement shoppingCart;

    public SearchAdd_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void searchProduct(String product){
        searchField.clear();
        searchField.sendKeys(product);
        searchButton.click();
    }

    public void clickAddProduct(){
        addProduct.click();
    }

    public void clickShoppingCart(){
        shoppingCart.click();
    }



}

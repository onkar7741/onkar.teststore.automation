package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[text()='Login or register']")
	private WebElement loginOrRegButton;
	
	@FindBy(xpath = "//a[@href='https://automationteststore.com/index.php?rt=product/category&path=58']")
	private WebElement menCategory;
	
	@FindBy(xpath = "//div[@class='pricetag jumbotron']//a[@href='https://automationteststore.com/index.php?rt=product/product&product_id=78']")
	private WebElement randomProduct;
	
	@FindBy(xpath = "//a[@class='cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//span[@class='bgnone']")
	private WebElement productNameMain;
	
	
	public void clickOnLoginOrRegButton() {
		loginOrRegButton.click();
	}
	
	public void selectMenCategory() {
		menCategory.click();
	}
	
	public void addProductToTheCart() {
		randomProduct.click();
		addToCart.click();
	}
}

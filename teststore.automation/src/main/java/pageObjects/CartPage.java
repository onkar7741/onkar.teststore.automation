package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	
	@FindBy(id = "cart_checkout1")
	private WebElement cartCheckoutButton;
	
	@FindBy(id = "cart_update")
	private WebElement cartUpdateButton;
	
	@FindBy(xpath = "//td[@class='align_left']//a")
	private WebElement cartProductName;
	
	
	
	public void checkoutProductsInCart() {
		cartCheckoutButton.click();
		
	}
	
	public void clickOnUpdate() {
		cartUpdateButton.click();
	}
	
}

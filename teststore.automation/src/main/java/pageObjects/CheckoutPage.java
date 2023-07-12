package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id = "checkout_btn")
	private WebElement confirmOrder;
	
	@FindBy(xpath = "//span[@class='maintext']")
	private WebElement orderConfirmMsg;
	
	@FindBy(xpath = "//a[@class='checkout_heading']")
	private WebElement checkoutProductName;
	
	
	
	public void confirmOrder() {
		confirmOrder.click();
	}
	
	public boolean orderConfirmMessage() {
		return orderConfirmMsg.isDisplayed();
	}

	public String getProductNameFromCheckout() {
		return checkoutProductName.getText();
	}
	
}

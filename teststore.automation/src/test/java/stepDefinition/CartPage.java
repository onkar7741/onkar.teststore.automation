package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import utilities.TestContext;

public class CartPage {

	WebDriver driver;
	public pageObjects.CartPage cartpage;
	public TestContext testcontext;
	
	public CartPage(TestContext testcontext) throws IOException {
		this.testcontext = testcontext;
		this.driver = testcontext.testbase.webDriverManager();
		this.cartpage =testcontext.pageobjectmanager.getCartPage();
	}
	
	@When("Checkout order")
	public void checkout_order() {
	    cartpage.checkoutProductsInCart();
	}
	
}

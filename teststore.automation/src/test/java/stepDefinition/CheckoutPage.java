package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import utilities.TestContext;

public class CheckoutPage {

	WebDriver driver;
	public TestContext testcontext;
	public pageObjects.CheckoutPage checkoutpage;
	public HomePage homepage;
	
	public CheckoutPage(TestContext testcontext) throws IOException {
		this.testcontext = testcontext;
		this.driver = testcontext.testbase.webDriverManager();
		this.checkoutpage = testcontext.pageobjectmanager.getCheckoutPage();
		this.homepage = testcontext.pageobjectmanager.getHomePage();
	}
	
	@Then("Order should be placed")
	public void order_should_be_placed() {
	    checkoutpage.confirmOrder();
	}
	
	@And("Proper message should be displyed with order id")
	public void proper_message_should_be_displyed_with_order_id() {
		assertEquals(checkoutpage.orderConfirmMessage(),true);
	}
	
	@Then("Same product should be available on checkout page")
	public void same_product_should_be_available_on_checkout_page() {
	    assertEquals(checkoutpage.getProductNameFromCheckout(),"ck IN2U Eau De Toilette Spray for Him");
	}
}

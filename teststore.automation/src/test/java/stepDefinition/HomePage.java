package stepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import utilities.TestContext;

public class HomePage {

	WebDriver driver;
	public TestContext testcontext;
	public pageObjects.HomePage homepage;
	
	public HomePage(TestContext testcontext) throws IOException {
		this.testcontext = testcontext;
		this.driver = testcontext.testbase.webDriverManager();
		this.homepage = testcontext.pageobjectmanager.getHomePage();
	}
	
	
	@When("User selects category")
	public void user_selects_category() {
	    homepage.selectMenCategory();
	}
	
	@And("Add the product to the cart")
	public void add_the_product_to_the_cart() {
		homepage.addProductToTheCart();
	}
	
}

package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

public class PageObjectsManager {

	public WebDriver driver;
	public HomePage homepage;
	public LoginPage loginpage;
	public RegisterPage registerpage;
	public CartPage cartpage;
	public CheckoutPage checkoutpage;
	
	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		homepage = new HomePage(driver);
		return homepage;
	}
	
	public LoginPage getLoginPage() {
		loginpage = new LoginPage(driver);
		return loginpage;
	}
	
	public RegisterPage getRegisterPage() {
		registerpage = new RegisterPage(driver);
		return registerpage;
	}
	
	public CartPage getCartPage() {
		cartpage = new CartPage(driver);
		return cartpage;
	}
	
	public CheckoutPage getCheckoutPage() {
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}
}

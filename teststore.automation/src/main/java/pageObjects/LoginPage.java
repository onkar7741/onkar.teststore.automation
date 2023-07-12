package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id = "loginFrm_loginname")
	private WebElement loginNameInput;
	
	@FindBy(id = "loginFrm_password")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[contains(text(),' My Account')]")
	private WebElement loginSuccessMsg;
	
	@FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
	private WebElement loginErrorMsg;
	
	@FindBy(xpath = "//button[@title='Continue']")
	private WebElement registerButton;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	private WebElement forgotPasswordNav; 
	
	@FindBy(xpath = "//a[text()='Forgot your login?']")
	private WebElement forgotLoginNameNav;
	
	@FindBy(id = "forgottenFrm_loginname")
	private WebElement forgotLoginName;
	
	@FindBy(id = "forgottenFrm_email")
	private WebElement forgotEmail;
	
	@FindBy(id = "forgottenFrm_lastname")
	private WebElement forgotLastName;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement forgetSuccessMsg;
	
	@FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
	private WebElement forgetErrorMsg;
	
	@FindBy(xpath = "//button[@title='Continue']")
	private WebElement forgotButton;
	
	
	
	
	public void enterLoginName(String login) {
		loginNameInput.sendKeys(login);
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean loginSuccessMsg() {
		return loginSuccessMsg.isDisplayed();
	}
	
	public boolean loginErrorMsg() {
		return loginErrorMsg.isDisplayed();
	}
	
	public void clickOnRegisterButton() {
		registerButton.click();
	}
	
	public void clickOnForgotPassword() {
		forgotPasswordNav.click();
	}
	
	public void clickOnForgotLoginName() {
		forgotLoginNameNav.click();
	}
	
	public boolean forgetSeccessMsg() {
		return forgetSuccessMsg.isDisplayed();
	}
	
	public boolean forgetErrorMsg() {
		return forgetErrorMsg.isDisplayed();
	}
	
	public void forgotButton() {
		forgotButton.click();
	}
	
	public void enterLoginNameOnForgot(String login) {
		forgotLoginName.sendKeys(login);
	}
	
	public void enterLastNameOnForgot(String lname) {
		forgotLastName.sendKeys(lname);
	}
	
	public void enterEmailOnForgot(String email) {
		forgotEmail.sendKeys(email);
	}
	
	public boolean onLoginPage() {
		return loginButton.isDisplayed();
	}
}

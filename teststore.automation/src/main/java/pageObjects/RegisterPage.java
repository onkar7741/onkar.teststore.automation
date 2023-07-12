package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "AccountFrm_firstname")
	private WebElement firstNameInput;
	
	@FindBy(id = "AccountFrm_lastname")
	private WebElement lastNameInput;
	
	@FindBy(id = "AccountFrm_email")
	private WebElement emailInput;
	
	@FindBy(id = "AccountFrm_address_1")
	private WebElement address1Input;
	
	@FindBy(id = "AccountFrm_city")
	private WebElement cityInput;
	
	@FindBy(id = "AccountFrm_zone_id")
	private WebElement stateSelection;
	
	@FindBy(id = "AccountFrm_postcode")
	private WebElement zipCodeInput;
	
	@FindBy(id = "AccountFrm_country_id")
	private WebElement countrySelection;
	
	@FindBy(id = "AccountFrm_loginname")
	private WebElement loginNameInput;
	
	@FindBy(id = "AccountFrm_password")
	private WebElement passwordInput;
	
	@FindBy(id = "AccountFrm_confirm")
	private WebElement passwordConfirmInput;

	@FindBy(id = "AccountFrm_agree")
	private WebElement privacyPolicy;

	@FindBy(xpath = "//button[@title='Continue']")
	private WebElement regButton;
	
	@FindBy(xpath = "//p[contains(text(),'Congratulations!')]")
	private WebElement regMessage;
	
	@FindBy(xpath = "//div[@class='alert alert-error alert-danger']")
	private WebElement errorMessage;
	
	public void enterFirstName(String fname) {
		firstNameInput.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastNameInput.sendKeys(lname);
	}
	
	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void enterFirstAddress(String address) {
		address1Input.sendKeys(address);
	}
	
	public void enterCity(String city) {
		cityInput.sendKeys(city);
	}

	public void selectState(String state) {
		Select select = new Select(stateSelection);
		select.selectByVisibleText(state);
	}
	
	public void enterZipCode(String zip) {
		zipCodeInput.sendKeys(zip);
	}
	
	public void selectCountry(String country) {
		Select select = new Select(countrySelection);
		select.selectByVisibleText(country);
	}
	
	public void enterLoginName(String loginname) {
		loginNameInput.sendKeys(loginname);
	}
	
	public void enterPassword(String pwd) {
		passwordInput.sendKeys(pwd);
	}
	
	public void enterConfirmPassword(String confirmpwd) {
		passwordConfirmInput.sendKeys(confirmpwd);
	}
	
	public void checkPrivacyPolicy() {
		privacyPolicy.click();
	}
	
	public void clickRegisterButton() {
		regButton.click();
	}
	
	public String regMessage() {
		return regMessage.getText();
	}
	
	public boolean errorMessage() {
		return errorMessage.isDisplayed();
	}
}

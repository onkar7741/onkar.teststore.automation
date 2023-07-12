package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.TestContext;

public class RegisterPage {

	WebDriver driver;
	public TestContext testcontext;
	public HomePage homepage;
	public LoginPage loginpage;
	public pageObjects.RegisterPage regpage;
	
	
	public RegisterPage(TestContext testcontext) throws IOException {
		this.testcontext = testcontext;
		this.driver = testcontext.testbase.webDriverManager();
		this.homepage = testcontext.pageobjectmanager.getHomePage();
		this.loginpage = testcontext.pageobjectmanager.getLoginPage();
		this.regpage = testcontext.pageobjectmanager.getRegisterPage();
	}
	
	
	@Given("User navigates to the register page")
	public void user_navigates_to_the_register_page() {
	    homepage.clickOnLoginOrRegButton();
	    loginpage.clickOnRegisterButton();
	}
	
	@When("User enters required data")
	public void user_enters_required_data(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		regpage.enterFirstName(data.get(0).get(0));
		regpage.enterLastName(data.get(0).get(1));
		regpage.enterEmail(data.get(0).get(2));
		regpage.enterFirstAddress(data.get(0).get(3));
		regpage.enterCity(data.get(0).get(4));
		regpage.selectCountry(data.get(0).get(7));
		regpage.selectState(data.get(0).get(5));
		regpage.enterZipCode(data.get(0).get(6));
		regpage.enterLoginName(data.get(0).get(8));
		regpage.enterPassword(data.get(0).get(9));
		regpage.enterConfirmPassword(data.get(0).get(10));
		regpage.checkPrivacyPolicy();;
	}
	
	@And("Submit it")
	public void submit_it() {
	    regpage.clickRegisterButton();
	}
	
	@Then("Account should be created successfully")
	public void account_should_be_created_successfully() {
	    assertEquals(regpage.regMessage(), "Congratulations! Your new account has been successfully created!");
	}
	
	@Then("Error message should appear about valid format")
	public void error_message_should_appear_about_valid_format() {
		assertEquals(regpage.errorMessage(), true);
	}
	
	@Then("Proper error message should appear about the empty data")
	public void proper_error_message_should_appear_about_the_empty_data() {
		assertEquals(regpage.errorMessage(), true);
	}
	
	@Then("Proper error message should appear about email address")
	public void proper_error_message_should_appear_about_email_address() {
		assertEquals(regpage.errorMessage(), true);
	}
	
	@Then("Proper error message should appear about login name")
	public void proper_error_message_should_appear_about_login_name() {
		assertEquals(regpage.errorMessage(), true);
	}
	
}

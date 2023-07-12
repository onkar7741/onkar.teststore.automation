package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import utilities.TestContext;

public class LoginPage {

	WebDriver driver;
	public TestContext testcontext;
	public pageObjects.LoginPage loginpage;
	public HomePage homepage;
	
	public LoginPage(TestContext testcontext) throws IOException {
		this.testcontext = testcontext;
		this.driver = testcontext.testbase.webDriverManager();
		this.loginpage = testcontext.pageobjectmanager.getLoginPage();
		this.homepage = testcontext.pageobjectmanager.getHomePage();
	}
	
	
	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
	    homepage.clickOnLoginOrRegButton();
	}
	
	@Given("User navigates to the forget password")
	public void user_navigates_to_the_forget_password() {
	    loginpage.clickOnForgotPassword();
	}
	
	@Given("User navigates to the forget login name")
	public void user_navigates_to_the_forget_login_name() {
	    loginpage.clickOnForgotLoginName();
	}
	
	@When("User enters login name and password")
	public void user_enters_login_name_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		loginpage.enterLoginName(data.get(0).get(0));
		loginpage.enterPassword(data.get(0).get(1));
	}
	
	@When("User provides login name and email")
	public void user_provides_login_name_and_email(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		loginpage.enterLoginNameOnForgot(data.get(0).get(0));
		loginpage.enterEmailOnForgot(data.get(0).get(1));
	}
	
	@When("User provides last name and email")
	public void user_provides_invalid_last_name_or_email(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		loginpage.enterLastNameOnForgot(data.get(0).get(0));
		loginpage.enterEmailOnForgot(data.get(0).get(1));
	}
	
	@When("User did not enter any data")
	public void user_did_not_enter_any_data() {
		//no data is passed in this step
	}
	
	
	@And("Clicks on login button")
	public void clicks_on_login_button() {
	   loginpage.clickOnLoginButton();
	}
	
	@And("Submit the data")
	public void submit_the_data() {
		loginpage.forgotButton();
	}
	
	@Then("User should login successfully")
	public void user_should_login_successfully() {
	    assertEquals(loginpage.loginSuccessMsg(), true);
	}
	
	@Then("Proper error message should be displayed")
	public void proper_error_message_should_be_displayed() {
		assertEquals(loginpage.loginErrorMsg(), true);
	}
	
	@Then("Proper error message should be displayed about invalid credentials")
	public void proper_error_message_should_be_displayed_about_invalid_credentials() {
		assertEquals(loginpage.loginErrorMsg(), true);
	}
	
	@Then("Success message should appear about login name")
	public void success_message_should_appear_about_login_name() {
	    assertEquals(loginpage.forgetSeccessMsg(),true);
	}

	@Then("Success message should appear about password")
	public void success_message_should_appear_about_password() {
		assertEquals(loginpage.forgetSeccessMsg(),true);
	}
	
	@Then("Proper error message should appear about invalid credentials")
	public void proper_error_message_should_appear_about_invalid_credentials() {
	    assertEquals(loginpage.forgetErrorMsg(), true);
	}

	@Then("User should navigate to login page")
	public void user_should_navigate_to_login_page() {
		assertEquals(loginpage.onLoginPage(),true);
	}
}

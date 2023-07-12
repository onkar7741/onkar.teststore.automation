package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import managers.PageObjectsManager;

public class TestContext {

	public WebDriver driver;
	public PageObjectsManager pageobjectmanager;
	public TestBase testbase;
	
	public TestContext() throws IOException {
		
		testbase = new TestBase();
		driver = testbase.webDriverManager();
		pageobjectmanager = new PageObjectsManager(driver);
	}
	
}

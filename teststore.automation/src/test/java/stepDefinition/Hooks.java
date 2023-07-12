package stepDefinition;

import java.io.IOException;
import io.cucumber.java.After;
import utilities.TestContext;

public class Hooks {

	TestContext testcontext;

	public Hooks(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	@After
	public void afterEachScenario() throws IOException {
		testcontext.testbase.webDriverManager().quit();
	}


}

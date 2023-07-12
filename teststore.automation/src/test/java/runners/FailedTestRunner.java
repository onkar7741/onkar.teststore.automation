package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = "@target/Failed_Tests.txt",
			glue = "stepDefinition",
			monochrome = true,
			dryRun = false,
			tags = "",
			plugin = {"pretty","html:target/Report.html"}
			)

public class FailedTestRunner extends AbstractTestNGCucumberTests {
	
}

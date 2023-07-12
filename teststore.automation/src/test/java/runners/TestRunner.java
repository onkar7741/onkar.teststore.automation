package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue = "stepDefinition",
		monochrome = true,
		dryRun = false,
		tags = "",
		//These are the tags which can be used to run specific tests - @E2ETest,@LoginTest,@RegisterTest,@ValidationTest
		plugin = {"pretty","html:target/Report.html",
				"rerun:target/Failed_Tests.txt"}
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}

package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Feature/LoginFeature.feature",
		glue     =  "stepDefinition",
		dryRun   =  false , //will check if all features are implemented in step definitions or not
		monochrome = true, // to make sure the output is in readable format
		plugin     = {"pretty","html:target/cucumber-reports/reports1.html"}			
		
		)


public class LoginTestRunner {

	// this class  will be empty
}

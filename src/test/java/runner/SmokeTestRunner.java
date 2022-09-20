package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				plugin="pretty",
				monochrome=true,
				features="D:\\EveningBatchAUG2022Project\\Flipkart\\src\\test\\resources\\Businee_Logic",
				tags="@SmokeTest",
				glue="cucumbermap"
				
				
		)



public class SmokeTestRunner {

}
